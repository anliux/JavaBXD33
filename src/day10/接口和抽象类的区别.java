接口和抽象类的区别？

描述事物：
犬：按照功能分类 - 导盲犬，缉毒犬...

犬：
	吼叫();
	吃饭();

abstract class 犬
{
	public abstract void 吼叫();
	public abstract void 吃饭();
}
class 缉毒犬 extends 犬
{
	public void 吼叫(){}
	public void 吃饭(){}
	public void 缉毒(){}
}
//对于缉毒，有可能还有缉毒猪，具备着缉毒功能，应该将缉毒功能抽取。
//对缉毒进行描述
abstract class 缉毒
{
	public abstract void 缉毒();
}

缉毒犬既需要犬的功能又需要缉毒的功能。
无法直接多继承。
是否可以多实现呢？可以的。
犬是接口，缉毒也是接口。缉毒犬多实现即可。
类负责描述的是事物的基本功能。接口负责描述事物的扩展功能。
缉毒犬是犬中一种，is a 关系。
将犬定义成类，而缉毒是犬的一个扩展功能，这时将缉毒定义为接口。

这时，描述就变成了这样：

abstract class 犬
{
	public abstract void 吼叫();
	public abstract void 吃饭();
}
interface 缉毒able
{
	public abstract void 缉毒();
}
class 缉毒犬 extends 犬 implements 缉毒able
{
	public void 吼叫(){code....}
	public void 吃饭(){}
	public void 缉毒(){}
}



小结：
1、抽象类是描述事物的基本功能，可以定义非抽象的方法。
   接口中定义只能是抽象方法，负责功能的扩展。
2、类与类之间是继承关系，is a 关系。
   类与接口之间是实现关系，like a 关系。

门
	open();
	close();

报警门。

class 门
{
}
interface 报警
{
}

class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
