class BreakDemo 
{
	public static void main(String[] args) 
	{
		/*

		break:使用范围-switch选择语句；循环语句。
		
		*/
		for (int x = 0; x<3; x++)
		{
			if (x == 0)
			{
				break; //不作用于if，只作用于for
			}			
			System.out.println("x="+x);
			
		}
		
		//for嵌套：
		outer: for (int x = 0; x<3; x++)//outer:仅仅是一个标识符。
		{
			inter: for (int y = 0; y<6; y++)
			{
				System.out.println("x="+x);
				break outer;//不写outer，跳出内循环。写了，跳出外循环。
			}
		}
		
		//System.out.println("Hello World!");
	}
}
