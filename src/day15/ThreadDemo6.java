//饿汉式 -- 有共性数据，单条语句，故没有线程安全问题
class Single
{
	private Single(){}
	private static final Single s = new Single();
	public static Single getInstance()
	{
		return s;
	} 
}

//懒汉式：考点
class Single
{
	private Single(){}
	private static Single s = null;
	/*
	并发访问有安全隐患，所以加入同步机制解决线程安全问题
	但是，同步的出现却降低了效率。
	提高效率：减少判断锁的次数，可以通过双重判断的方式。
	*/
	public static void getInstance()
	{
		if(s==null)
		{
			synchronized(Single.class){
				if(s==null)
					s = new Single();
				return s;
			}
		}
	}
}

class Demo implements Runnable
{
	public void run()
	{
		Single.getInstance();
	}
}




class ThreadDemo6
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
