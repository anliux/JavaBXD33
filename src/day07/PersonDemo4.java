/*

this关键字的另一个作用：
可以用this标识哪个变量是成员变量。这个标识可以省略不写。
但是，当局部变量和成员变量同名时，必须用 this. 来标识成员变量。

*/

class Person
{
	private String name;
	private int age;

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public void speak()
	{
		String name = "haha";
		System.out.println("name="+ this.name + ",age=" + this.age);
	}
	public void method()
	{
		this.speak(); //this可以省略。
	}

	//课上练习：定义功能，判断两个人是否是同龄人。
	//1、明确结果：Boolean； 2、明确未知内容：1个，Person类型
	public boolean equalsAge(Person pp)
	{
		/*
		if (pp.age==this.age)
			return true;
		return false;
		*/

		//简化写法：
		//return (pp.age==this.age)?true:false;

		return pp.age==this.age;
	}
}


class PersonDemo4 
{
	public static void main(String[] args) 
	{
		Person p = new Person("lisi",20);
		Person p1 = new Person("xiaoming",24);
		p.speak();
		p1.speak();
	}
}
