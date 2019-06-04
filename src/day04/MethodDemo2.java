class MethodDemo2 
{
	public static void main(String[] args) 
	{
		int sum = add(2, 5);
		//System.out.println(sum);
		
		printSum(sum);//调用打印和的功能。


	}


	/*

	函数定义:

	修饰符 返回值类型 函数名(参数类型 形式参数1, 参数类型 形式参数2, ..)
	{
		执行语句;
		return 返回值;
	}

	return关键字用于结束该功能，并将后面的具体结果返回给调用者。
	必须有return语句。

	注意：函数的返回值类型如果是void时，return语句可以省略不写。
		  void表示没有返回值的情况。

	return语句在该功能结尾，可省略。生成class文件时自动加上（底层  ）



	*/

	/*
	如何定义一个函数呢？函数就是一个功能。
	功能需要两个部分：1、结果；2、未知内容
		明确1：这个功能的结果是什么
		明确2：这个功能需要的未知内容是什么

	*/

	/*
	需求：定义一个方法，进行
	
	*/
	
	
	//注意误区：功能内部之定义所需的内容，不需要的不定义。
	/*
	public static void add(int a, int b)
	{
		System.out.println(a+b);//只需要返回和，谁说要打印的？
		return;
	}
		
	*/

	//实在需要打印，得分开写成两个功能：返回和，打印和。
	public static int add(int a, int b)
	{
		return a+b;
	}

	public static void printSum(int sum)
	{
		System.out.println(sum);	
	}

	//一个功能内部最好不超过20行代码。
	//超过的最好分开成各个小功能最后统一调用。方便调试。

}
