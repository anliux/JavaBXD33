class ArrayDemo2 
{
	public static void main(String[] args) 
	{
		//数组的两个常见错误：
		
		
		int[] arr = new int[3];
		
		System.out.println(arr[3]);

		/*
		
		编译不报错，没有语法错误；运行报错

		ArrayIndexOutOfBoundsException-数组脚标越界异常：
			访问到了数组不存在的索引时，会发生该异常。

		*/

		arr = null;
		System.out.println(arr[0]);

		/*
		
		NullPointerException-空指针异常：
			当使用没有任何实体指向的引用变量操作实体时，运行会发生该异常。

	}
}
