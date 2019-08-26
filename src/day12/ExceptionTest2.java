/*
案例2：毕老师用电脑讲课。
两个对象：
	老师：
		属性：姓名
		行为：讲课
	电脑：
		行为：运行

考虑问题：
1、电脑蓝屏-->异常。
2、电脑冒烟-->异常。
*/

//可以声明，让调用者给出处理方式。
//异常1：电脑蓝屏
class LanPingException extends Exception //异常在电脑运行时发生
{
	LanPingException()
	{
		super();
	}
	LanPingException(String message)
	{
		super(message);
	}
}

//异常2：电脑冒烟
class MaoYanException extends Exception //异常在电脑运行时发生
{
	MaoYanException()
	{
		super();
	}
	MaoYanException(String message)
	{
		super(message);
	}
}

/*
思想分析：
讲课中冒烟，问题可以临时解决，但是冒烟问题没有直接处理，所以使用throws声明
但是发现，这个问题不应该属于讲课的问题。调用讲课方法的调用者是处理不了这个冒烟问题的
该调用者能处理的应该是冒烟导致的课程进行不下去的问题。
应该再列出一个异常：课时停止异常。
*/

//异常3：课时停止异常
class NoPlanException extends Exception 

{
	NoPlanException()
	{
		super();
	}
	NoPlanException(String message)
	{
		super(message);
	}
}


class NoteBook
{
	private int state = 2;
	//一个方法可以通过throws声明多个问题
	public void run()throws LanPingException, MaoYanException
	{		
		System.out.println("笔记本电脑运行");
		if(state == 1)
			throw new LanPingException("电脑蓝屏了");
		if(state == 2)
			throw new MaoYanException("电脑冒烟了");
	}
	public void reset()
	{
		state = 0;
		System.out.println("电脑重启了");
	}
}

class Teacher
{
	private String name;
	private NoteBook book;
	Teacher(String name)
	{
		this.name = name;
		book = new NoteBook();	
	}
	//讲课
	public void prelect()throws NoPlanException//编译时异常，声明
	{
		/*
		调用到了声明异常的方法，在这里到底是捕获还是声明？
		有具体的捕获处理方法吗？有，捕获；没有，声明。
		可以处理，重启就可以了，重启是电脑的功能。
		*/
		try
		{
			book.run();
			//对于声明多个异常的方法，在处理时，需要定义多个catch与之对应
		}
		//注意<面试多见>：可以一个try多个catch，存在子父类异常时，子类上，父类下，因为catch是顺序执行的，父类上则子类执行不到了
		catch (LanPingException e)//LanPingException e = new LanPingException("电脑蓝屏了");
		{
			//重启
			System.out.println(e.toString());//异常的名称+异常的信息
			e.printStackTrace();//显示异常的各种详细信息，同默认的jvm抛出异常的结果
			book.reset();
		}
		catch(MaoYanException e)//已经new了，e就是new好的异常对象，不用再new
		{
			//有处理方式，即做练习，但是冒烟异常还没处理。
			System.out.println(e.toString());
			test();
			//但是还在讲课
			//冒烟问题没有解决，继续声明throws出去
			//throw e;

			//异常转换：开发很常见
			throw new NoPlanException(e.getMessage()+"，课时停止");//getMessage获取的是本catch传进来的产生MaoYan异常中的信息
		}
		System.out.println(name+"....讲课");
	}
	//电脑冒烟的时候，老师留练习
	public void test()
	{
		System.out.println("做练习");
	}
}

class ExceptionTest2
{
	public static void main(String[] args) 
	{
		Teacher t = new Teacher("毕老师");
		try
		{
			t.prelect();
		}
		catch (NoPlanException e)
		{
			System.out.println(e.toString());
			System.out.println("换老师");
		}
		
		System.out.println("Hello World!");
	}
}
