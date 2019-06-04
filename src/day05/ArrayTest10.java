class ArrayTest10 
{
	public static void main(String[] args) 
	{
		int[] arr = {9,12,15,24,36,41,59,68};

		int index = binarySearch(arr,45);//45不存在于原数组中，返回-1
		
		System.out.println("index:"+index);
	}

	//需求：查找一个元素在数组中第一次出现的位置。
	public static int searchKey(int[] arr, int key)
	{
		//遍历查找。(效率低)
		for (int x=0; x<arr.length; x++)
		{
			if (arr[x] == key)
				return x;
		}
		return -1;//-1：代表脚标不存在的情况(脚标均未非负)
	}

	//二分查找 (折半查找) 前提：数组必须是有序的。无序就用普通查找即可。

	/*

	思路：
	1、通过脚标先获取中间脚标上的元素
	2、让该元素和要找的数据比较。
	3、如果要找的数大了，缩小范围，要找的范围应该是 mid+1--max
	   如果要找的数小了，要找的范围为 mid -- mid-1
	4、不断如此重复，就可以找到元素对应的脚标。	
	
	*/
	
	public static int binarySearch(int[] arr, int key)
	{
		//定义三个变量，记录头脚标，尾脚标，中间脚标。
		int min, max, mid;
		min = 0;
		max = arr.length - 1;
		mid = (max+min) >> 1;

		while (arr[mid] != key) //判断是否与中间值相等
		{
			if(arr[mid] > key)
				max = mid - 1;
			else if(arr[mid] < key)
				min = mid + 1;

			//判断元素是否存在：
			if(max<min)
				return -1;

			mid = (min+max)/2;
		}

		return mid;
	}
	

	//另一种相同思路，不同形式的写法：
	public static int binarySearch(int[] arr, int key)
	{
		int min, max, mid;
		min = 0;
		max = arr.length-1;

		while (min <= max) //判断头尾脚标是否有距离
		{
			mid = (min+max) >> 1;

			if(key > arr[mid])
				min = mid + 1;
			else if(key < arr[mid])
				max = mid - 1;
			else
				return mid;
		}
		return -1;
	}
}
