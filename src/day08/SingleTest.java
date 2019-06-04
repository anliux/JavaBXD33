//描述超人。
class SuperMan
{
	private String name;
	private static SuperMan man = new SuperMan("克拉克");
	private SuperMan(String name)
	{
		this.name = name;
	}

	public static SuperMan getInstance()
	{
		return man;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	public void fly()
	{
		System.out.println(this.name+"..fly");
	}
}

class  SuperMan
{
	public static void main(String[] args) 
	{
		//超人对象应该是唯一的。保证SuperMan的唯一性。可使用单例模式解决。
		//SuperMan man = new SuperMan("克拉克");
		SuperMan man1 = SuperMan.getInstance();
		SuperMan man2 = SuperMan.getInstance();
		man1.setName("英雄");
		man2.fly();
	}
}
