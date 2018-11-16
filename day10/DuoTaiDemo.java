//多态技术的引出。解决了什么问题？程序扩展性的问题。

//描述Dog
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("骨头");
	}
	public void lookHoom()
	{
		System.out.println("看家");
	}
}

//描述猫
class Cat extends Animal
{
	public void eat()
	{
		System.out.println("鱼");
	}
	public void catchMouse()
	{
		System.out.println("抓老鼠");
	}
}
//进行抽取。将共性的功能抽取到父类animal中。
abstract class Animal
{
	public abstract void eat();
}

class DuoTaiDemo 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		//d.eat();
		method(d);

		Cat c = new Cat();
		method(c);
	}
	/*
	发现，每多一个动物，都需要为这个动物单独定义一个功能，让这个动物的对象去做事。
	这个程序扩展性就很差。如何提高这个扩展性呢？
	发现既然是让动物去eat，无论是dog，还是cat，eat是它们的共性，干脆将eat进行抽取。抽取到父类Animal中。

	Dog是Animal中的一种。小狗，叫狗，也叫小动物。
	Dog d = new Dog();
	Animal a = new Dog();
	Cat c = new Cat();
	Animal aa = new Cat();
	
	*/

	//只要建立animal的引用就可以接收所有的dog cat对象进来。让它们去eat。
	//提高了程序的扩展性。
	public static void method(Animal a)
	{
		a.eat();
	}

	/*

	//接收Dog，让dog做事
	public static void method(Dog d)
	{
		d.eat();
	}
	//接收Cat，让cat做事
	public static void method(Cat c)
	{
		c.eat();
	}
	*/
}
