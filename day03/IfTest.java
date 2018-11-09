class IfTest 
{
	public static void main(String[] args) 
	{
		/*
		需求：根据用户给定的数值，显示该数值对应的星期。如：2，星期二

		思路：1、咋获取这个数值呢：
				来源有很多，不确定。只要不确定的数值，都用变量存储。只要操作该变量即可。
			  2、数值不确定，如何显示对应的星期呢？
			    那就需要对该数值进行判断。
			  3、咋显示呢？
			    通过输出语句就可以显示在屏幕上。

		步骤：1、定义变量，记录数据
			  2、通过判断结构语句if对该变量进行判断
			  3、根据不同条件，通过输出语句显示不同的结果。
		
		代码：
		
		测试：
			
		*/

		//1、定义变量，记录数据
		int week = 9;

		//2、通过判断结构语句if对该变量进行判断
		if(week == 1)

			//3、根据不同条件，通过输出语句显示不同的结果。
			System.out.println(week+"对应的是星期一");
		else if(week == 2)
			System.out.println(week+"对应的是星期二");
		else if(week == 3)
			System.out.println(week+"对应的是星期三");
		else if(week == 4)
			System.out.println(week+"对应的是星期四");
		else if(week == 5)
			System.out.println(week+"对应的是星期五");
		else if(week == 6)
			System.out.println(week+"对应的是星期六");
		else if(week == 7)
			System.out.println(week+"对应的是星期日");
		else
			System.out.println(week+"没有对应的星期");

		//但一般此类需求不选择if语句

	}
}
