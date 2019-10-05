package cn.itcast.api.a.string.test;

public class StringTest_3 {

	public static void main(String[] args) {
		/**
		 * ��ҵ3��String���trim()
		 * 1��д������ʾ�÷�����ʹ��
		 * 2��trimʲôʱ���ã�
		 * 		�û������ı������룬��ȡ�û��ı�ʱ��
		 * 3��ģ��һ����trim����һ���ĺ���������Դ�롣
		 * */
		
		//Demo:
		String str = "    it   cast   ";
//		String s1 = str.trim();
		String s1 = myTrim(str);
		//ֻȥ�����ߵĿո��м�Ŀո񲻻�ɾ��
		
		System.out.println(s1);

	}
	
	/**
	 * ģ��trim���ܡ�
	 * */
	public static String myTrim(String str) {
		//1����������������һ����¼ͷ��λ�ã�һ����¼β��λ�á�
		int start = 0;
		int end = str.length()-1;
		
		//2����ȡͷ���ǿյ�λ��
		while(start<=end && str.charAt(start)==' ')
			start++;
		
		//3����ȡβ���ǿյ�λ��
		while(start<=end && str.charAt(end)==' ')
			end--;
		
		//4�����ݻ�ȡͷ��β�ǿո��λ�ã���ȡ�ַ�����
		return str.substring(start, end+1);
		
	}
	 

}
