/*
继承的弊端：打破封装性。
不让其他类继承该类，就不会有重写。
怎么能实现呢？通过Java中的一个关键字来实现，final（最终化）

【final关键字】
是一个修饰符，可以修饰类、方法、变量（成员变量，局部变量，静态变量）
【特点】
1、final修饰的类是一个最终类，不能再派生子类。
如果类中出现部分可以重写，部分不可以，怎么办？只要让指定的方法最终化就可以了。
2、final修饰的方法是最终方法，不可以给重写。
3、final修饰的变量是一个常量，只能被赋值一次。
【什么时候会在程序中定义final常量呢？】
当程序中一个数据使用时是固定不变的，这时为了增加阅读性，可以给该数据起个名字。
这就是变量，为了保证这个变量的值不被修改，加上final修饰，这就是一个阅读性很强的常量。
书写规范：被final修饰的常量名所有的字母都是大写的。如果由多个单词组成，单词间通过 _ 连接。

*/
/*final*/class Fu
{
	/*final*/void show()
	{
		//调用到一些系统的功能。
		//功能的内容是不可以改变的。
	}
}

class Zi extends Fu
{
	static final int number = 9;//最终化的是显示初始化值。
	static final double PI = 3.14;
	//重写。
	void show()
	{
		final int count = 21;
		//count = 2;
		System.out.println();
	}
}

class FinalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
