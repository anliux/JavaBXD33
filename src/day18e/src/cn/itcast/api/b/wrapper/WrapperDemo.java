package cn.itcast.api.b.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		/*
		 * ������
		 * ͨ���ı����ȡ�û�������������ݣ����ǵõ��Ķ����ַ�����
		 * �����Ҫ���ַ����е����ֽ������㣬���뽫�ַ���ת�����֡�
		 * 
		 * java���ṩ����Ӧ�Ľ���Ķ���
		 * �����������Ͷ����װ�ࣺjava��������������ֵ��װ�ɶ���
		 * ��װ�ɶ���ĺô��������ṩ����Ĳ���������ֵ�Ĺ��ܡ�
		 * �����������ͣ�8��
		 * byte			Byte
		 * short		Short
		 * int 			Integer
		 * long			Long
		 * float		Float
		 * double		Double
		 * boolean		Boolean
		 * char			Character 
		 * 
		 * */
		
		//ѧϰһ��Integer
		/*
		 * �����������Ͱ�װ����ص㣺
		 * 1�������ڻ������ݺ��ַ���֮�����ת����<�ص�!!!!>
		 * int parseInt(string);
		 * byte parseByte(string);
		 * boolean parseBoolean(string);
		 * ���⣺Characterû�н���������
		 * 
		 * */
		
		System.out.println(Integer.MAX_VALUE);//MIN>VALUE:int�������ܱ�ʾ����Сֵ
		System.out.println(Integer.toBinaryString(-6));
			//ʮ����ת���������ƣ�����ת���ķ���ֵ��Sting�࣬toHexString(int i), toOctalString(int i);
		
		//1���ַ���--->������ֵ��������ֵ���ַ����� ��ʾInteger int(String)
		System.out.println(Integer.parseInt("123")+2);
			//��������ݸ�ʽ�����׳��쳣java.lang.NumberFormatException������ʱ�쳣��
		
		System.out.println(Integer.parseInt("110", 10));//radix��������ָ�����ơ��������ϣ��׳����ָ�ʽ�쳣��
			//���Խ���������ת��ʮ���ƣ��������toXxxx�������Ӧ��
		
		//2��������ֵ--->�ַ�����34+"";����רҵ��  String.valueOf(34);(���ز������ַ���������ʽ) Integer.toString(int);
		System.out.println(34+5);
		
		//3��������ֵ<----->��װ����
		//������ֵ--->��װ����
		Integer i = new Integer(4);//�ù��캯��	
		Integer ii = new Integer("4");//����һ����һ����
		Integer iii = Integer.valueOf(4);//��̬����
		//��װ����--->������ֵ
		int num = i.intValue();
		
		
		
		
	}

}
