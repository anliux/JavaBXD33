package cn.itcast.api.string.test;

import java.util.Arrays;

public class StringTest_2 {

	public static void main(String[] args) {
		/**
		 * 作业二：对字符串中字符进行自然顺序排序
		 * "cfadsbv"--->"abcdfsv"
		 * 
		 * 思路：
		 * 1、排序熟，但是都是对数组排序
		 * 2、数组中的元素在哪里？在字符串中。把字符串转成数组。
		 * 3、对数组排序。
		 * 4、将排序后的数组转成字符串。
		 * */
		String str = "cfadsbv";
		str = sortStringByChar(str);
		System.out.println(str);

	}

	public static String sortStringByChar(String str) {
		//1、将字符串转成数组。两种：字符和字节，转成字符数组。
		//如果是中文，转成字符，每个汉字对应一个字符。若字节，每个至少对应2个字节。
		char[] chs = getArray(str);
		//2、对数组排序
		sort(chs);
		//3、将排序后的数组转成字符串：直接用构造函数
		return new String(chs);
	}

	//对数组排序
	private static void sort(char[] chs) {
		Arrays.sort(chs);
	}

	//实际开发中，会把很多常见对象中的方法封装起来，对外提供自定义的方法。	
	//自定义的方法更符合本程序的阅读性。
	private static char[] getArray(String str) {
		return str.toCharArray();
	}

}
