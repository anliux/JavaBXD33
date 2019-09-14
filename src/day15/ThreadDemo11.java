/*
JDK1.5以后提供了多生产多消费的解决方案

在java.util.concurrent.locks软件包中提供相应的解决方案
Lock接口：比同步更厉害，有更多的操作。lock(),-- 获取锁  unlock();-- 释放锁
		  提供了一个更加面向对象的锁，在该锁中，提供了更多的显式的锁操作。
		  可以替代同步。

程序升级到JDK1.5
先把同步改为lock
	unlock要放在try-finally的finally中确保一定会执行到



已经将旧锁替换成新锁，那么锁上的监视器方法（wait，notify，notifyAll）也应该替换成新锁的监视器方法
而jdk1.5中将这些原有的监视器方法封装到了一个Condition对象中。
想要获取监视器方法，需要先获取Condition对象。

Condition对象的出现其实就是替换了Object中的监视器方法。
await();
signal();
signalAll();

将所有的监视器方法替换成了Condition。

功能和ThreadDemo10.java的老程序的功能一样，仅仅是用新的对象，改了写法。
但是问题依旧：效率还是低。
希望本方可以唤醒对方中的一个。
老程序中可以通过两个锁嵌套完成，但是容易引发死锁。

新程序中可以解决这个问题：只用一个锁。
可以在一个锁上加上多个监视器对象。


*/

import java.util.concurrent.locks.*;

//1、描述资源。属性：商品名称和编号。行为：对商品名称赋值，获取商品。
class Resource
{
	private String name;
	private int count=1;
	
	//定义一个锁对象
	private Lock lock = new ReentrantLock();//如果不导包，就得写全名否则报错找不到类
	
	//获取锁上的Condition对象
	//为了解决本方唤醒对方的问题，可以一个锁创建两个监视器对象。
	private Condition produce = lock.newCondition();
	private Condition consume = lock.newCondition();

	//定义标记
	private boolean flag = false;

	//1、提供设置的方法
	public /*synchronized*/ void set(String name)//t1 t2
	{
		//获取锁
		lock.lock();

		//不使用块结构锁就失去了使用同步方法和语句时会出现的锁自动释放。
		//要使用try finally代码块
		try{
			while(flag)
				try{produce.await();}catch(InterruptedException e){} //是在这儿睡了，唤醒后直接顺延继续执行吗。。改if为while
			
			this.name = name + count;
			count++;
			System.out.println(Thread.currentThread().getName()+"....生产者...."+this.name);

			flag = true;
			//执行消费者的唤醒。唤醒一个消费者就哦了。
			consume.signal();
		}
		finally{
			//释放锁
			lock.unlock();
		}
	}

	public /*synchronized*/ void out()//t3 t4
	{
		lock.lock();

		try{
			//if(!flag)
			while(!flag)
				try{consume.await();}catch(InterruptedException e){}

			//flag为true时表示有面包，执行以下消费代码

			System.out.println(Thread.currentThread().getName()+"......消费者......"+this.name);
			//将标记改为false
			flag = false;
			//唤醒生产者
			produce.signal();
		}
		finally{
			lock.unlock();
		}
	}
}

//2、描述生产者
class Producer implements Runnable
{
	private Resource r;

	//生产者一初始化就要有资源，需要将资源传递到构造函数中。
	Producer(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.set("面包");
		}
	}
}

//3、描述消费者
class Consumer implements Runnable
{
	private Resource r;

	//消费者一初始化就要有资源，需要将资源传递到构造函数中。
	Consumer(Resource r)
	{
		this.r = r;
	}
	
	public void run()
	{
		while(true)
		{
			r.out();
		}
	}
}

class  ThreadDemo11
{
	public static void main(String[] args) 
	{
		//1、创建资源对象
		Resource r = new Resource();

		//2、创建线程任务
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);

		//3、创建线程
		//多创建几个3和4
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(pro);
		Thread t3 = new Thread(con);
		Thread t4 = new Thread(con);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

