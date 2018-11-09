class  OperateTest
{
	public static void main(String[] args) 
	{
		//位运算符练习：

		//1、最有效率运算 2乘以8，通过位移运算
		System.out.println(2<<3);//左移变大，相当于乘法，右移变小，是除法。

		//2、对两个整数变量进行互换（且不使用第三方变量）
		int a = 3, b = 7;

		//法一：直接替换
		/*
		a = b;//a = 7;
		b = a;//b = 7;
		错误。
		*/

		//法二：通过第三方变量进行置换：
		/*
		int temp = a;
		a = b;
		b = temp;
		*/

		//法三：通过和的形式。弊端是：两个数据较大时，可能会超出int范围。
		/*
		a = a + b;//a = 3 + 7;
		b = a - b;//b = 3 + 7 - 7; b = 3;
		a = a - b;//a = 3 + 7 - 3; a = 7;
		*/

		//法四：技巧，异或。a^b^b=a;a^b^a=b; 思想方法同求和。
		a = a ^ b;//a = 3 ^ 7;
		b = a ^ b;//b = 3 ^ 7 ^ 7; b = 3;
		a = a ^ b;//a = 3 ^ 7 ^ 3; a = 7;



		System.out.println("a="+a+",b="+b);
	}
}
