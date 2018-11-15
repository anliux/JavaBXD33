/*
需求：公司中程序员有姓名、工号、薪水、工作内容。
项目经理除了有姓名、工号、薪水，还有奖金，工作内容。
对给出需求进行数据建模。

在问题领域中先找寻其中涉及的对象。
程序员
	属性：姓名，工号，薪水
	行为：工作

项目经理
	属性：姓名，工号，薪水，奖金
	行为：工作

这些对象是否有关系呢？因为发现了他们之间的共性，应该存在着关系。
可以将他们的共性向上抽取到共性类型：员工
员工：
	属性：姓名，工号，薪水
	行为：工作
发现员工的工作内容本身就不具体。应该是抽象的。由具体的子类来体现的。

一定要动手！
*/
abstract class Employee
{
	private String name;
	private String id;
	private double pay;
	/**
	构造一个员工对象，一初始化就具备这三个属性。
	*/
	public Employee(String name,String id,double pay)
	{
		this.name = name;
		this.id = id;
		this.pay = pay;
	}

	/**
	工作行为。
	*/
	public abstract void work();
}

//具体的子类：程序员。
class Programmer extends Employee
{
	public Programmer(String name,String id,double pay)
	{
		super(name,id,pay);
	}
	public void work()
	{
		System.out.println("code....");
	}
}

//具体的子类：经理。
class Manager extends Employee
{
	//特有属性。
	private double bonus;
	public Manager(String name,String id,double pay,double bonus)
	{
		super(name,id,pay);
		this.bonus = bonus;
	}
	public void work()
	{
		System.out.println("manage");
	}
}

class AbstractTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
