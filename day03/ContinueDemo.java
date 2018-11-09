class ContinueDemo 
{
	public static void main(String[] args) 
	{
		//continue：之作用于循环结构。
		for (int x = 0; x<10; x++)
		{
			//continue;//放这儿输出语句就挂了。
			System.out.println("x="+x);
			continue;//虽然是废话，但是没报错，顺利执行了。
		}

		System.out.println("---------");
		
		//作用：结束本次循环，继续下次循环。
		for (int y = 0; y<10; y++)
		{
			if (y%2==0)
			{
				continue;//不满足条件时，结束本次循环，继续下次循环。
			}
			System.out.println("y="+y);
		}

		System.out.println("----------");
		
		//控制内外循环：
		outer :for (int x = 0; x<6; x++)
		{
			inter:for (int y = 0; y<4; y++)
			{
				System.out.println("x="+x);
				continue outer;//直接继续执行外循环。
			}
		}
		
		//多次循环，定义重复的变量却没有报错，因为是在for里的，用完就释放内存。

		System.out.println("Hello World!");
	}
}
