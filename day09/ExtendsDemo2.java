/*

子父类中成员函数的特点：

特殊情况：
子父类中定义了一模一样的函数。
运行结果是：子类的函数在运行。
这种情况在子父类中，是函数的另一个特性
override（重写、覆盖、复写）


重写什么时候用？

4举例：
//描述手机
class Phone
{
	//来电显示。
	void show()
	{
		System.out.println("电话号码");
	}
}
Phone p = new Phone();
p.show();


随着电话的升级，只显示号码不爽，希望显示姓名、大头贴。
修改源码，虽然费劲，但是可以解决，不利于后期的维护和扩展。

为了扩展方便，新功能是不是新的电话具备呢？
单独描述单独封装。新电话也是电话中的一种。继承。直接获取父类中的功能。

但是新电话的来显功能已经变化了，需要重新定义。
那么定义一个新功能合适吗？直接用就可以了。
如果子类的来显功能内容不同，只需要保留来显功能，定义子类的内容即可。
这就是重写的应用。

class NewPhone extends Phone
{
	void show()
	{
		//System.out.println("电话号码")；
		super.show();//如果还需要父类中原有的部分功能，可以通过super调用。
		System.out.println("姓名");
		System.out.println("大头贴");
	}
}


重写（覆盖）的注意事项：
1、子类覆盖父类，必须保证全要大于或者等于父类的权限。
Fu:
(public) void show(){}
//private void show(){}//私有不列在覆盖范围之内。只能在父类本类中访问

Zi:
public void show(){}

2、静态覆盖静态（父类和子类均为静态时）

写法上稍微注意：必须一模一样
即函数的返回值类型、函数名、参数列表都要一样。
注：重载-看参数列表不同，不看返回值类型不同。


*/
class Fu
{
	void show()
	{
		System.out.println("fu show run");
	}
}

class Zi extends Fu
{
	/*
	void show() //功能父类有了，直接拿来用即可。
	{
		System.out.println("zi show run"); 
	}
	*/
}

class ExtendsDemo2 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.show();
	}
}
