import java.util.Arrays;
class  Test2
{
	public static void main(String[] args) 
	{
		int[] arr = {9,13,17,22,31,46,58,77};
		int index_1 = binarySearch(arr,1);
		int index_2 = Arrays.binarySearch(arr,1);
		System.out.println("index_1="+index_1);
		System.out.println("index_2="+index_2);
	}

	/*
	思考题：
	需求：如果往有序数组中插入一个元素并保证继续有序，获取该位置。
	思路：
		既然是有序数组，而且是找位置，必须想到二分查找法。	
	*/
	public static int binarySearch(int[] arr, int key)
	{
		int max,min,mid;
		min = 0;
		max = arr.length-1;
		
		while (min<=max)
		{
			mid = (max+min)>>1;

			if(key<arr[mid])
				max = mid-1;
			else if(key>arr[mid])
				min = mid+1;
			else
				return mid;
		}
		return -(min+1);//关键之处！！
		
	}
} 
