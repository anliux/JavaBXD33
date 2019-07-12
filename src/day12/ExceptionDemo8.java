class NoAgeException extends Exception
{
	//为什么定义构造函数？因为看到java中的异常描述类中有提供对问题对象的初始化方法。
	NoAgeException()
	{
		super();
	}

	NoAgeException(String message)
	{
		super(message);
		//如果自定义异常需要异常信息，通过调用父类的带有字符串参数的构造函数即可。
	}
}

class Person
{
	private String name;
	private int age;
	/*
	构造函数到底抛出这个NoAgeException是继承Exception呢？还是继承RuntimeException呢？
	继承Exception，必须要throws声明，一声明就告知调用者进行捕获，一旦问题处理了调用者的程序会继续执行
	但是如果后面使用到了Person对象的数据，会导致全都失败
	继承RuntimeException，不需要throws声明的，这时调用是不可能编写捕获代码的，因为调用根本就不知道有问题
	一旦发生NoAgeException，调用者程序会停掉，并由jvm将信息显示到屏幕上，让调用者看到问题，并修正代码
	*/
	
	Person(String name, int age)throws NoAgeException
	{
		//加入逻辑判断
		if(age<0 || age>200)
		{
			throw new NoAgeException(age+"，年龄数值非法");
		}
		this.name = name;
		this.age = age;
	}
	//定义Person对象对应的字符串表现形式。覆盖Object中的toString方法
	public String toString()
	{
		return "Person[name="+name+" , age="+age+"]";
	}
}


class ExceptionDemo8 
{
	public static void main(String[] args) 
	{
		try
		{
			Person p = new Person("xiaoming", -20);
			System.out.println(p);		
		}
		catch (NoAgeException ex)
		{
			System.out.println("异常啦！");
		}
		System.out.println("over!");
	}
}
