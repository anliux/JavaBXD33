package it.cast.api.string;

public class StringTest2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 案例二：
		 * "witcasteritcasttskitcasteiieocitcast"有几个itcast
		 * 
		 * 思路：
		 * 1、无非就是在一个字符串中查找另一个字符串。indexOf。
		 * 2、查找到第一次出现的指定字符串后，如何查找第二个呢？
		 * 3、无需再从头开始，只要从第一次出现的位置 + 要找的字符串的长度的位置开始向后查找下一个第一次出现的位置即可
		 * 4、当返回的位置是-1时，查找结束。
		 * 
		 * */
		String str = "witcasteritcasttskitcasteiieocitcast";
		String key = "itcast";
		
		int count = getKeyCount(str,key);
		System.out.println("count="+count);
					
	}

	/**
	 * 获取key在str中出现次数
	 * 
	 * */
	private static int getKeyCount(String str, String key) {
		//1、定义变量，记录每一次找到的key的位置
		int index = 0;
		//2、定义变量，记录出现的次数
		int count = 0;
		//3、定义循环
		while((index = str.indexOf(key,index))!=-1) {
			//每循环一次，就要明确下一次查找的起始位置
			index = index + key.length();
			
			//每查找一次，count自增
			count++;
		}
		return count;
	}

}
