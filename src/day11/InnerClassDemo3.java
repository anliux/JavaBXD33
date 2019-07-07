/*
内部类其实也可以定义在外部类的局部位置上。
*/

class Outer
{
	int num = 3;
	
	void method()
	{
		int x = 5;//局部变量
		int y = 2;//访问失败
		
		class Inner//局部内部类。不能被成员修饰符修饰（public private static）
	    {
			void show()
			{
				System.out.println("x="+x);				
				System.out.println("y="+y);
				System.out.println("inner show run.."+num);
			}
		}
		
		new Inner().show();
	}
}

class InnerClassDemo3
 {
	public static void main(String[] args) 
	{
		Outer out = new Outer();
		out.method();
	}
}
