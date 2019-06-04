/*
抽象类中可以定义抽象方法的。
当一个抽象类中的方法全是抽象的，这时，可以通过另一种特殊的形式来体现。
用接口来表示。

接口该如何定义呢？interface

abstract class Demo
{
	abstract void show1();
	abstract void show2();
}
*/

/*
接口中的成员已经被限定为固定的几种。
【接口的定义格式先介绍两种：】
1、定义变量，但是变量必须有固定的修饰符修饰，public static final 所以接口中的变量也称为常量。
2、定义方法，方法也有固定的修饰符，public abstract
接口中的成员都是公共的。




【接口的特点】
1、接口不可以创建对象。
2、子类必须覆盖掉接口中所有的抽象方法后，子类才可以实例化。
   否则子类是一个抽象类。
*/

interface Demo//定义一个名称为Demo的接口
{
	public static final int NUM = 3;
	public abstract void show1();
	public abstract void show2();
}

//定义子类去覆盖接口中的方法。子类必须和接口产生关系，类与类的关系是继承，类与接口之间的关系是实现。通过关键字implements

class DemoImpl implements Demo//子类实现Demo接口。
{
	//重写接口中的方法。
	public void show1(){}
	public void show2(){}
}

/*
【接口最重要的体现】
解决多继承的弊端。将多继承这种机制在java中通过多实现完成了。

interface A
{
	void show1();
}
interface B
{
	void show2();
}
class C implements A,B//多实现。同时实现多个接口。
{
	public void show1(){}
	public void show2(){}
}

【怎么解决多继承的弊端呢？】
弊端：多继承时，当多个父类中有相同功能时，子类调用会产生不确定性。
其实核心原因在于：多继承父类中功能有主体，而导致调用运行时，不确定运行哪个主体内容。
为什么多实现就解决了呢？
因为接口中的功能都没有方法体，由子类来明确。

interface A
{
	void show();
}
interface B
{
	void show();
}
class C implements A,B//多实现。同时实现多个接口。
{
	public void show(){}
}

C c = new C();
c.show();

*/


/*
【基于接口的扩展。】

class Fu
{
	public void show(){}
}
//子类通过继承父类扩展功能，通过继承扩展的功能都是子类应该具备的基础功能。
//如果子类想要继续扩展其他类中的功能呢？这时通过实现接口来完成。
interface Inter
{
	public void show1();
}

class Zi extends Fu implements Inter
{
	public void show1()
	{
	
	}
}

//接口的出现避免了单继承的局限性。
//父类中定义的是事物的基本功能。
//接口中定义的是事物的扩展功能。

*/


/*
【接口出现后的一些细节】
类与类之间是继承（is a）关系，类与接口之间是实现（like a）关系
接口与接口之间是继承关系，而且可以多继承。
*/
interface InterA
{
	void show1();
}
interface InterAA
{
	void show11();
}

interface InterB extends InterA,InterAA//接口的多继承
{
	void show2();
}

class Test implements InterB
{
	public void show1(){}
	public void show11(){}
	public void show2(){}
}






class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		DemoImpl d = new DemoImpl();
		d.show1();
		d.show2();
	}
}
