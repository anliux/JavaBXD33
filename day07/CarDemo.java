class Car 
{
	//描述属性：颜色，轮胎数。
	String color;
	int number;

	//描述行为：
	void run() 
	{
		System.out.println(color+":"+number);
	}
}

//写100个class，最终也只有一个class中含主函数，即入口。
class CarDemo
{
	//定义主函数，为了让程序运行起来
	public static void main(String[] args)
	{
		/*
		//创建Car.class类的对象
		Car c = new Car();//类类型变量一定指向对象
		//c = null;//引用型变量，当不指向对象时，指向null

		//调用对象的成员
		c.color = "red";
		c.number = 4;
		c.run();
		*/

		//Car c = new Car();
		//c.run();
		//简化成这样的写法：
			new Car().run();
			//这个对象没有名字，这就是传说中的匿名对象。

		/*
		记住：凡是简化的，通常都有局限。

		匿名对象的局限：

		*/
		new Car().color = "red";
		new Car().number = 4;
		new Car().run();//结果是 null:0

		/*
		那匿名对象有什么用呢？简化书写。
		使用场景：当对象对方法进行调用，且只调用一次时，可以简化成匿名对象书写
		
		Car c = new Car();
		c.run();
		c.run();
		c.run();//对此调用同一对象

		new Car().run();
		new Car().run();
		new Car().run();//调用三次不同的对象

		//对象不同，不能简化
		//记住：当对象需要调用多次成员时，不可以简化成匿名对象调用

		
		*/
	}
}
