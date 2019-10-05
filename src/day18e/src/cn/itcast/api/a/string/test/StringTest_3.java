package cn.itcast.api.a.string.test;

public class StringTest_3 {

	public static void main(String[] args) {
		/**
		 * 作业3：String类的trim()
		 * 1、写代码演示该方法的使用
		 * 2、trim什么时候用？
		 * 		用户名，文本框输入，获取用户文本时，
		 * 3、模拟一个和trim功能一样的函数。参阅源码。
		 * */
		
		//Demo:
		String str = "    it   cast   ";
//		String s1 = str.trim();
		String s1 = myTrim(str);
		//只去掉两边的空格，中间的空格不会删。
		
		System.out.println(s1);

	}
	
	/**
	 * 模拟trim功能。
	 * */
	public static String myTrim(String str) {
		//1、定义两个变量，一个记录头的位置，一个记录尾的位置。
		int start = 0;
		int end = str.length()-1;
		
		//2、获取头部非空的位置
		while(start<=end && str.charAt(start)==' ')
			start++;
		
		//3、获取尾部非空的位置
		while(start<=end && str.charAt(end)==' ')
			end--;
		
		//4、根据获取头和尾非空格的位置，截取字符串。
		return str.substring(start, end+1);
		
	}
	 

}
