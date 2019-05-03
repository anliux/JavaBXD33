/*

当A类中的内容要被B类直接访问，而A类还需要创建B的对象，访问B的内容时。
这时，可以将B类定义到A类的内部。这样访问更为便捷。

将B类称之为内部类（内置类，嵌套类）

访问方式：
内部类可以直接访问外部类中的所有成员，包含私有的。
而外部类要想访问内部类中的成员，必须创建内部类的对象。

当描述事物时，事物的内部还有事物，这个内部的事物还在访问外部事物中的内容。
这时就将这个事物通过内部类来描述。

【内部类被访问的方式】
情况一：内部类在成员位置上的被访问方式。
	成员是可以被指定的修饰符所修饰的。
	public。不多见。因为更多时候，内部类已经被封装到外部类中，不直接对外提供。面试用。
	private。供内部使用。比较多见。
	static。




*/
class Outer//外部类
{
	//static private int num = 4;
	
	/*
	内部类被静态修饰后，随着Outer的加载而加载。
	可以把一个静态内部类理解为一个外部类。
	*/
	static class Inner2
	{
		void show2()
		{
			System.out.println("Inner2 show2 run.."+num);
		}
		static void staticShow()
		{
			System.out.println("Inner2 staticShow run.."+num);
		}
	}

	public class Inner//内部类
	{
		//static final int x = 3;//增强阅读性。
		void show()
		{
			System.out.println("num="+num);
		}
		//static void show1(){}//非静态内部类中不允许定义静态成员。仅允许在非静态内部类中定义静态常量 static final.
		//如果想要在内部类中定义静态变量，必须内部类也要被静态修饰。
	}
	void method()
	{
		/*Outer.*/Inner in = new /*Outer*/Inner();
		in.show();
	}
}

class InnerClassDemo 
{
	public static void main(String[] args) 
	{
		//Outer out = new Outer();
		//out.method();

		//测试情况一：直接访问Outer中的Inner内部类的非静态成员。
		//创建内部类的对象就哦了。内部类作为成员，应该先有外部类对象，再有内部类对象。
		
		/*
		Outer.Inner in = new Outer().new Inner();
		in.show();
		*/

		//测试情况二：对静态内部类中的非静态成员进行调用
		//因为内部类是静态，所以不需要创建Outer的对象，直接创建内部类对象就哦了。
		/*
		Outer.Inner2 in = new Outer.Inner2();
		in.show2();
		*/

		//如果静态内部类中有静态成员，该如何访问呢？
		//既然静态内部类已随着外部类加载，而且静态成员也随着类的加载而加载，
		//这时候就不需要对象，直接用类名调用即可。
		//Outer.Inner2.staticShow();




	}
}






