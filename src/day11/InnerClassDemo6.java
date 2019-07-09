interface Inter
{
	void show1();
	void show2();
}

class Outer
{
	int num = 4;

	//在一个类中使用一个接口的对象，可以通过内部类来实现
	/*
	class Inner implements Inter
	{
		public void show1()
	    {}
		public void show2()
	    {}
	}
	*/
	public void method()
	{
		/*
		Inner in = new Inner();
		in.show1();
		in.show2();
		*/
		//对其简化，写成匿名内部类的形式
		Inter in = new Inter()//匿名内部类中方法不要过多，阅读性会很差
		{
			public void show1()
			{}
			public void show2()
			{}
		};
		in.show1();
		in.show2();
	}
}

class InnerClassDemo6 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
