package it.cast.api.string;

public class StringTest2_3 {

	public static void main(String[] args) {
		/**
		 * 案例三：
		 * "itcast_sh"要求，将该字符串按照长度由长到短打印出来
		 * itcast_sh
		 * itcast_s
		 * tcast_sh
		 * 
		 * */
		String str = "itcast_sh";
		printStringByLength(str);
	}

	private static void printStringByLength(String str) {
		//1、通过分析，发现是for嵌套循环
		for (int i = 0; i < str.length(); i++) {
			for (int start=0, end = str.length()-i; end <= str.length(); start++,end++) {
				//根据start，end截取字符串
				String temp = str.substring(start, end);
				System.out.println(temp);
			}
		}
	}

}
