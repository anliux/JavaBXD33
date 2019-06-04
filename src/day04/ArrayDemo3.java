class ArrayDemo3 
{
	public static void main(String[] args) 
	{
		//数组定义的第二种格式：

		//int[] arr = new int[]{};
		//int[] arr = {};

		//如何获取数组的长度？通过数组的属性length

		int[] arr = {1,4,55,65,34,22,98,90,56,34,11};

		System.out.println(arr.length);

		for (int x = 0; x<arr.length; x++)
		{
			System.out.println("arr["+x+"]="+arr[x]);
		}
		
		
		System.out.println("Hello World!");
	}
}
