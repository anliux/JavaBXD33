class  Test
{
	public static void main(String[] args) 
	{
		/*
		需求1：根据用户给定的月份数据，显示对应的季节
			   3 4 5  - 春季
			   6 7 8  - 夏季
			   9 10 11 -秋季
			   12 1 3 - 冬季
		
		思路：1、咋获取数据?不关我事，我只要关注变量。
		      2、对这个数据进行判断。
		步骤：1、定义变量
		      2、定义if语句判断

		代码：
		//常规思路：
		int x = 111;
		if (x==3 || x==4 || x==5)
			System.out.println(x+"是春季");
		else if (x==6 || x==7 || x==8)
			System.out.println(x+"是夏季");
		else if (x==9 || x==10 || x==11)
			System.out.println(x+"是秋季");
		else if (x==12 || x==1 || x==2)
			System.out.println(x+"是冬季");
		else 
			System.out.println(x+"没有对应的季节");
		
		//区间的思路：
		int x = 13;
		if (x>12 || x<1)//冬季不好用区间表示，则先排除其他各种情况
			System.out.println(x+"没有对应的季节");
		else if (x>=3 && x<=5)
			System.out.println(x+"是春季");
		else if (x>=6 && x<=8)
			System.out.println(x+"是夏季");
		else if (x>=9 && x<=11)
			System.out.println(x+"是秋季");
		else
			System.out.println(x+"是冬季");
		*/







		/*
		
		需求2：用switch语句完成季节需求。

		代码：
		int x = 53;
		switch (x)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(x+"是春天");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(x+"是夏天");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(x+"是秋天");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(x+"是冬天");
				break;
			default:
				System.out.println(x+"没有对应的季节");
				break;//可以不写，语句结尾了，也会结束。
			
		}
		*/








		/*
		
		需求3：对于给定的数字26，获取其16进制的表现形式。

		思路：1、啥是十六进制：数据的一种表现形式，优点是更短
				 原理：将二进制中4位为一个16进制位。
			  2、原理就是，对给定的整数进行二进制的每四位获取。
			  3、咋获取4位：其实就是获取4位中的1，可通过&位运算的方式
			  4、而且想要获取下4位：通过对原数据进行无符号右移
		
		步骤：1、定义变量记录该整数
			  2、对该变量进行&运算，获取4位，&4个1，二进制四个1就是15
			  3、对原数据进行无符号右移。
		
		代码：

		int num = 26;//仅考虑数字大小在一个byte即一个八位内，两个4位
		int n1 = num & 15;
		System.out.println("n1="+(char)(n1-10+'a'));//按>10转换
		num = num >>> 4;
		int n2 = num & 15;
		System.out.println("n2="+(char)(n2+'0'));//按10以内转换


		代码优化：
			针对问题：运算重复，&15结果是否转换的判断。
			通过循环，完成重复运算；通过if语句判断。

		int num = 26;
		for (int x = 0; x<8; x++)
		{
			int n = num & 15;
			if (n>9)
				System.out.println((char)(n-10+'A'));
			else
				System.out.println(n);
			num = num >>> 4;
		}


		代码优化+：
			针对问题：控制循环条件冗余，优化多余0的运算
			改变循环语句中的内容。

		int num = 2834;//0xB12
		for ( int n; num != 0; num = num >>> 4)
		{
			n = num & 15;
			if (n>9)
				System.out.println((char)(n-10+'A'));
			else
				System.out.println(n);
		}
		*/








		/*
		需求4：三个数，获取最大的一个。
		
		int c = 500, d = 100, e = 9;//或者引入两个新的变量tempMax和max
		int max = (c>d?c:d);//可直接初始化，不用另起一行。
		max = (max>e?max:e);
		System.out.println("max="+max);

		*/





		/*
		需求5：要求在屏幕上显示下列内容
			   54321
			   5432
			   543
			   54
			   5
			  大圈套小圈的思想，for嵌套循环。

		
		for (int x = 1; x<=5; x++)
		{
			for (int y = 5; y>=x; y--)
			{
				System.out.print(y);
			}
			System.out.println();
		}
		*/





		/*
		需求6：九九乘法表。
		1*1=1
		1*2=2 2*2=4
		1*3=3 2*3=6 3*3=9

		遇到问题：与自己熟悉的内容联系，从而找到突破口。

		*/
		for (int x = 1; x <= 9; x++)//乘法表有9行
		{
			for (int y = 1; y<=x; y++)//由内循环输出
			{
				System.out.print(y+"*"+x+"="+(x*y)+"\t");
			}
			System.out.println();
		}

		


		//需求：打出带双引号的hello world
		//ASCII：双引号 char 34
		
		System.out.println((char)34+"Hello World!"+(char)34);
	}
}
