package it.cast.api.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ���ַ���
		String str = "abcd";
//		str = "haha";
		System.out.println("str="+str);
		
		//-----------------------
		System.out.println("--------�������ָ��ͬһ���ַ���--------");
		String s1 = "itcast";
		String s2 = "itcast";
		System.out.println(s1==s2);//true
			//"itcast"���ڳ������, ������ͬ����ָ��ͬһ����
		
		System.out.println("--------����������ͬ ������ʽ��ͬ���ַ���--------");
		String s3 = "abc";
		String s4 = new String("abc");//���������ã�ͨ��������
		/*s3��s4��ʲô��ͬ��
		 * s3���������ڴ���ֻҪһ������
		 * s4���������ڴ�������������		 * 
		 * */
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
		//��ΪString��д��equals������
		//�����ַ����Լ����ж���ͬ������, ��ͨ���ַ��������е��������жϵ�
		
		
	}

}
