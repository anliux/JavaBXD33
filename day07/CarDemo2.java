class  Car
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

class CarDemo2
{
	public static void main(String[] args)
	{
		/*
		Car c = new Car();
		c.color = "red";
		c.number = 4;
		c.run();

		Car c1 = new Car();
		c1.color = "red";
		c1.number = 4;
		c1.run();
		*/

		//以上代码的复用性有点差。只有对象不同，而调用的成员和赋值都相同
		//可以进行抽取。定义一个功能，将重复代码封装。

		/*
		封装功能后，再使用，就简单了。
		*/
		Car c = new Car();
		Car c1 = new Car();
		show(c);//简化成 show(new Car());//把匿名对象作为实际参数进行传递
	}

	//功能结果是什么呢？没有具体值。所以是void
	//功能的未知部分是什么呢？对象不明确。可以将其定义为参数
	public static void show(Car cc)
	{
		cc.color = "red";
		cc.number = 4;
		cc.run();
	}


}