class WhileDemo 
{
	public static void main(String[] args) 
	{
		/*
		
		循环结构：
		循环语句什么时候用呢？
		当对某些语句需要执行很多次时，就用循环结构。

		死循环的原因：没有告诉程序，执行多少次停下来。
		
		*/
		int x = 1;

		while(x < 3);  //当此处加分号时，计算机反复计算1是否小于3，死循环。

		{
		
			System.out.println("x="+x);
			x++;
		
		}
		
		
		
		System.out.println("Hello World!");
	}
}
