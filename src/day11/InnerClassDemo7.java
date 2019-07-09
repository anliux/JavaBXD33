//匿名内部类练习。

interface Inter
{
	public void show();
}

class Outer
{
	//代码不足。要求使用匿名内部类。
	public static Inter method()
	{
		//既然Outer类总使用到了Inter的对象，可以使用内部类来完成
		//需要子类型，只要简化格式即可，因为接口中就只有一个方法
		return new Inter()
		{
			public void show()
			{
				//code...;
			}
		}

		//return this.new Inner();
	}

	//还原成内部类。当静态方法访问内部类时，内部类必须是静态的。
	/*
	static class Inner implements Inter
	{
		public void show(){}
	}
	*/
}

//面试题
class Outer2
{
	public void method()
	{
		//以下两个对象有区别吗？
		new Object()
		{
			public void show(){}
		}.show();
		//这个编译通过。

		Object obj = new Object()
		{
			public void show(){}
		};
		obj.show();
		//编译失败。因为匿名内部类是子类对象，当Object obj指向时，就被提升了Object。而Object类中没有定义show方法，编译失败。
	}

	/*
	class Inner extends Object
	{
		public void show(){}
	}
	*/
}

class InnerClassDemo7 
{
	public static void main(String[] args) 
	{
		Outer.method().show();
		/*
		Outer.method()：Outer类中有一个method方法，这个方法是静态的。
		Outer.method.show()：能调用show()的必然是对象，说明method方法运算完应该返回一个对象。
				能调用Inter中的show方法，说明这个对象的类型是Inter
		
		*/
	}
}
