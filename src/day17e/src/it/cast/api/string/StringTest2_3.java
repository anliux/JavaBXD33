package it.cast.api.string;

public class StringTest2_3 {

	public static void main(String[] args) {
		/**
		 * ��������
		 * "itcast_sh"Ҫ�󣬽����ַ������ճ����ɳ����̴�ӡ����
		 * itcast_sh
		 * itcast_s
		 * tcast_sh
		 * 
		 * */
		String str = "itcast_sh";
		printStringByLength(str);
	}

	private static void printStringByLength(String str) {
		//1��ͨ��������������forǶ��ѭ��
		for (int i = 0; i < str.length(); i++) {
			for (int start=0, end = str.length()-i; end <= str.length(); start++,end++) {
				//����start��end��ȡ�ַ���
				String temp = str.substring(start, end);
				System.out.println(temp);
			}
		}
	}

}
