/*
描述长方形：
	属性：长和宽
	行为：获取面积

考虑健壮性问题：
万一长和宽的数值非法
描述问题，将问题封装成对象，用异常的方式来表示。

不知道要继承 编译时异常 还是 运行时异常：分析一下
*/
class NoValueException extends RuntimeException
{
	NoValueException()
	{
		super();
	}
	NoValueException(String message)
	{
		super(message);
	}
}

class Rec
{
	private int length;
	private int width;
	//矩形初始化即有长和宽，故定义构造函数
	Rec(int length, int width)
	{
		if (length<0 || width<0)
		{
			//抛出异常，但是不用声明，不需要调用者处理。就需要一旦问题发生，让调用者端停止，让其修改代码。
			throw new NoValueException("长或宽的数值非法");
		}
		this.length = length;
		this.width = width;
	}
	/**
	定义面积函数
	*/
	public int getArea()
	{
		return length*width;
	}
}

class ExceptionTest
{
	public static void main(String[] args) 
	{
		Rec r = new Rec(-3,4);
		int area = r.getArea();
		System.out.println("area="+area);
	}
}
