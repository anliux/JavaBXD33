class MethodDemo3 
{
	public static void main(String[] args) 
	{
		add(2, 5);

		add(2, 3, 6);

		add(2.4, 1.8);

		printCFB();//为空时打印标准版的功能。

		printCFB(15);//可以超过9的吧，只是显示出来比较不整齐，啊哈。


		System.out.println("Hello World!");
	}

	/*
	
	函数的重载：overlord
	1、函数名定义就是为了描述该功能。
	2、一个类中出现同名函数，只要他们的参数个数或者参数类型不同，就称之为函数的重载（Overload）
	   和返回值类型无关。

	*/

	//两个整数求和的功能
	public static int add(int a, int b)
	{
		return a+b;
	}

	//三个整数求和的功能
	public static int add(int a, int b, int c)
	{
		return a+b+c;
	}

	//两个小数求和的功能
	public static double add(double a, double b)
	{
		return a+b;
	}
	
	//九九乘法表的重载：
	public static void printCFB()
	{
		printCFB(9);//直接调用，提高代码复用性。
	}

	public static void printCFB(int num)
	{
		for (int x = 1; x<=num; x++)
		{
			for (int y = 1; y<=x; y++)
			{
				System.out.print(x+"*"+y+"="+y*x+"\t");
			}
			System.out.println();
		}
	}


}
