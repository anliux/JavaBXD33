class Array2Demo2 
{
	public static void main(String[] args) 
	{
		//二维数组的另一种定义方式：

		int[][] arr = {{23,17,11},{88,11,33,90},{11,78,34}};

		//求和：
		int sum = 0;
		for (int x=0; x<arr.length; x++) 
			//二维数组的长度即其中一维数组的个数，也就是第一个[]中的数字。
		{
			for (int y=0; y<arr[x].length; y++)
			{
				sum += arr[x][y];
			}
		}
		
		
		
		System.out.println("sum="+sum);
	}
}
