/*
内部类其实也可以定义在外部类的局部位置上。

内部类定义在局部时，只能访问被final修饰的局部变量
为什么？因为编译生成的class中直接操作那个最终数值了。

为什么不能访问非最终的局部变量？
因为生命周期太短了，有可能访问的时候已经在内存中弹出了
*/

class Outer
{
	int num = 3;
	
	void method()
	{
		final int x = 5;//局部变量。据说不加final报错，然而并没有..可能升级了？
		int y = 2;//访问失败
		
		class Inner//局部内部类。不能被成员修饰符修饰（public private static）
	    {
			void show()
			{
				System.out.println("x="+x);	//			
				System.out.println("y="+y); //理论上要访问失败，实际上并没有.
											//访问失败的理由：局部变量的生命周期太短了
				System.out.println("inner show run.."+num);
			}
		}
		
		new Inner().show();
	}
}

//class Outer2：论证局部变量生命周期过短（实际y访问不到）
class Outer2
{
	Object obj;
	public void method()
	{
		int y = 9;
		class Inner //extends Object
		{
			//覆盖了toString方法
			public String toString()
			{
				return "toString:" +y;//假设可以访问y
					//画内存图论证不可以访问。
			}
		}
		obj = new Inner();//给obj赋值一个Inner对象
	}

	public void function()
	{
		System.out.println(obj.toString());
	}
}

class InnerClassDemo3
 {
	public static void main(String[] args)  
	{
		Outer out = new Outer();
		out.method();
	}
}
