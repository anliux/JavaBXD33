class IfDemo 
{
	public static void main(String[] args) 
	{
		//if格式一：
		int x = 3;
		if(x > 1)
		{
			System.out.println("yes");
		}
		
		System.out.println("Over");

		//if格式二：
		int b = 1, c;
		if(b > 1)
		{
			c = 100;//记得加分号
		}
		else
		{
			c = 200;
		}
		//和三元运算符很像。理解为三元运算符是if else的简写形式。
		//区别：不是所有的if else都能简化，因为三元运算符运算完必须有结果。

		//if格式三：
		int i = 3;
		if(i > 1)
		{
			System.out.println("a");//符合，执行完毕此条语句。
		}
		else if (i >2)
		{
			System.out.println("b");
		}
		else 
		{
			System.out.println("c");
		}

	}
}
