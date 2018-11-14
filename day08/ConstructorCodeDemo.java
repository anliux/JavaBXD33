class Demo
{
	int x = 4; //成员变量 1、默认初始化 2、显示初始化
	{
		//构造代码块。只要创建对象就会被调用。给所有对象初始化，构造函数只给对应的对象针对性地初始化。
		//这里面可以定义不同构造函数的共性代码。
		System.out.println("code run"+x);
		System.out.println("haha");
	}

	Demo()
	{
		System.out.println("demo run");
		System.out.println("haha");
	}

	Demo(int x)
	{
		System.out.println("demo run"+x);
		System.out.println("haha");
	}
}

class ConstructorCodeDemo 
{
	public static void main(String[] args) 
	{
		new Demo();
		new Demo();

		{
			//局部代码块 作用：可以控制局部变量的生命周期。一旦结束，x直接释放。
			int x = 5;
			System.out.println("局部代码块"+x);
		}
		System.out.println("over"+x);//错误：找不到符号 x
	}
}
