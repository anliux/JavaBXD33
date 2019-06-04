/*
//描述学生
class Student
{
	//属性
	String name;
	int age;

	//行为
	void study()
	{
		System.out.println("good good study");
	}
}

//描述工人
class Worker
{
	//属性
	String name;
	int age;

	//行为
	void work()
	{
		System.out.println("hard work");
	}
}
*/

/*
为了提高复用，只建立一份代码。
一个类只要和另一个类产生关系就可以了
关系：继承
发现了获取到所需内容的同时也获取到了不该具备的内容
为什么？
发现原来这两个类之间根本不存在继承关系。

怎么解决呢？
找到学生和工人的共性类型。将需要提高复用的代码进行抽取。
定义到一个共性类型的类中。
Person name age

怎么在代码体现中让学生和Person产生关系呢？
主要通过关键字 extends(继承)就哦了。

*/

class Person
{
	String name;
	int age;
}

class Student extends Person//学生继承了Person 学生就是子类 Person就是父类（基类 超类）
{
	void study()
	{
		System.out.println("good good study");
	}
}

class Worker extends Person
{
	void work()
	{
		System.out.println("hard work");
	}
}

/*
面向对象 另一个特征：继承
好处：
提高了代码的复用性。
让类与类之间产生了关系，给另一个特征“多态”提供了前提

什么时候定义继承呢？
必须保证类与类之间有所属（is a）关系。XXX是ZZZ中的一种。
	苹果是水果中的一种。狗是犬科中的一种。

在Java中继承的体现：
Java允许单继承。不直接支持多继承，将多继承进行其他方式的体现。

单继承：一个子类只能有一个父类。
多继承：一个子类可以有多个父类。

看上去，多继承很厉害！为什么呢？
class Fu1
{
	void show1()
	{}
}
class Fu2
{
	void show2()
	{}
}
//多继承
class Zi entends Fu1,Fu2
{

}

Zi z = new Zi();
z.show1();
z.show2();

问题随之而来：万一多个父类具备了相同的功能呢？
class Fu1
{
	void show()
	{
		System.out.println("fu1 show run");
	}
}
class Fu2
{
	void show()
	{
		System.out.println("fu2 show run");

	}
}
//多继承
class Zi entends Fu1,Fu2
{

}

Zi z = new Zi();
z.show();//调用就会产生不确定性。
		//所以java保留了多继承的好处，改良了弊端。用多实现来体现。即将学到。

----------------------------------------------
java还支持多重继承
class A
{}
class B
{}
class C
{}
形成了继承体系。
学习继承体系时，应该参阅顶层的类中的内容。
了解这个体系的基本功能。

使用这个体系功能，需要创建最子类的对象。

看顶层，建底层。

*/


class  ExtendsDemo
{
	public static void main(String[] args) 
	{
		Student stu = new Student();
		stu.name = "xiaoqiang";
		stu.age = 12;
		stu.study();
	}
}
