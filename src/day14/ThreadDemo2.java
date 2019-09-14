/*
创建线程的第二种方式：实现Runnable接口
1、定义类，实现Runnable接口：避免了继承Thread类的单继承局限性
2、覆盖接口中的run方法，将线程任务代码定义到run方法中
3、创建Thread类的对象：只有创建Thread类的对象才可以创建线程。
4、将Runnable接口的子类对象作为参数传递给Thread类的构造函数
   因为线程已被封装到Runnable接口的run方法中，而这个方法所属于Runnable接口的子类对象，
   所以将这个子类对象作为参数传递给Thread的构造函数，这样，线程对象创建时，就可以明确要运行的线程的任务。
5、调用Thread类的start方法开启线程

第二种方式实现Runnable接口：
避免了单继承的局限性，所以较为常用。
实现Runnable接口的方式，更加的符合面向对象，线程分为两部分，一部分叫线程对象，一部分是线程任务
继承Thread类：线程对象和线程任务耦合在一起。一旦创建Thread类的子类对象，既是线程对象，又有线程任务。
实现Runnable接口：将线程任务单独分离出来，封装成对象，类型就是Runnable接口类型。
	Runnable接口对线程对象和线程任务进行解耦。
	用Runnable来标明线程任务，用Thread来明确线程对象。


//通过源码的形式讲解一下将Runnable接口的子类对象作为参数传递给Thread构造函数的原因。
class Thread{
	private Runnable target;

	Thread(Runnable target)
	{
		this.target = target;
	}
	public void run(){
		if(target!=null)
			target.run();
	}
	public void start()
	{
		run();
	}
}
Runnable d = new Demo();
Thread t = new Thread(d);
t.start();




*/

class Demo implements Runnable//1、实现Runnable接口
{
	private String name;
	Demo(String name)
	{
		this.name = name;
	}
	//2、覆盖接口Runnable中的run方法
	public void run() 
	{
		for (int x=1; x<=20; x++)
		{
			System.out.println("name="+name+"..."+Thread.currentThread().getName()+"..."+x);
		}
	}
}

class ThreadDemo2 
{
	public static void main(String[] args) 
	{
		//3、创建Runnable子类的对象。注意：它不是线程对象。
		Demo d = new Demo("Demo");
		//4、创建Thread类的对象，将Runnable接口的子类对象作为参数传递给Thread类的构造函数
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		//5、调用Thread类的start方法开启线程
        t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName()+"------->");

	}
}
