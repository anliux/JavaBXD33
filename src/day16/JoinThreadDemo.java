
class Demo implements Runnable
{
	public void run()
	{
		for (int x=1; x<=40; x++)
		{
			System.out.println(Thread.currentThread().getName()+"....."+x);
			Thread.yield();//线程临时暂停。其实释放了执行权，让其他线程有机会获取执行权。
		}
	}
}


class JoinThreadDemo
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		t1.start();
		t2.start();

		//主线程执行到这里，知道t1要加入执行，主线程释放了执行权，执行资格并处于冻结状态。
		//什么时候恢复？等t1线程执行完。
		//注意：释放没有针对性，只是主线程放了执行权，而t1和t2都活着，两个争夺执行权
		//而t1执行完后，主线程就开始加入执行。
		//一般用于临时加入某运算线程。让该线程运算完，程序才会继续执行。
		//try{t1.join();}catch(InterruptedException e){}

		for (int x=1; x<=50; x++)
		{
			System.out.println("main------>"+x);
		}
		System.out.println("over");
	}
}
