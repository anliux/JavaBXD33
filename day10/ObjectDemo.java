/*

Object类中的常用方法。

Object类是所有类的根类，定义了所有对象都具备的功能。
API（应用程序接口）文档

*/

class Person extends Object
{
	private int age;
	Person(int age)
	{
		this.age = age;		
	}
	
	//判断是否是同龄人。这个方法也是在比较两个person对象是否相等。
	//注意：Person类中是否有比较两个Person对象相等的方法？有的。因为继承Object，它本身就具备这equals方法。
	//既然有，还需要定义compare方法吗？不需要。
	//但是，equals方法判断的是地址，不是我们所需要的内容。
	//咋办？继续使用Object的equals方法，但是建立子类的自己的内容，传说中的重写。
	//重写。
	/*
	
	【记住：以后判断对象是否相同，就需要覆盖equals方法。】
	
	*/
	
	public boolean equals(Object obj)//Object obj = new Person(); obj.age;上帝中没有年龄
	{
		//建立Person自己的判断相同的依据。判断年龄是否相同。
		
		//return this.age == obj.age;

		//obj所属类型Object，Object中没有定义age，所以编译失败。成员变量多态调用看左边。
		
		//如果调用该方法的对象和传递进来的对象是同一个，就不要进行转型和判断了，直接返回true。效率高一点。
		if (this == obj)
			return true;

		//age是Person类型的属性。既然要用到子类型的内容，需要向下转型。
		if (!(obj instanceof Person))
		//	return false;
			throw new ClassCastException("类型是不对的！请改正。");
		Person p = (Person)obj;

		return this.age == p.age;

	}
	/*
	public boolean compare(Person p)
	{
		return this.age == p.age;
	}
	*/

	//覆盖toString方法，建立Person对象自己的字符串表现形式。
	public String toString()
	{
		//return "haha";
		return "Person[age = "+age+"]";
	}
}

class Dog
{
	
}

class ObjectDemo 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(12);
		Person p2 = new Person(13);
		//p1.equals(new Dog()); //抛出异常。

		//System.out.println(p1.equals(p2));

		
		System.out.println(p1.toString());//Person@da4b71//想要建立自定义的字符串表现形式。咋办？覆盖toString方法就哦了。
		System.out.println(p2);

		//System.out.println(p1.compare(p2));
		//System.out.println(p1 == p2);//new了两个新的对象，地址不一样
		//System.out.println(p1.equals(p2));
	}
}
