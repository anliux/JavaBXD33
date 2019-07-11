/*
ExceptionDemo4.java中的异常，不好认，能不能定义一个符合我的程序要求的问题名称

异常的信息都可以自定义，那么异常的名字是否可以定义呢？是否可以定义成更符合自己程序的阅读呢？

之前的几个异常都是java通过类进行的描述，并将问题封装成对象，这是符合面向对象思想的。
其实：异常就是将问题封装成了对象。

所以准备对自己所需的问题进行类的描述。
自定义class NoAgeException

发生编译错误：
ExceptionDemo5.java:28: 错误: 不兼容的类型: NoAgeException无法转换为Throwable
                        throw new NoAgeException(age+"，年龄数值非法");
                        ^
1 个错误

不兼容，不明白，查阅，提示中说需要Throwable，啥东西？
搜索API，看到Throwable描述，发现，它是异常和错误的超类（父类）
原来它是异常体系的顶层类。
Throwable
	|--Error
	|--Exception

通过阅读，自定义异常被抛出，必须是继承Throwable，或者继承Throwable的子类。
该对象才可以被throw抛出。

原来这个异常体系具备一个特有的特性：可抛性：可以被throw关键字操作。

继承选择父类时，更为确切的是继承Exception
但是编译发现又一次失败了：
ExceptionDemo5.java:60: 错误: 未报告的异常错误NoAgeException; 必须对其进行捕获或
声明以便抛出
                        throw new NoAgeException(age+"，年龄数值非法");
                        ^
1 个错误

通过这个编译失败提示，发现自定义的异常和之前所使用的异常（空指针异常，角标越界异常，无效参数异常）有不同
抛出那些异常没有这个失败提示，那么之前的异常和自定义的异常有什么区别呢？
通过查看API的继承体系发现，之前的异常都是Exception下面的RuntimeException子类的子类
阅读RuntimeException描述中有明确说明，这个运行时异常以及其子类都无需进行声明。

可以将自定义的异常继承RuntimeException。

此时错误提示并没有显示传递的实参的相关信息
通过查阅源码并一系列追溯，发现其他三个异常的构造函数使用了super(s);
故在自定义异常中也添加该语句，运行时抛出的异常显示了实参

Exception in thread "main" NoAgeException: -20，年龄数值非法
        at Person.<init>(ExceptionDemo5.java:76)
        at ExceptionDemo5.main(ExceptionDemo5.java:92)
*/

//自定义异常：描述Person的年龄数值非法
//只要是本项目的Person的年龄出现非法值，就会发生该异常。
class NoAgeException extends RuntimeException
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
	Person(String name, int age)
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

class ExceptionDemo5 
{
	public static void main(String[] args) 
	{
		Person p = new Person("xiaoming", -20);
		System.out.println(p);
	}
}
