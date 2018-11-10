class MethodDemo 
{
	public static void main(String[] args) 
	{
		//主函数只用于调用，不用于定义功能。
		
		//调用自定义的方法
		draw(-4, 6);

		draw(7, -8);
		
		draw(2, 3);


	}

	/*

	问题：要画矩形，需要不断使用for嵌套循环，造成代码复用性很差
	解决：定义一个功能用于画矩形，每次只要使用该功能即可，提高复用性

	如何定义一个功能呢？
	1、它应该是一个封闭的空间，就是大括号
	2、需要有名称
	3、需要有参与运算的数据
	4、需要定义该功能的结果类型

	*/
	public static void draw(int row, int col)
	{
		for (int x = 0; x <= row; x++)
		{
			if (row<0)
				return;//控制当row为负时，直接结束功能。
			//当没有此if时，row或col为负时，结果差不多，运行可能更冗余
			//不写if时：row<0则不输出，col<0则只输出空行


			for (int y = 0; y <= col; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
