/*
当构造函数之间进行相互调用时，该如何解决呢？

构造函数是对象初始化时调用的。
给哪个对象初始化呢？通过this关键字来记录住对象的地址，并通过this来明确被初始化的对象。

在构造函数中调用其他构造函数的格式：this(实参列表);   就会调用对应的构造函数。

小结：重点*****
this到底代表什么呢？
this就代表对象。
代表哪个对象呢？哪个对象调用了this所在的函数，this就代表哪个对象。


*/

class Person 
{
	private String name;
	private int age;
	Person()
	{
		
	}
	//初始化姓名
	private Person(String n)
	{
		name = n;
	}
	//初始化姓名和年龄。既然有初始化姓名的动作，直接调用就可以了
	Person(String n, int a)
	{
		this(n);//调用一个字符串参数的构造函数。
			//注意：调用其他构造函数的语句必须定义在构造函数的第一行。原因：初始化动作要先执行。
	//	name = n;
		age = a;
	}
}

class PersonDemo3
{
	public static void main(String[] args) 
	{
		Person p = new Person("lisi", 20);
		Person p1 = new Person("lisi1", 21);

	}
}
