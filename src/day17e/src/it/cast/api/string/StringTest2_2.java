package it.cast.api.string;

public class StringTest2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ��������
		 * "witcasteritcasttskitcasteiieocitcast"�м���itcast
		 * 
		 * ˼·��
		 * 1���޷Ǿ�����һ���ַ����в�����һ���ַ�����indexOf��
		 * 2�����ҵ���һ�γ��ֵ�ָ���ַ�������β��ҵڶ����أ�
		 * 3�������ٴ�ͷ��ʼ��ֻҪ�ӵ�һ�γ��ֵ�λ�� + Ҫ�ҵ��ַ����ĳ��ȵ�λ�ÿ�ʼ��������һ����һ�γ��ֵ�λ�ü���
		 * 4�������ص�λ����-1ʱ�����ҽ�����
		 * 
		 * */
		String str = "witcasteritcasttskitcasteiieocitcast";
		String key = "itcast";
		
		int count = getKeyCount(str,key);
		System.out.println("count="+count);
					
	}

	/**
	 * ��ȡkey��str�г��ִ���
	 * 
	 * */
	private static int getKeyCount(String str, String key) {
		//1�������������¼ÿһ���ҵ���key��λ��
		int index = 0;
		//2�������������¼���ֵĴ���
		int count = 0;
		//3������ѭ��
		while((index = str.indexOf(key,index))!=-1) {
			//ÿѭ��һ�Σ���Ҫ��ȷ��һ�β��ҵ���ʼλ��
			index = index + key.length();
			
			//ÿ����һ�Σ�count����
			count++;
		}
		return count;
	}

}
