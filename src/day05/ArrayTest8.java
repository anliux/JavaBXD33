class ArrayTest8 
{
	//进制转换之豪华版

	public static void main(String[] args) 
	{
		int num = 60;//-6.。。。
		//num是0的情况特殊，稍加判断。

		String str_bin = toBinary(num);
		String str_oct = toOctal(num);
		String str_hex = toHex(num);
		System.out.println("bin:" + str_bin);
		System.out.println("oct:" + str_oct);
		System.out.println("hex:" + str_hex);

		//JAVA已经提供的功能。
		//开发中用这个。
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
	}


	//十进制-->十六进制
	public static String toHex(int num)
	{
		return "0x"+trans(num, 15, 4);
	}


	//十进制-->二进制
	public static String toBinary(int num)
	{
		return trans(num, 1, 1);
	}


	//十进制-->八进制
	public static String toOctal(int num)
	{
		return "0"+trans(num, 7, 3);
	}


	
	//用于进制转换的功能。
	public static String trans(int num, int base, int offset)
	{
		if(num == 0)
			return "0";
		
		//1、建立表
		char[] chs = {'0','1','2','3','4','5','6','7',
					  '8','9','A','B','C','D','E','F'};

		//2、创建一个临时容器
		char[] arr = new char[32];

		//3、创建操作临时容器的脚标
		int index = arr.length;

		//4、通过循环对num进行 & >>> 等运算
		while (num != 0)
		{
			//5、对num进行 & 运算
			int temp = num & base;//变量

			//6、根据&运算后的结果作为脚标查表，获取对应的字符。
			arr[--index] = chs[temp];

			//7、对num进行右移
			num = num >>> offset;//偏移量

		}

		return toString(arr, index);
	
	}


	//定义一个功能，将字符数组转成字符串。
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
