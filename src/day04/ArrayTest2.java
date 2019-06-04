class ArrayTest2 
{
	public static void main(String[] args) 
	{
		int[] arr = {99,76,43,24,10000};

		int max = getMax2(arr);

		System.out.println("max="+max);
	}


	//求最值：
	/*
	需求：获取多个整数中的最大值

	思路：
		1、数据多了为了方便操作，先存储起来。需要容器。用数组。
		2、多个数据需要进行比较。每次都有较大的数。需要记录下来和下一个数比较。
		3、数组中的元素都比一遍。最后，就有了最大值。

	步骤：
		1、需要数组。
		2、定义一个变量，记录住较大的数。
		3、对数组进行遍历。让元素和较大的值进行比较。
		   如果元素大于较大的数，用变量记录该元素。
		4、遍历完成后，变量中记录的就是最大值。

	定义功能：
		明确1：结果？int
		明确2：参数？int[]

	*/

	public static int getMax(int[] arr)
	{
		//1、定义变量。初始化为数组中的任意一个元素(不要盲目定义为0)
		int max = 0;

		//2、遍历数组
		for (int x=1; x<arr.length; x++)//从第二个，即arr[1]开始即可。
		{
			//遍历的元素只要比max大，就记录下来。遍历到最后，max中记录的就是最大值。
			if(arr[x] > arr[max])
				max = x;
		}
		return arr[max];


	}
	
	//另一种max初始化为0的思路。则初始化为脚标。
	public static int getMax2(int[] arr)
	{
		int max = 0;
		
		for (int x = 1; x<arr.length; x++)
		{
			if (arr[x] > arr[max])
				max = x;
		}
		
		return arr[max];
	}



}
