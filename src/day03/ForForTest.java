class ForForTest 
{
	public static void main(String[] args) 
	{
		/*
		需求：在屏幕上显示以下图形
		*****
		****
		***
		**
		*
		思路：
		1、看其图形，发现是由5行组成的。
		2、每一行都有多个星。
		3、有点意思：多行，循环可以搞定。每到一行，里面有多个星。
		   循环内，还需要循环负责每一行的星的个数。
		4、外循环控制行数，内循环控制每一行的个数。

		步骤：
		1、for的嵌套循环。

		代码：

		测试：		
		
		*/
		
		/*
		int z=5;
		for (int x = 1; x<=5; x++)
		{
			for (int y = 1; y<=z; y++)//1-5 1-4 1-3..
			{
				System.out.print("*");
			}
			z--;
			System.out.println();
		}
		*/
		
		
		
		for (int x = 1; x<=5; x++)//外循环是行数，控制好5行即可。
		{
			for (int y = x ; y<=5; y++)//每行个数递减。
			{
				System.out.print("*");
			}
			System.out.println();

		}
		
		System.out.println("-------------");

		/*
		小练习：
		需求：
		*
		**
		***
		****
		*****		
		
		*/
		for (int x = 1; x<=5; x++)
		{
			for (int y = 1 ; y<=x; y++)//1-1, 1-2, 1-3..
			{
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
