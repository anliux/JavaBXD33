class VarDemo2 
{
	public static void main(String[] args) 
	{
		//一旦数值不确定，就用变量表示。

		/*
		int x = 3;
		System.out.println("x");
		*/


		//自动类型转换
		/*
		byte b = 4;
		int x = 3;
		x = x + b; //b就自动类型提升了。
		System.out.println("x="+x);
		*/


		//强制类型转换
		/*
		byte b = 3;
		//b = b + 1;//报错
		b = (byte)(b + 1);// 强制类型转换。
		System.out.println("b="+b);
		*/

		//char类型运算

		char ch = 97;//97在char范围内（2字节），自动去查表找到a
		System.out.println("ch="+ch);

		char ch2 = 'a';
		System.out.println("ch2="+ch2);

		char ch3 = 'a';
		System.out.println("ch3="+(ch3+1));
		//char占2字节，1是整数int型占4字节，自动类型提升为int型，输出98
		//（int型超出char范围了，故作为int型输出，而不再去查表）

		char ch4 = 'a';
		System.out.println("ch4="+(char)(ch4+1));//强制类型转换为char型

	}
}
