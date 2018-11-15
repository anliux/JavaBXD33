/*
继承出现后，在代码中的体现 

重点在于成员的体现：
1、成员变量。重点明确原理。
	特殊情况：(开发中不写)
		子父类中定义了一模一样的成员变量。
		都存在于子类对象中。
		如何在子类中直接访问同名的父类中的变量呢？
		通过关键字super来完成。

		super和this的用法很相似。
		this：代表的是本类的对象的引用。
		super：代表的是父类的内存空间。

		this可以直接用：
		System.out.println(this);//输出对象的类型和哈希值
		super不可以直接用：
		System.out.println(super);//报错，缺. super必须带着.或者()用
		
		注意：这种情况开发见不到，因为父类一旦描述完了属性，子类直接使用就可以了。


2、成员函数。
3、构造函数。

*/

//父类。
class Fu
{
	// /*private*/int num1 = 3;//父类中私有的内容子类不可以直接访问。
	int num = 3;
}

class Zi extends Fu
{
	// int num2 = 4;
	int num = 4;
	void show()
	{
		/*
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		*/

		System.out.println("zi num="+this.num);
		System.out.println("fu num="+super.num);

	}
}

class ExtendsDemo
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		/*
		System.out.println(z.num1);
		System.out.println(z.num2);
		*/
		z.show();
	}
}
