//多态

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

/*
多态：
【体现】
	父类的引用或者接口的引用指向了自己的子类对象。
	Dog d = new Dog();//Dog对象的类型是Dog类型。
	Animal a = new Dog();//Dog对象的类型右边是Dog类型，左边是Animal类型。
【好处】
	提高了程序的扩展性。
【弊端】
	通过父类引用操作子类对象时，只能使用父类中已有的方法，不能操作子类特有的方法。
【前提】
	1、必须有关系：继承、实现。
	2、通常都有重写操作。

【子类的特有方法如何调用呢？】
	Animal a = new Dog();//Animal是父类型，new Dog()是子对象。
	当父类型引用指向子类对象时，这就是让子类对象进行了类型的提升（向上转型）
	向上转型好处：提高了扩展性，隐藏了子类型。弊端：不能使用子类型的特有方法。
	如果要想使用子类的特有方法，只有子类型可以用。
	可以向下转型，强制转换。
	Animal a = new Dog();
	a.eat();
	Dog d = (Dog)a;//将a转型为Dog类型。向下转型。
	d.lookHoom();
	向下转型什么时候用？当需要使用子类型的特有内容时。

	注意：无论向上还是向下转型，最终都是子类对象做着类型的变化。

【向下转型的注意事项】
	Animal a = new Dog();
	//Cat c = (Cat)a; 向下转型因为不明确具体子类对象类型，所以容易引发ClassCastException异常。
	所以为了避免这个问题，需要在向下转型前，做类型的判断。
	判断类型用的是关键字 instanceof
	if(a instanceof Cat)//a指向的对象的类型是Cat类型。
	{
		//将a转型为Cat类型。
		Cat c = (Cat)a;
		c.catchMouse();
	}
	else if(a instanceof Dog)
	{
		Dog d = (Dog)a;
		d.lookHoom();
	}


【转型总结】
1、什么时候使用向上转型？
   提高程序的扩展性，不关心子类型（子类型被隐藏）
   需要用子类型的特有方法吗？不需要，哦了，向上转型。
2、什么时候使用向下转型呢？
   需要使用子类型的特有方法时。
   但是一定要使用instanceof进行类型的判断。避免发生ClassCastException

*/

class DuoTaiDemo2 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		/*
		d.eat();
		d.lookHoom();
		Animal a = new Dog();
		a.eat();//可以。
		//a.lookHoom();//不可以。
		*/

		method(d);

		Cat c = new Cat();
		method(c);
	}
	
	public static void method(Animal a)
	{
		a.eat();
		//a.lookHoom();//不可以，因为动物不具备这个功能。

		Dog d = (Dog)a;//ClassCastException 类型转换异常
		d.lookHoom();
	}	
}

