/*
声明和捕获

声明：将问题标识出来，报告给调用者。
如果函数内通过throw抛出了编译时异常，而没有捕获，那么必须通过throws进行声明，让调用者去处理。

捕获：java中对异常有针对性的语句
语句：
try
{
	//需要被检测的语句。
}
catch(异常类 变量) //参数
{
	//异常的处理语句。
}
finally
{
	//一定会被执行的语句。
}
*/

class Demo
{
	/*
	如果定义功能时有问题发生需要报告给调用者。可以通过在函数上使用throws关键字进行声明。
	*/
	void show(int x)throws Exception
	{
		if (x>0)
		{		
			throw new Exception();
		}
		else 
			System.out.println("show run");
	}
}

class ExceptionDemo7
{
	public static void main(String[] args)//throws Exception//在调用者上继续声明。
	{
		Demo d = new Demo();
		try
		{
			d.show(1);//当调用了声明异常的方法时，必须有处理方式：要么捕获，要么声明
		}
		catch (Exception ex)//括号中需要定义什么？对方抛出的是什么问题，在括号里就定义什么问题的引用
		{
			System.out.println("异常发生了");
		}
		System.out.println("Hello World!");
	}
}
