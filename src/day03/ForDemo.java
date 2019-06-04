class  ForDemo
{
	public static void main(String[] args) 
	{
		//for 与 while ：可实现相同功能；区别的初始化值在循环完毕后是否释放。

		//for：
		for (int x = 1; x<3 ;x++ )
		{
			System.out.println("x="+x);
		}
		//System.out.println("x...."+x);//错误：找不到x。

		//while:
		int y =	1;
		while (y<3)
		{
			System.out.println("y="+y);
			y++;
		}
		System.out.println("y....."+y);

		//for循环完成后，其定义的初始化值的变量在内存中释放，不可用了。
		//while循环完成后，其初始化值仍然可用。

		
		
		
		
		System.out.println("Hello World!");
	}
}
