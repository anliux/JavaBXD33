package it.cast.api.stringbuffer;

public class StringBufferTest {

	public static void main(String[] args) {
		/**
		 * int [] arr = {34,12,98,67};
		 * ��һ��int[]�е�Ԫ��ת���ַ�����ʽ[34,12,98,67]
		 * 
		 * */
		int[] arr = {34,12,98,67};
		String str = toString_2(arr);
		System.out.println(str);
	}	
	
	/**
	 * ��������Ӧ�ã�
	 * ���۶������ݣ�ʲô���ͣ�������Ҫ��ֻҪ���ձ���ַ������Ϳ���ʹ��StringBuffer���������
	 * */
	public static String toString_2(int[] arr) {
		//1������������
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
		//���ַ������ӣ�����ƴ���ַ������³������жѻ��˺öࡣ
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
