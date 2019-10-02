package cn.itcast.api.string.test;

import java.util.Arrays;

public class StringTest_2 {

	public static void main(String[] args) {
		/**
		 * ��ҵ�������ַ������ַ�������Ȼ˳������
		 * "cfadsbv"--->"abcdfsv"
		 * 
		 * ˼·��
		 * 1�������죬���Ƕ��Ƕ���������
		 * 2�������е�Ԫ����������ַ����С����ַ���ת�����顣
		 * 3������������
		 * 4��������������ת���ַ�����
		 * */
		String str = "cfadsbv";
		str = sortStringByChar(str);
		System.out.println(str);

	}

	public static String sortStringByChar(String str) {
		//1�����ַ���ת�����顣���֣��ַ����ֽڣ�ת���ַ����顣
		//��������ģ�ת���ַ���ÿ�����ֶ�Ӧһ���ַ������ֽڣ�ÿ�����ٶ�Ӧ2���ֽڡ�
		char[] chs = getArray(str);
		//2������������
		sort(chs);
		//3��������������ת���ַ�����ֱ���ù��캯��
		return new String(chs);
	}

	//����������
	private static void sort(char[] chs) {
		Arrays.sort(chs);
	}

	//ʵ�ʿ����У���Ѻܶೣ�������еķ�����װ�����������ṩ�Զ���ķ�����	
	//�Զ���ķ��������ϱ�������Ķ��ԡ�
	private static char[] getArray(String str) {
		return str.toCharArray();
	}

}
