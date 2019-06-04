class ArrayTest5 
{
	public static void main(String[] args) 
	{
		int num = 60;

		String str_hex = toHex(num);

		System.out.println(str_hex);
	}

	//数组的应用 之 转十六进制数组版

	/*
	
	需求：十进制 -> 十六进制    &15  >>>4  循环

	遇到问题：1、顺序反了；2、去除多余的0

	解决方法：
		1、每运算出一位，不要打印，先存储。需要容器。
		2、反着存储。	
	
	*/
	public static String toHex(int num)
	{
		//1、定义容器。存储的是字符，长度为8.一个整数最多8个16进制位。
		char[] chs = new char[8];

		//2、定义一个用于操作数组的索引。
		int index = chs.length-1;

		for (int x=0; x<8; x++)
		{
			int temp = num & 15;

			if (temp > 9)
				chs[index--] = ((char)(temp-10+'A'));
			else
				chs[index--] = ((char)(temp+'0'));
			//index--;

			num = num >>> 4 ;
		}

		/*
		
		4、遍历数组。
		for (int x=0; x<chs.length; x++)
		{
			System.out.print(chs[x]+",");
		}
		
		*/

		return toString(chs);	
	
	}

	//定义一个功能，将字符数组转成字符串。
	public static String toString(char[] arr)
	{
		String temp = "";

		for (int x = 0; x<arr.length; x++)
		{
			temp = temp + arr[x];
		}

		return "0x"+temp;
	
	
	}




}
