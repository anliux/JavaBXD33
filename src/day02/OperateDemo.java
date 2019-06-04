class  OperateDemo
{
	public static void main(String[] args) 
	{
		/*
		算数运算符：

		+ - * / %(取模，取余数)

		++ --(自增自减)

		+(字符串相加符号)

		*/

		//整除:/
		int x = 2810;
		System.out.println("x/1000="+x/1000);
		//除号方向与百分号%一致；x和1000两个都是整数，运算结果也取整数。

		//取模：%
		System.out.println("5%2="+5%2);//5除以2取余数
		System.out.println("2%-5="+2%-5);//运算符优先级；
		System.out.println("-5%2="+-5%2);//取模的结果的正负看被模数的正负。

		//自增自减：++ --
		int a = 3;
		a++;//或者++a；++单独时，放左放右结果一样。
		System.out.println("a="+a);

		//自增放左放右的两种形式：
		int b = 3,c;
		c = b++;
		//先将b的值临时存储，b自增后，再将临时存储的值赋给c
		System.out.println("b="+b+",c="+c);//这里注意别写错了，要用+连起来

		int d = 3,e;
		e = ++d;
		//先做右边的自增运算，d自增后，将新的d值赋给e
		System.out.println("d="+d+",e="+e);

		//字符串相加符号：+ 自有在字符串使用时才是连接符
		System.out.println(5+5);//输出计算结果10
		System.out.println("5"+5);//字符串和任何数据相加都是相连接，形成更大的字符串。
		System.out.println("5+5="+5+5);//连成字符串
		System.out.println("5+5="+(5+5));//小括号优先级，字符串与运算结果连接。



	}
}
