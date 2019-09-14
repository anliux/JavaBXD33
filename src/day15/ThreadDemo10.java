/*
多生产多消费：

问题1：生产了商品没有被消费，同一个商品被消费多次。
Thread-1....生产者....面包840
Thread-3......消费者......面包840
Thread-2......消费者......面包840
Thread-1....生产者....面包841
Thread-3......消费者......面包841
Thread-2......消费者......面包841

被唤醒的线程没有判断标记，造成问题1产生
解决：只要让被唤醒的线程必须判断标记就可以了。
      将if判断标记的方式改为while判断标记

记住：只要是多生产多消费，必须while判断

问题2：while判断后，死锁了。
原因：生产方唤醒了线程池中的生产方的线程。本方唤醒了本方。
解决：希望本方要唤醒对方。没有对应方法，所以，唤醒所有。

仍然有一些小遗憾：
效率低了。
唤醒所有会有点多余。

*/


//1、描述资源。属性：商品名称和编号。行为：对商品名称赋值，获取商品。
class Resource
{
	private String name;
	private int count=1;

	//定义标记
	private boolean flag = false;

	//1、提供设置的方法
	public synchronized void set(String name)//t1 t2
	{
		//if(flag)
		while(flag)
			try{wait();}catch(InterruptedException e){} //是在这儿睡了，唤醒后直接顺延继续执行吗。。改if为while
		
		//flag为false时表示没有面包，执行以下生产代码

		//给成员变量赋值并加上编号。
		this.name = name + count;
		//编号自增
		count++;
		//打印生成了哪个商品
		System.out.println(Thread.currentThread().getName()+"....生产者...."+this.name);

		//将标记改为true
		flag = true;
		//唤醒消费者
		notifyAll();
	}

	public synchronized void out()//t3 t4
	{
		//生产和消费判断的方式相反
		//if(!flag)
		while(!flag)
			try{wait();}catch(InterruptedException e){}

		//flag为true时表示有面包，执行以下消费代码

		System.out.println(Thread.currentThread().getName()+"......消费者......"+this.name);
		//将标记改为false
		flag = false;
		//唤醒生产者
		notifyAll();
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

class  ThreadDemo10
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

