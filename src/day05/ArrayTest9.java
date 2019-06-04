import java.util.Arrays;//引入。
class ArrayTest9 
{
	//选择排序

	public static void main(String[] args) 
	{
		int[] arr = {12,9,23,77,6,34};
		printArray(arr);

		//selectSort(arr);
		//bubbleSort(arr);
		Arrays.sort(arr);//调用Java已经写好的功能。详见API文档。

		printArray(arr);

		System.out.println("Hello World!");
	}

	//打印数组的方法：
	public static void printArray(int[] arr)
	{
		for (int x=0; x<arr.length; x++)
		{
			if (x != arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]);
		}
	}

	//选择排序：
	public static void selectSort(int[] arr)
			//void:对传入地址指向的栈堆中的数组进行排序操作，无返回值。
	{
		//两个循环嵌套：
		//由第二位开始分别与所有脚标更大位置比较大小
		for (int x=0; x<arr.length-1; x++)
		{
			//拿最末一个位置与其他所有脚标更大位置的数比较大小。
			for (int y=x+1; y<arr.length; y++)
			{
				//当x比y大时，换位，利用第三方变量。
				if(arr[x]>arr[y])
				{
					/*
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
					*/
					swap(arr,x,y);
				}
					
			}
		}
	}

	//冒泡排序：
	public static void bubbleSort(int[] arr)
	{
		//外循环：循环arr.length-1次(n个数，n-1个间隔)，从0开始，故只能取到<arr.length-1
		for (int x=0; x<arr.length-1; x++)
		{
			
			//内循环：最大数递减，借助变化的x实现
			for (int y=0; y<arr.length-1-x; y++)
			{
				if (arr[y]>arr[y+1])
				{
					/*
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
					*/
					swap(arr,y,y+1);

				}
			}
		}
	}

	//发现排序方法中，位置置换代码重复，进行抽取。
	public static void swap(int[] arr, int a, int b)//三个参数，包括arr数组。
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
