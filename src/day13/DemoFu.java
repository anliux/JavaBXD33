package packfu;

public class DemoFu
{
	/*public*/protected/*保护权限，只给子类用*/ void showFu()//保护权限开发用的不多，必须先继承才能用
										//包与包之间用不了，本包可以。
	{
		System.out.println("demofu showfu run");
	}
}