class ArrayTest6 
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
		
		3、去除0：需要转换的数据会不断右移。如果右移后剩余的二进制都是0，也就没有有效位，
		   就不需要进行&运算了，也就是不需要再往数组中存储了。
	
	*/
	public static String toHex(int num)
	{
		//1、定义容器。存储的是字符，长度为8.一个整数最多8个16进制位。
		char[] chs = new char[8];

		//2、定义一个用于操作数组的索引。
		int index = chs.length;//初始化为数组长度，

		while(num!=0)//原for循环中的x已经不需要，仅需判断num是否为0，简化为while循环。
		{
			int temp = num & 15;

			if (temp > 9)
				chs[--index] = ((char)(temp-10+'A'));//index初始化为数组长度时相应的处理方式。
			else
				chs[--index] = ((char)(temp+'0'));
			//index--;

			num = num >>> 4 ;
		}

		System.out.println("index="+index);

		return toString(chs, index);//为处理脚标小的位置为空，加入index变量，从最后一位非零位开始输出。
		
	
	}

	//定义一个功能，将字符数组转成字符串。
	public static String toString(char[] arr, int index)
	{
		String temp = "";

		for (int x = index; x<arr.length; x++)
		{
			temp = temp + arr[x];
		}

		return "0x"+temp;
	
	
	}




}
