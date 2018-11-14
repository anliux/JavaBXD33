/*
需求：类一加载，需要做一些动作。不一定需要对象。

学习目标：必须了解加载的顺序。
静态代码块：
	特点：随着类的加载而执行，仅执行一次。
	作用：给类进行初始化。
*/
class Demo
{
	static int x = 9; //静态变量有两次初始化。一次是默认初始化，一次是显示初始化。
	static //静态代码块。
	{
		System.out.println("类加载就执行的部分"+x);
	}
	static void show()
	{
		System.out.println("show run");
	}
}
class StaticCodeDemo 
{
	public static void main(String[] args) 
	{
		Demo.show();
		Demo.show();
		Demo.show();
	}
}
