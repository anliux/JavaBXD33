/*
静态方法使用注意事项：
1、静态方法不能访问非静态的成员。
   但是非静态可以访问静态成员的。
   说明：静态的弊端在于访问出现局限性。好处是可以直接被类名调用。

2、静态方法中不允许出现this，super关键字。

为什么不行呢？
原理揭秘：
1、静态是随着类的加载就加载了，也是随着类的消失而消失了。
2、静态优先于对象存在，被对象共享。
3、因为静态先存在于内存中无法访问后来的对象中的数据，所以静态无法访问非静态
   而且内部无法书写this。因为这时对象有可能不存在，this没有任何指向。



*/

class Person
{
	private String name;
	private int age;

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public void speak()
	{
		System.out.println("name="+this.name+",age="+this.age);
	}
	//定义一个睡觉功能。
	public static void sleep()
	{
		System.out.println("睡觉ZZZZZZzzzzz");
	}
}

class PersonDemo 
{
	public static void main(String[] args) 
	{
	  // Person p = new Person("lisi",20);
	  //p.speak();

	  /*
		创建对象就是为了产生实例，并进行数据的封装。
		而调用功能时，却没有用到这些对象中封装的数据。
		该对象的创建还有意义吗？
		Person p = new Person("lisi",20);
		Person p = new Person("lisi",20);
		Person p = new Person("lisi",20);
		Person p = new Person("lisi",20);
		Person p = new Person("lisi",20);
		Person p = new Person("lisi",20);
		Person p = new Person("lisi",20);
		pn.sleep();

		虽然可以编译并运行，但在堆内存中空间较为浪费。
		不建议创建对象。
		那该怎么调用呢？java中的解决方案就是 使用static关键字。
		static 这是一个成员修饰符，被静态static修饰的方法除了可以被对象调用外，还可以被类名调用。
		静态看上去很美，是不是所有的方法都静态呢？不行！

		那么什么时候需要将方法定义成静态的呢？
		定义功能时，如果功能不需要访问类中定义的成员变量(非静态)时，该功能就需要静态修饰。



	  */
	   // p.sleep();
	   Person.sleep();
	}
}
