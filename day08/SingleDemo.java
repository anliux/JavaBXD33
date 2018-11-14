 /*
 设计模式：解决某一类问题行之有效的解决办法（思想）。
 单例（singleton）设计模式：
 学习设计模式必须先弄清楚它是解决什么问题的。
 单例是解决什么问题的呢？
 可以保证一个类的对象唯一性。

 场景：比如多个程序都要使用一个配置文件中的数据，而且要实现数据共享和交换。
       必须要将多个数据封装到一个对象中。而且多个程序操作的是同一个对象。
	   那也就是说，必须保证这个配置文件对象的唯一性。
 
 怎么能保证对象的唯一性呢？
 1、一个类只要提供了构造函数，就可以产生多个对象，完全无法保证唯一。
    既然数量不可控，干脆，不让其他程序建立对象。
 
 2、不让其他程序创建，对象何在？
    干脆，自己在本类中创建一个对象，这样好处是什么？可控。

 3、创建完成后，是不是要给其他程序提供访问的方式。

 怎么实现这个步骤呢？
 1、怎么就能不让其他程序创建对象呢？
    直接私有化构造函数，不让其他程序创建的对象初始化。

 2、直接在本类中new一个本类对象。

 3、定义一个功能，其他程序可以通过这个功能获取到本类的对象。

 */

//饿汉式。开发常用。
class Single
{
	//2、创建一个本类对象。
	private static /*final*/ Single s = new Single();
	
	//1、私有化构造函数。
	private Single(){}

	//3、定义一个方法返回这个对象。
	public static Single getInstance()
	{
		return s;
	}
}

//懒汉式
//单例的延迟加载方式。面试最多的是懒汉式。
class Single2
{
	private static Single2 s2 = null;

	private Single2(){}

	public static Single2 getInstance()
	{
		if (s2 == null)
			s2 = new Single2();
		return s2;
	}
}

class SingleDemo
{
	public static void main(String[] args) 
	{
		//要想获取Single的对象。调用getInstance方法。
		//既然无法通过对象调用，只能用类名调用，所以这个方法必须是static。
		Single ss = Single.getInstance();
		Single ss2 = Single.getInstance();

		Single ss = Single.s;//这种方式是可以实现，加入方法来获取就是为了对对象可控
		Single ss2 = Single.s;
	}
}
