package cn.itcast.api.a.string.test;

public class StringTest_1 {

	public static void main(String[] args) {
		/**
		 * ��ҵ1����ȡ�����ַ����������ͬ�Ӵ���
		 * "didjvkslbnitcastakl"
		 * "slajitcastlpoei"
		 * 
		 * ˼·��
		 * 1������ȷ�����ַ����ĳ��̣��ڳ������ж϶̴��Ƿ���ڡ�
		 * 2�����ڣ����ҵ���˵���̴����������ͬ��
		 *           �����ڣ��ͽ��̴����ճ��ȵݼ��ķ�ʽ��ȡ�̴��е��Ӵ������������жϡ�
		 * 3��һ�����ڣ���������ҡ�
		 * 
		 * */
		String s1 = "didjvkslbnitcastakl";
		String s2 = "sjitcastei";
		
		String maxSubString = getMaxSubString(s1,s2);
		System.out.println("maxSubString:"+maxSubString);

	}

	public static String getMaxSubString(String s1, String s2) {
		String max, min;
		//��ȷ�ĸ��ǳ������ĸ��Ƕ̴���
		max = (s1.length()>s2.length())?s1:s2;
		min = (max.equals(s1))?s2:s1;
		
//		System.out.println("max="+max);
//		System.out.println("min="+min);
		
		//�ɳ����̻�ȡsubstring����
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
