/*
子父类中构造函数的特点：
当子父类中都有构造函数时，发现结果为：
	fu constructor run
	zi constructor run
先执行了父类的构造函数，再执行子类的构造函数。
为啥呢？
因为子类的所有的构造函数中的第一行都有一句隐式语句
	super();//默认调用的是父类中的空参数的构造函数。

子类中的构造函数为什么有一句隐式的super()呢？
原因：子类会继承父类中的内容，所以子类在初始化时必须先到父类中去执行父类的初始化动作，才可以更方便地使用父类中的内容。

当父类中没有空参数构造函数时，子类的构造函数必须通过显示的super语句指定要访问的父类中的构造函数

这就是传说中的子类实例化过程。

-----------------------------------------

细节：
1、如果子类的构造函数第一行写了this调用了本类其他构造函数，那么super调用父类的语句还有吗？
   没有的。因为this()或者super()，只能定义在构造函数的第一行，因为初始化动作要先执行。

2、父类构造函数中是否有隐式的super呢？
也是有的。记住：只要是构造函数默认第一行都是super();
父类的父类是谁呢？super调用的到底是谁的构造函数呢？
Java体系在设计时，定义了一个所有对象的父类Object

总结：
类中的构造函数默认第一行都有隐式的super()语句，在访问父类中的构造函数。
所以父类的构造函数既可以给自己的对象初始化，也可以给自己的子类对象初始化。

如果默认的隐式super的语句没有对应的构造函数，必须在构造函数中通过this或者super的形式明确调用的构造函数。

问题：
1、this语句和super语句是否可以在同一个构造函数中出现呢？不行，因为必须定义在第一行。
2、为什么要定义在第一行呢？因为初始化动作要先执行。


*/
class Fu
{
	Fu()
	{
		//显示初始化
		System.out.println("fu constructor run..A.");
	}
	Fu(int x)
	{
		//显示初始化
		System.out.println("fu constructor run..B."+x);
	}
}

class Zi extends Fu
{
	Zi()
	{
		//super();
		System.out.println("zi constructor run..C.");
	}
	Zi(int x)
	{
		//super();
		System.out.println("zi constructor run..D."+x);
	}
}

class ExtendsDemo3
{
	public static void main(String[] args) 
	{
		new Zi();
		new Zi(6);

		new Student("lisi",21);
	}
}

//子类的实例化过程的应用。也是super调用的应用。
//学生和工人的例子。
//什么时候用super调用父类中的构造函数？
//只要使用父类的指定初始化动作，就在子类中通过 super(参数列表) 的格式进行调用。

class Person
{
	private String name;
	private int age;

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}

}

class Student extends Person
{
	public Student(String name, int age)
	{
		//super();//不明确super(name,age)不可以。因为有默认的super，所以必须手动明确。
		//调用父类。使用父类的初始化动作。
		super(name,age);
	}
	public void study()
	{}
}

class Worker extends Person
{
	public Worker(String name, int age)
	{
		//调用父类。使用父类的初始化动作。
		super(name,age);
	}
}
