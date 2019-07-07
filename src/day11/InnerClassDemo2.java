/*
为什么内部类能直接访问外部类中的成员？
因为内部类其实持有了外部类的引用 “外部类.this”
静态内部类中不持有“外部类.this”，而是直接使用“外部类名”


*/
class Outer
{
	int num = 3;

	class Inner
	{
		int num = 4;

		void show()
		{
			int num = 5;
			System.out.println("num="+num);//5
			System.out.println("num="+this.num);//4
			System.out.println("num="+Outer.this.num);//3

		}
	}
	
	void method()
	{
		//System.out.println(Outer.this.num);//Outer.this. 可以省略不写
		new Inner().show();
	}
}



class InnerClassDemo2 
{
	public static void main(String[] args) 
	{
		Outer out = new Outer();
		out.method();
	}
}
