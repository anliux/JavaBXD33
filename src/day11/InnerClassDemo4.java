/*
看API，如果发现类名或者接口名中有点.，说明是内部类，或者内部接口。

内部类的延伸。
内部类是可以继承或者实现外部其他的类或者接口的。

好处：通过内部类的方式对类进行继承重写，或者接口进行实现。
通过公共的方式对其内部类对象进行访问。因为通常内部类很有可能被外部类封装其中。
我们就可以通过父类或者接口的方式访问到内部类的对象。
*/

abstract class AbsDemoo
{
	abstract void show();
}

class Outer
{
	int num = 3;
	private class Inner extends AbsDemo 
	{
		//重写抽象方法show
		void show()
		{
			System.out.println("num="+num);
		}
	}
	
	//获取内部类的对象
	public AbsDemo getObject()
	{
		return new Inner();
	}

	public void method()
	{
		new Inner().show();
	}
}

class InnerClassDemo4
{
	public static void main(String[] args) 
	{
		Outer out = new Outer();
		//out.method();
		//如果Inner对外提供，可以如此获取。
		//Outer.Inner in = out.getObject();
		//in.show();		
		
		//如果Inner被private，可以通过父类型获取
		AbsDemo a = out.getObject();//多态。
		a.show();
	}
}
