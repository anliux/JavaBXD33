/*
静态的主函数：
	public static void main(String[] args) 
public : 权限最大
static ：不需要对象。直接用给定的类名就可以访问该函数了。
void   ：不需要返回值
main   ：函数名，该名称是固定的。不是关键字。
(String[] args) : 主函数的参数列表，字符串数组类型的参数。
args   ：arguments 参数。该名称就是一个变量名。

*/


class MainDemo
{
	public static void main(String[] args) 
	{
		System.out.println(args);//[Ljava.lang.String;@1db9742 //根据这个结果，说明jvm传递了一个字符串类型的数组实体。
		System.out.println(args.length);//0, 得出结论 jvm传递的是 new String[0];

		//System.out.println(args[0]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0 
									  //没有值，脚标为0的也不存在。
		//早期给主函数传值的方式：命令行 java MainDemo 空格 + 要传的值 + 回车(eg. java MainDemo haha hehe xixi)
		//并用for循环输出全部值
		for (int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}

	void show()
	{
		System.out.println("show run");
	}
}
