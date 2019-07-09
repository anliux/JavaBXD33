/*
对以下代码进行简化。
匿名内部类：其实就是一个带有内容的子类对象
格式：new 父类or接口(){子类的内容}
匿名内部类就是内部类的简化形式
别忘了，匿名内部类有前提，内部类必须要继承父类或者实现接口。
父类有很多功能时，不建议匿名，代码阅读性会非常差。
*/

abstract class AbsDemo
{
	abstract void show();
}

class Outer
{
	int num = 3;
	/*
	class Inner extends AbsDemo 
	{
		void show()
		{
			System.out.println("num="+num);
		}
	}
	*/
	
	public void method()
	{
		//new Inner().show();
		/*
		不想创建具体的子类型，还想创建AbsDemo的子类对象
		怎么实现呢？没有子类型，干脆，直接使用父类型
		可是在该例子中是抽象类，怎么可以new对象呢？
		抽象类之所以不能new对象，是因为抽象方法没重写。直接重写不就哦了
		*/
		new AbsDemo()
			  //这就是传说中的一个AbsDemo的子类对象。只不过有点胖，是个带着内容的子类对象
		      //这种写法有一个称呼：匿名内部类
		{
			//重写抽象的show方法
			void show()
			{
				System.out.println("num==="+num);
			}
		}.show();
	}
}

class InnerClassDemo5
{
	public static void main(String[] args) 
	{
		Outer out = new Outer();
		out.method();
	}
}

