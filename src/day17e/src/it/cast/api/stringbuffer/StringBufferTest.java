package it.cast.api.stringbuffer;

public class StringBufferTest {

	public static void main(String[] args) {
		/**
		 * int [] arr = {34,12,98,67};
		 * 将一个int[]中的元素转成字符串格式[34,12,98,67]
		 * 
		 * */
		int[] arr = {34,12,98,67};
		String str = toString_2(arr);
		System.out.println(str);
	}	
	
	/**
	 * 缓冲区的应用：
	 * 无论多少数据，什么类型，都不重要，只要最终变成字符串，就可以使用StringBuffer这个容器。
	 * */
	public static String toString_2(int[] arr) {
		//1、创建缓冲区
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1)
				sb.append(arr[i]+", ");
			else
				sb.append(arr[i]+"]");
		}
		
		return sb.toString();
	}

	public static String toString(int[] arr) {
		//用字符串连接：不断拼接字符串导致常量池中堆积了好多。
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1)
				str += arr[i]+",";
			else
				str += arr[i]+"]";
		}
		return str;
		
	}

}
