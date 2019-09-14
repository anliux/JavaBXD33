/*
通过代码来演示之前和之后的区别。

在之前的代码中，JVM启动后，必然有一个执行路径（线程）从main方法开始，一直执行到main方法结束。
这个线程在java中称为主线程。

当主线程在这个程序中执行时，如果遇到了循环而导致在指定位置停留时间过长，
无法执行下面的程序。
可不可以实现一个主线程负责执行其中一个循环，由另一个线程负责其他代码的执行，
实现多部分的代码同时执行。
这就是多线程技术可以解决的问题。


该如何创建线程呢？

通过API中的英文Thread的搜索（实在搜不到先去百度搜中文），查到了Thread类
通过阅读Thread类中的描述

创建线程有两种方式：
1、继承Thread类
	1.1 定义一个类继承Thread。
	1.2 重写run方法。
	1.3 创建子类对象，就是创建线程对象。
	1.4 调用start方法，开启线程并让线程执行，同时还会告诉jvm去调用run方法。

为什么要这么做？
继承Thread类：
因为Thread类描述线程事物，具备线程应有的功能。
那为什么不直接创建Thread类的对象呢？
Thread t1 = new Thread();
t1.start();
这么做没有错，但该start调用的是Thread类中的run方法
而这个run方法没有做什么事情，更重要的是，这个run方法中没有定义我们需要让线程执行的代码。

创建线程的目的是什么？
为了建立单独的执行路径，让多部分代码实现同时执行。
也就是说，线程创建并执行需要给定的代码（专业术语：线程的任务）。
对于之前所讲的主线程，它的任务定义在了main函数中。
自定义的线程需要执行的任务都定义在run方法中。
Thread类中的run方法内部的任务并不是我们所需要的，只要重写run方法，
既然Thread类已经定义了线程任务的位置，只要在位置中定义任务代码即可
所以进行了重写run方法的动作。


内存：
多线程执行时，在栈内存中，每一个执行线程都有一片自己所属的栈内存空间，
进行方法的压栈和弹栈。

当执行线程的任务结束了，线程自动就在栈内存中释放了。
当所有的执行线程都结束时，进程就结束了。

获取线程名称：
Thread: currentThread() -- 获取当前线程对象
获取名称：getName();
故：Thread.currentThread().getName();

主线程的名称：main
自定义的线程：Thread-1 线程多个时，数字顺延。Thread-n

*/
class Demo extends Thread//1、继承Thread
{
	private String name;
	Demo(String name)
	{
		this.name = name;
	}
	public void run() //2、重写run方法
	{
		for (int x=1; x<=20; x++)
		{
			System.out.println("name="+name+"..."+Thread.currentThread().getName()+"..."+x);
			//后续加上了获取线程名称
		}
	}
}

class ThreadDemo
{
	public static void main(String[] args) 
	{
		//创建了两个线程对象。开启以后才会执行。
		Demo d1 = new Demo("小强");//主线程负责小强
		Demo d2 = new Demo("旺财");
		//d2.run();
		d2.start();//将d2这个线程开启
		d1.run();
		/*
		面试：线程对象调用run方法和调用start方法的区别？
		调用run方法不开启线程，并让JVM调用run方法，在开启的线程中执行
		调用start方法开启线程，并让JVM调用run方法在开启的线程中执行。
		
		*/
	}
}
