/*
	什么时候定义静态变量呢？
	当该成员变量的值，每一个对象都一致时，就对该成员变量进行静态修饰。

	静态变量和成员变量的区别：
	1、所属范围不同
	   静态变量所属于类，成员变量所属于对象。
	   静态变量也称为：类变量。成员变量也称为：实例变量或对象变量。
	
	2、调用不同
	   静态变量可以被对象和类调用（一般都用类名调用）
	   成员变量只能被对象调用。

	3、加载时期不同
	   静态变量随着类的加载而加载
	   成员变量随着对象的加载而加载

	4、内存存储区域不同
	   静态变量存储在方法区中
	   成员变量存储在堆内存中
*/

class Circle
{
	private double radius;//圆的半径。
	private static double pi = 3.14;

	Circle(double radius)
	{
		this.radius=radius;
	}
	//获取圆的面积。
	double getArea()
	{
		return radius*radius*pi;
	}
	static void show()
	{
		System.out.println("circle show run.."+pi);
	}
}

class CircleDemo
{
	public static void main(String[] args) 
	{
		Circle c = new Circle(4);
		double area = c.getArea();
		Circle.show();
	}
}
