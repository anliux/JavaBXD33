/*

static同步函数 使用的锁：不是this，而是字节码文件对象 类名.class

*/



class Ticket implements Runnable
{
	private static int tickets = 100;//这里也相应地加静态
	private Object obj = new Object();
	/*private*/ boolean flag = true;//定一个标记
	public void run()
	{
		if(flag){		
			while(true){
				synchronized(Ticket.class){
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
	public static synchronized void sale()//同步函数（不是特殊函数，只是加了修饰）
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