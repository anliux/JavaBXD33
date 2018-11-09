class SwitchDemo 
{
	public static void main(String[] args) 
	{
		/*
		
		switch语句演示：

		1、4个关键字
		2、case标签不能重复，重复产生不确定性，这在Java里是不允许的。
		3、各个case和default摆放没有顺序，
		   但case->default有顺序，各个case分别按顺序执行。
		4、遇到break或运行到switch语句结尾时结束
		5、x的数据类型：byte short int char 5.0加上enum，7.0加上String
		   java还没有放弃switch语句。

		
		
		*/
		
		int x = 2;
		
		switch (x){
			case 5:
				System.out.println("a");
				//break;

			default:
				System.out.println("c");
				//break;

			case 3:
				System.out.println("b");
				break;
			//当前两个break被注释后，x没有找到case，执行default
			//default结尾没有break，会继续向下执行直到遇到break或switch结束
			//最后输出：c b
		}

		System.out.println("Hello World!");
	}
}
