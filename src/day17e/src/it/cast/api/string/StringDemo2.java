package it.cast.api.string;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * "abcde"
		 * 1���ַ�����һ��������ô���ķ�����Ȼ��Χ�Ʋ��������������ݶ�����ġ�
		 * 2������Ϊ�ַ���������Щ�����أ�
		 * 	2.1 �ж��ٸ��ַ�
		 *  	int length()// ���ش��ַ����ĳ��ȡ��ղΣ���this
		 *  2.2 �ַ���λ��
		 *  	int indexOf(int ch, int fromIndex) // ����ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
		 *  	// ������ch - һ���ַ���Unicode ����㣩�� 
		 *  2.3 ��ȡָ��λ���ϵ��ַ�
		 *  	char charAt(int index) // ����ָ���������� char ֵ��
		 *  2.4 ��ȡ�����ַ���
		 * 		String substring(int beginIndex, int endIndex) 
		 *      // ����һ�����ַ��������Ǵ��ַ�����һ�����ַ�����
		 *      // �����ַ�����ָ���� beginIndex ����ʼ��ֱ������ endIndex - 1 �����ַ���
		 *      // ��ˣ������ַ����ĳ���Ϊ endIndex-beginIndex�� 
		 * */
		
		String str = "abada";
//		System.out.println("length="+str.length());
		//�������õĲ��ò��������ȷ����ֵΪint��ֱ���ȶ���Ϊint��
		int len = str.length();
		System.out.println("len="+len);
		
		//--------a��ĸ���ֵ�λ��--------
		int index = str.indexOf('a');//��ȡ����ָ���ַ���һ�γ��ֵ�λ��
		System.out.println("index="+index);
		
		//--------�ڶ���a��ĸ���ֵ�λ��--------
		int index1 = str.indexOf('a', index+1);
		System.out.println("index1="+index1);
		
		//--------������a��ĸ���ֵ�λ��--------
		int index2 = str.indexOf('a', index1+1);
		System.out.println("index2="+index2);
		
		//--------���Ų���-------------
		str = "lkjjflajlfkuooioeooweojgouoa";
		int index3 = str.lastIndexOf('m');
			//��Ҫ���ҵ��ַ�������ʱ������-1
		System.out.println("index3="+index3);
				
		//--------��ȡָ��λ���ϵ��ַ�-------
		str = "itcast";
		char ch = str.charAt(3);
			// �����ڵĽǱ���׳��쳣�� java.lang.StringIndexOutOfBoundsException
		System.out.println("ch="+ch);
		
		//--------��ȡ�����ַ���------
		String s = str.substring(2, 4);//��ͷ ����β
			//��ʼ�Ǳ�ͽ����Ǳ�ʱ��100%������ҿ��ġ�
		System.out.println("s="+s);
			
	}

}
