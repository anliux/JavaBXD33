class ArrayTest 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,54,32,78,90};
		int[] arr2 = {12,34,56,78,90};

		//int sum = add(arr);//或 int sum = add(arr2);
		System.out.println("sum="+add(arr));
	}

	//求和：获取多个数的功能。
	/*
	明确1：结果？和int
	明确2：参数？多个数，定义多个参数合适吗？
		   既然是一组数，定义为数组。	
	*/
	public static int add(int[] arr)
	{
	//1、定义变量记录和。
	int sum = 0;

	//2、通过循环对数组进行遍历。
	for (int x=0; x<arr.length; x++)
	{
		sum = sum + arr[x];
	}
	
	return sum;
	
	}
}
