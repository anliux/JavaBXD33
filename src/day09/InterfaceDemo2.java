/*
抽象类中是否可以不定义抽象方法？
可以的。原因仅是不让该类创建对象。
*/

interface Inter
{
	//定义四种显示功能
	public void show1();
	public void show2();
	public void show3();
	public void show4();
}

//定义子类，要使用第一种显示方法。
class InterImpl1 implements Inter
{
	//覆盖show1方法
	public void show1()
	{
		System.out.println("show1 run");
	}
	//为了让该类实例化，还需要覆盖其他三个方法，虽然该类用不上。
	public void show2(){}
	public void show3(){}
	public void show4(){}
}

//另一个子类需要使用显示3方法
class InterImpl3 implements Inter
{
	//覆盖show3方法
	public void show3()
	{
		System.out.println("show3 run");
	}
	//为了让该类实例化，还需要覆盖其他三个方法，虽然该类用不上。
	public void show2(){}
	public void show1(){}
	public void show4(){}
}

/*

出现问题：
为了使用接口中的部分方法，而覆盖了全部的方法，而且每一个子类都要这么做，复用性差。

将这些不用的方法都单独抽取到一个独立的类中。
让这个类去实现接口，并覆盖接口中的所有方法。

这个类知道这些方法的具体实现内容吗？不知道。
所以只能为了后期子类创建对象方便，而进行空实现。
而这时，这个类创建对象有意义吗？没有意义。这个类创建对象就不需要，直接将其抽象化。
这就是没有抽象方法的抽象类

*/

abstract class InterImpl implements Inter
{
	//实现Inter接口中的所有方法。
	public void show1(){}
	public void show2(){}
	public void show3(){}
	public void show4(){}
}

//如果有子类去使用显示1方法，让子类继承InterImpl实现类就可以了。
class InterImpl11 extends InterImpl
{
	public void show1()
	{
		System.out.println("show1 run");
	}
}

class InterfaceDemo2 
{
	public static void main(String[] args) 
	{
		InterImpl1 in1 = new InterImpl1();
		in1.show1();
		InterImpl3 in3 = new InterImpl3();
		in3.show3();
	}
}
