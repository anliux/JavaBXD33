/*
多态中，成员调用的特点。

1、成员变量。
	当子父类中出现同名的成员变量时。
		多态调用该变量时：
			编译时期：参考的是引用型变量所属的类中是否有被调用的成员变量。没有，编译失败。
			运行时期：也是调用引用型变量所属的类中的成员变量。
		简单记：编译和运行参考等号的左边。
		        编译运行看左边。

2、成员函数。
	编译，参考左边，如果没有，编译失败。
	运行，参考右边的对象所属的类。
		编译看左边，运行看右边。
	
	对于成员函数是动态绑定到对象上。

3、静态函数。
	编译和运行都参考左边。

	静态函数是静态地绑定到类上。

【结论】
对于成员变量和静态函数，编译和运行都看左边。
对于成员函数，编译看左边，运行看右边。


*/
class Fu
{
	int num = 3;

	void show()
	{
		System.out.println("fu show run");
	}

	static void method()
	{
		System.out.println("fu static method run");
	}
}

class Zi extends Fu
{
	int num = 5;

	void show()
	{
		System.out.println("zi show run");
	}

	static void method()
	{
		System.out.println("zi static method run");
	}
}

class DuoTaiDemo3 
{
	public static void main(String[] args) 
	{
		/*
		//测试成员变量的多态调用。
		Fu f = new Zi();
		System.out.println(f.num);//3
		Zi z = new Zi();
		System.out.println(z.num);//5
		*/
		
		/*
		//测试成员函数的多态调用。
		Fu f = new Zi();
		f.show();
		*/

		//测试静态函数的多态调用。
		Fu f = new Zi();
		f.method();//fu static method run;

		//注意：真正开发，静态方法是 不会被多态调用的。
		//因为静态方法不所属于对象，而是所属于类。
		Fu.method();
		Zi.method();
	}
}








