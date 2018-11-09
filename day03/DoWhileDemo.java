class DoWhileDemo 
{
	public static void main(String[] args) 
	{
		//while 与 do while 对比

		int x = 3;
		//while
		while (x<3)
		{
			System.out.println("x="+x);
		}

		//do while:无论条件是否满足，循环体至少执行一次。
		do
		{
			System.out.println("x="+x);
		}
		while (x<3);

		
		
		
		System.out.println("Hello World!");
	}
}
