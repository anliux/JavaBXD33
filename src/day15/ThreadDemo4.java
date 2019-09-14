/*

同步的另一种体现形式：
简化同步代码块为同步函数(例如：public synchronized void sale())

同步函数的锁：this
猜测：是this，因为函数必须被对象调用。

验证：
写一个同步代码块，写一个同步函数
如果同步代码块中的锁对象和同步函数中的锁对象是同一个，就同步了，不会有错误数据
如果不是同一个锁对象，就不同步，就会出现错误数据。
设置两个线程：一个线程在同步代码块中执行，另一个在同步函数中执行。

总结：同步函数使用的锁是this

同步函数和同步代码块的区别：
同步函数使用的锁是固定的this。当线程任务只需要一个同步时完全可以使用同步函数。
同步代码块使用的锁可以是任意对象。当线程任务中需要多个同步时，必须通过锁来区分，这时必须使用同步代码块。
同步代码块较为常用。

*/



class Ticket implements Runnable
{
	private int tickets = 100;
	private Object obj = new Object();
	/*private*/ boolean flag = true;//定一个标记
	public void run()
	{
		if(flag){		
			while(true){
				synchronized(this){
					if(tickets>0){
						try{Thread.sleep(10);}catch(InterruptedException e){/*未写处理方式，后面讲*/}
						System.out.println(Thread.currentThread().getName()+"..obj.."+tickets--);//打印线程名称
					}
				}
			}
		}
		else{
			while(true){
				this.sale();
			}
		}
	}
	public synchronized void sale()//同步函数（不是特殊函数，只是加了修饰）
	{
		if(tickets>0){
			try{Thread.sleep(10);}catch(InterruptedException e){/*未写处理方式，后面讲*/}
			System.out.println(Thread.currentThread().getName()+"..sale.."+tickets--);//打印线程名称
		}
	}
}

class ThreadDemo4
{
	public static void main(String[] args) 
	{
		Ticket t = new Ticket();
		//两个线程的错误数据：出现0号票
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();

		//为防止主线程一瞬间把这几句都执行完导致flag全为false，可以设置一个sleep
		//切换标记之前，让主线程停一会儿，这时就只有一个t1线程在，它就会执行同步代码块。
		try{Thread.sleep(10);}catch(InterruptedException e){}
		//切换标记：
		t.flag = false;

		t2.start();		
	}
}