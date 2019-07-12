/*
ExceptionDemo5.java中涉及的问题：
1、继承Exception和继承RuntimeException为什么差距这么大？
2、什么是捕获、声明？
*/

class Demo
{
	void show()
	{
		//如果在函数内抛出Exception
		//编译失败，因为编译器在检查语法时发生了错误
		/*
		该程序已经出现问题，java认为这个程序本身存在隐患，需要捕获或声明出来
		（要么把问题处理，要么把问题标识出来让调用者知道）
		*/
		throw new Exception();

		/*
		为什么抛出RuntimeException，不需要捕获和声明？
		不是功能本身发生的异常，而是因为比如调用者传递参数错误而导致功能运行失败。
		这时也是问题，需要通过异常来体现，但是这个异常不需要声明出来。
		声明的目的是为了让调用者进行处理。
		不声明的目的是不让调用者进行处理，就是为了让程序停止，让调用者看到现象，并进行代码的修正。

		异常分两种：
		1、编译时异常：编译器会检测的异常。
		2、运行时异常：编译器不会检测的异常。不需要声明。声明也可以，如果声明了，无外乎就是让调用者给出处理方式。
		常见的5种运行时异常：
		IllegalArgumentException
		NullPointerException
		IndexOutOfBoundsException
		ClassCastException
		*/
		throw new RuntimeException();
	}
}


class ExceptionDemo6 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
