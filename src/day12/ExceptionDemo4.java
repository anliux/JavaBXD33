class Person
{
	private String name;
	private int age;
	Person(String name, int age)
	{
		//加入逻辑判断
		if(age<0 || age>200)
		{
			/*
			这样做虽然可以编译并运行看到提示信息，但问题却没有发生，程序还在继续执行。并打印p对象。
			这样不合理的。人对象初始化过程中已经出现了问题，为什么要会对人对象操作？
			所以应该将问题暴露出来，让使用该程序的调用者知道。
			所以要使用异常来解决。
			*/
			//System.out.println("年龄数值错误");
			//return;//终止初始化

			throw new IllegalArgumentException(age+"，年龄数值非法");
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

class ExceptionDemo4 
{
	public static void main(String[] args) 
	{
		Person p = new Person("xiaoming", -20);
		System.out.println(p);
	}
}
