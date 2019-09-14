/*
同步的另一个弊端：
情况之一：
	当线程任务出现了多个同步时（多个锁）时，如果同步中嵌套了其他同步，
	这时容易引发一种现象：死锁
	这种情况能避免就避免

//可能死锁，也可能大和谐了
//Thread-0
synchronized(obj1)
{
	synchronized(obj2){}
}

//Thread-1
synchronized(obj2)
{
	synchronized(obj1){}
}
*/

class Test implements Runnable
{
	private boolean flag;
	Test(boolean flag)
	{
		this.flag = flag;
	}
	public void run()
	{
		if(flag)
		{
			while(true)
			{
				synchronized(MyLock.LOCKA)
				{
					System.out.println("if......locka");
					synchronized(MyLock.LOCKB)
					{
						System.out.println("if......lockb");
					}
				}
			}
		}
		else
		{
			while(true)
			{
				synchronized(MyLock.LOCKB)
				{
					System.out.println("else......lockb");
					synchronized(MyLock.LOCKA)
					{
						System.out.println("else......locka");
					}
				}
			}
		}
	}
}

//定义一个用于存储锁对象类。
class MyLock
{
	public static final Object LOCKA = new Object();
	public static final Object LOCKB = new Object();

}


class DeadLockTest
{
	public static void main(String[] args) 
	{
		//创建两个线程任务
		Test t1 = new Test(true);
		Test t2 = new Test(false);

		Thread t11 = new Thread(t1);
		Thread t22 = new Thread(t2);
		t11.start();
		t22.start();
 	}
}
