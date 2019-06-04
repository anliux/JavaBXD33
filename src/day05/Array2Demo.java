class  Array2Demo
{
	public static void main(String[] args) 
	{
		//二维数组：
		int[][] arr = new int[3][2];


		System.out.println(arr);//[[I@15db9742 : 二维数组实体。
		
		System.out.println(arr[0]);//[I@6d06d69c : 一维数组实体。
		
		System.out.println(arr[0][0]);//0 ：一维数组中的元素

		
		//另一种定义方式
		int[][] array = new int[3][];
			//明确了二维数组的长度，没有明确一维数组的长度
		
		System.out.println(array);//[[I@7852e922

		System.out.println(array[0]);//null

		//System.out.println(array[0][0]);//NullPointerException:空指针
			//这个数组都不存在(null)，如何操作数组中的元素呢，指向为空。
		
		System.out.println(array.length);//二维数组的长度是指第一个值。
		System.out.println(arr[1].length);
	}
}
