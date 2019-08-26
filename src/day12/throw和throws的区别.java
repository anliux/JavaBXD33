/*
throw和throws的区别:

1、throw用在函数内
   throws用在函数上
2、throw抛出的是异常对象
   throws用于进行异常类的声明，后面异常类可以有多个，用逗号隔开
*/

class Demo
{
	void show()throws Exception
	{
		throw new Exception();
	}
}

class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
