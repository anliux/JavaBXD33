//对象的初始化过程。
class Demo
{
	static int x = 1;
	int y = 1;

	static
	{
		System.out.println("static code..x"+x);
	}

	{
		System.out.println("cons code..y"+y);
	}

	Demo() //构造函数内的隐式部分。
	{
		/*
			1、super();//访问父类中的构造函数。
			2、成员变量的显示初始化。
			3、构造代码块初始化。
		*/
		System.out.println("cons function..y"+y);
	}
}

class CreateObjectTest
{
	public static void main(String[] args) 
	{
		 /*
		 1、加载Demo.class文件进方法区，并进行空间分配。
		 2、如果有静态变量，先默认初始化，然后显示初始化。
		 3、如果有静态代码块，要执行，仅一次。
		 4、通过new在堆内存中开辟空间，并明确首地址。
		 5、对对象中的属性进行默认初始化。
		 6、调用对应的构造函数进行初始化。
		 7、构造函数内部
			1-调用父类构造函数super();
			2-成员变量的显示初始化
			3-构造代码块初始化
			4-构造函数内的自定义内容初始化
		 8、对象初始化完毕后，将地址赋值给d引用变量
		 */
		
		Demo d = new Demo();
	}
}
