class 毕姥爷
{
	public void 讲课()
	{
		System.out.println("讲管理");
	}
	public void 钓鱼()
	{
		System.out.println("钓鱼");
	}
}

class 毕老师 extends 毕姥爷
{
	public void 讲课()
	{
		System.out.println("java");
	}
	public void 看电影()
	{
		System.out.println("看电影");
	}
}

class DuoTaiTest 
{
	public static void main(String[] args) 
	{
		毕姥爷 x = new 毕老师();//多态，向上转型
		x.讲课();
		x.钓鱼();
		//x.看电影();//不行。
		//想要使用毕老师的特有方法时，需要向下转型。
		if (x instanceof 毕老师)
		{
			毕老师 y = (毕老师)x;
			y.看电影();
		}
		//自始至终都是子类对象做着类型的变化。
	}
}
