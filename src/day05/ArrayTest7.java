class ArrayTest7 
{
	public static void main(String[] args) 
	{
		int num = 26;

		String str_hex = toHex(num);
		
		System.out.println("hex:" + str_hex);
	}

	//十进制转十六进制 之 查表版

	/*

	需求：十进制-->十六进制，终极版

	思路：
		十进制转成十六进制的每一位都是十六进制元素中的某一个。
		十六进制的元素有很多固定个数。而且还有对应的编号。
		所以可以使用传说中的 查表法 ！	
	
	*/

	public static String toHex(int num)
	{
		//1、建立表
		char[] chs = {'0','1','2','3','4','5','6','7',
				      '8','9','A','B','C','D','E','F'};

		//2、创建临时容器
		char[] arr = new char[8];

		//3、创建操作临时容器的脚标。
		int index = arr.length;

		//4、通过循环对num进行& >>> 等运算
		while (num!=0)
		{
			//5、对num进行&运算
			int temp = num & 15;

			//6、根据&运算后的结果作为脚标查表，获取对应的字符。
			arr[--index] = chs[temp];

			//7、对num进行右移
			num = num >>> 4;
		}

		return "0x" + toString(arr,index);
	
	}



	public static String toString(char[] arr, int index)
	{
		String temp = "";

		for (int x = index; x<arr.length; x++)
		{
			temp = temp + arr[x];
		}
		
		return temp;
	
	}
}
