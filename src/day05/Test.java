class Test 
{
	public static void main(String[] args) 
	{
		int[] arr = {23,14,88,5};
		printArray(arr);
		
		reverse(arr);
		printArray(arr);
	}

	/*
	
	对一个给定的数组，进行反转：
	{23,14,88,5} --> 
	{5,88,14,23}

	思路：头尾互换
	
	*/
	public static void reverse(int[] arr)
	{
		for (int start=0,end=arr.length-1; start<end; start++,end--)
		{
			swap(arr,start,end);
		}	
	}

	//封装两数互换功能：
	public static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	//打印数组功能：
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for (int x=0; x<arr.length; x++)
		{
			if(x != arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
		}
	}

}
