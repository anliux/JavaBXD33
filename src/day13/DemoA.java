package packa;
public class DemoA extends packfu.DemoFu // 不加public，相当于封装在包里，包之外是访问不到的。
			//加了public的类，保存成.java文件时，必须文件名与public类完全一样，包括大小写。
			//方便编译器，当找不到class文件时，可以去找.java文件
{
	public void show() 
	{
		showFu();
		System.out.println("demoa show run");
	}
}
