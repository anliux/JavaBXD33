class ThreadTest
{
	public static void main(String[] args) 
	{
		/*
		new Thread(){
			public void run(){
				for (int x=0; x<40; x++)
				{
					System.out.println(Thread.currentThread().getName()+"....X...."+x);
				}
			}
		}.start();

		Runnable r = new Runnable(){
			public void run(){
				for (int x=0; x<40; x++)
				{
					System.out.println(Thread.currentThread().getName()+"....Y...."+x);
				}
			}
		}
		
		new Thread(r).start();
		
		for (int x=0; x<40; x++)
		{
			System.out.println(Thread.currentThread().getName()+"....Z...."+x);
		}

		System.out.println("Hello World!");
		*/

		//面试题：
		new Thread(new Runnable(){
			public void run()
			{
				System.out.println("runnable run");
			}
		}){
			public void run()
			{
				System.out.println("subthread run");//执行
			}
		}.start();
	}
}


/*
class Thread
{
	private Runnable r;
	Thread(Runnable r)
	{
		this.r = r;
	}
	public void run()
	{
		if(r!=null)
		{
			r.run();
		}
	}
	public void start()
	{
		run();
	}
}

class SubThread extends Thread
{
	public void run()
	{
		System.out.println("subthread run");
	}
}

Runnable r = new Runnable()
{
	public void run()
	{
		System.out.println("runnable run");
	}
}
SubThread t = new SubThread(r);
t.start();
*/