package cn.itcast.api.a.string.test;

public class StringTest_1 {

	public static void main(String[] args) {
		/**
		 * 作业1：获取两个字符串的最大相同子串。
		 * "didjvkslbnitcastakl"
		 * "slajitcastlpoei"
		 * 
		 * 思路：
		 * 1、先明确两个字符串的长短，在长串中判断短串是否存在。
		 * 2、存在，已找到，说明短串就是最大相同；
		 *           不存在，就将短串按照长度递减的方式获取短串中的子串并到长串中判断。
		 * 3、一旦存在，便结束查找。
		 * 
		 * */
		String s1 = "didjvkslbnitcastakl";
		String s2 = "sjitcastei";
		
		String maxSubString = getMaxSubString(s1,s2);
		System.out.println("maxSubString:"+maxSubString);

	}

	public static String getMaxSubString(String s1, String s2) {
		String max, min;
		//明确哪个是长串，哪个是短串。
		max = (s1.length()>s2.length())?s1:s2;
		min = (max.equals(s1))?s2:s1;
		
//		System.out.println("max="+max);
//		System.out.println("min="+min);
		
		//由长到短获取substring方法
		for (int i = 0; i < min.length(); i++) {
			for(int start=0, end=min.length()-i; end<=min.length(); start++, end++) {
				String temp = min.substring(start, end);
				if(max.contains(temp))
					return temp;
			}
		}
		return null;
	}
}
