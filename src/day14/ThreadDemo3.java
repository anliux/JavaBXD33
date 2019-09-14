/*
案例：售票的例子。

售票的动作需要同时执行，故使用多线程技术。


多线程的安全问题:
发生了线程安全问题，出现了错误的数据0 -1 -2

问题产生的原因：
1、线程任务中在操作共享的数据
2、线程任务操作共享数据的代码有多条（运算有多个）


解决思路：
只要让一个线程在执行线程任务时将多条操作共享数据的代码执行完，
在执行过程中，不要让其他线程参与运算，就可以了。

代码体现：
java中解决此问题通过代码块来完成：
同步代码块synchronized

格式：
synchronized(对象)//对象：相当于锁。火车上的卫生间-->同步锁
{
	//需要被同步的代码。
}

同步代码块的好处：解决了多线程的安全问题。

同步的弊端：降低了程序的性能。
    但是为了安全，可以损失点性能。

同步的前提：(加了同步还没解决问题时从前提分析)
必须保证多个线程在同步中使用的是同一个锁 
	synchronized(new Object())时有几个线程有几把锁
	同步区分：用锁 -- 不同的对象，不同的锁，就是不同的同步
解决了什么问题呢：
	当多线程安全发生时，加入了同步问题依旧时，就要通过这个同步的前提来判断同步是否写正确。

*/
class Ticket implements Runnable
{
	//1、描述票的数量。
	private int tickets = 100;

	//2、售票的动作，这个动作需要被多线程执行，即线程任务代码
	//线程任务中通常都有循环结构。否则没必要多线程。
	private Object obj = new Object();
	public void run()
	{
		while(true)
		{
			synchronized(obj)//参数传入任意对象均可，这里传了上帝
			{
				if(tickets>0)
				{
					//要让线程在这里稍停，模拟问题发生 -- sleep
					//看到了0 -1 -2，这就是传说中的多线程安全问题
					try{Thread.sleep(10);}catch(InterruptedException e){/*未写处理方式，后面讲*/}

					System.out.println(Thread.currentThread().getName()+"...."+tickets--);//打印线程名称
				}
			}
		}
	}
}

class ThreadDemo3
{
	public static void main(String[] args) 
	{
		//1、创建Runnable接口的子类对象
		Ticket t = new Ticket();

		//2、创建四个线程对象，并将Runnable接口的子类对象作为参数传递给Thread构造函数
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		//3、开启四个线程
		//注：多次启动一个线程是非法的 -- IllegalThreadStateException(线程已启动，再启动时）
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
