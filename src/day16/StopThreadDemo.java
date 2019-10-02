//停止演示线程
//notify：正常流程的唤醒
//interrupt：强制唤醒，会抛异常

class Demo implements Runnable
{
	private boolean flag = true;
	public synchronized void run()
	{
		while(flag)
		{
			try
			{
				wait();//t1 t2
			}
			catch (InterruptedException e)

			{
					System.out.println(Thread.currentThread().getName()+"-----"+e.toString());
					changeFlag();//这里直接切换flag
			}

			System.out.println(Thread.currentThread().getName()+"-------->");
		}
		
	}
	//对标记的修改方法
	public void changeFlag()
	{
		flag = false;
	}
}


class StopThreadDemo 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		t1.start();
		t2.start();

		int x = 0;
		while(true)
		{
			if(++x == 50)//条件满足
			{
				//d.changeFlag();//改变线程任务代码的标记，让其他线程也结束
			
				//对t1线程对象进行中断状态的清除，强制让其恢复到运行状态
				//强制：会抛出异常
				t1.interrupt();
				//对t2线程对象进行中断状态的清除，强制让其恢复到运行状态
				t2.interrupt();

				break;//跳出循环，主线程可以结束。
			}
			System.out.println("main---------------->"+x);
		}
		System.out.println("over");
	}
}
