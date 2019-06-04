/*
阶段一需求：笔记本电脑运行。
按照面向对象的思想，用代码体现。
名称提炼法。
笔记本电脑。
	行为：运行。

class NoteBook
{
	//运行功能。
	public void run()
	{
		System.out.println("notebook run");
	}
}

阶段二需求：想要在笔记本电脑上加上一个手握式鼠标。
多了个对象：鼠标。	
				行为：开启，关闭。

class Mouse
{
	public void open()
	{
		System.out.println("mouse open");
	}
	public void close()
	{
		System.out.println("mouse close");
	}
}
//笔记本怎么用鼠标呢？
在笔记本中多一个使用鼠标的功能。
需要修改原来的笔记本类中的内容，添加一个功能。
class NoteBook
{
	//运行功能。
	public void run()
	{
		System.out.println("notebook run");
	}
	//使用鼠标功能。
	public void useMouse(Mouse m)
	{
		if(m!=null)
		{
			m.open();
			m.close();
		}
	}
}

//问题：如果想要加入一个键盘呢？
只要描述一个键盘类，并在电脑类中加入一个使用键盘的功能就哦了。
但是发现从鼠标开始这个问题就已经产生了。
一旦需要添加新设备时，都需要改变电脑的源码。这个扩展性是非常差的。

设计上该如何改进呢？
之前的问题在于外围设备的增加和笔记本电脑之间的耦合性过高。
如何降低外围设备和笔记本电脑的耦合性呢？
外围设备还不确定，我们不要面对外围的具体设备。
为了让笔记本可以使用这些设备，可以事先定义好一些规则（契约）
笔记本只要使用这些规则就可以了。
有了这些规则，就可以进行笔记本功能的扩展。
后期这些外围设备只要符合这些规则就可以被笔记本使用了。

那么规则在java中该如何体现呢？接口。

//1、描述接口。USB

//2、描述笔记本电脑：运行功能，使用USB接口的功能。
*/

//USB接口定义。
interface USB
{
	void open();
	void close();
}

//描述笔记本电脑
class NoteBook
{
	public void run()
	{
		System.out.println("notebook run");
	}

	//使用USB接口的功能。
	public void useUSB(USB usb)//接口类型的变量。接口类型的变量指向自己的子类对象。
	{								//USB usb = new Mouse();//多态。
		if (usb!=null)
		{
			usb.open();
			usb.close();
		}
	}
}

//需要鼠标。想要被笔记本电脑使用，该鼠标必须符合规则。
//描述鼠标。
class Mouse implements USB
{
	public void open()
	{
		System.out.println("mouse open");
	}
	public void close()
	{
		System.out.println("mouse close");
	}
}

//描述键盘。
class KeyBoard implements USB
{
	public void open()
	{
		System.out.println("KeyBoard open");
	}
	public void close()
	{
		System.out.println("KeyBoard close");
	}
}

/*
发现，接口的出现：
1、扩展了笔记本电脑的功能。
2、定义了规则
3、降低了笔记本电脑和外围设备之间的耦合性。
*/

class DuoTaiTest2 
{
	public static void main(String[] args) 
	{
		NoteBook book = new NoteBook();
		book.run();
		//book.useMouse(null);
		//book.useMouse(new Mouse());
		book.useUSB(null);
		book.useUSB(new Mouse());
		book.useUSB(new KeyBoard());
	}
}
