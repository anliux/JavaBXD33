package it.cast.api.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		/**
		 * StringBuffer:
		 * 1����һ���ַ�������������ʵ����һ��������
		 * 2�����ȿɱ䣬�������Ͷ����ԡ�ע�⣺�ǽ��������ݶ�ת���ַ������д洢��
		 * 3�����������ṩ�ܶ�����������ݵĲ������ܣ����磺��ӡ�ɾ�������ҡ��޸ġ�
		 * 4���������е��������ձ��һ���ַ�����
		 * 
		 * ���������Ĳ�ͬ��
		 * ���飺�洢����Ե�������ÿһ��Ԫ�أ�ÿ��Ԫ�ض��Ƕ����ġ�
		 * �ַ��������������д洢��Ԫ�ض���ת���ַ������������ƴ����һ�����ַ�����
		 * */
		
		//1������һ���ַ����������������ڴ洢���ݡ�
		StringBuffer sb = new StringBuffer();
		
		//2��������ݡ�����������ݺ�Ҫ�Ի������е��������ݽ��в���������ת���ַ����ſ��ԡ�
		sb.append(true).append("hehe").append(123);//����������
		sb.append("haha");
		//String str = sb.append(true).append("hehe").append(123).toString();
		//run:truehehe123haha
		
		sb.insert(2, false);//������λ��2��ʼ���룬����2
		//run:trfalseuehehe123haha
		
		//3��ɾ����delete��remove
		//deleteCharAt(int index); //ɾ��ָ��λ�õ�Ԫ��
		sb.delete(1, 4);//����ҿ�
		//run:tlseuehehe123haha
		
		//4���滻��replace
		sb.replace(1, 4, "12345");//����ҿ����ַ������Ա�start��end��
		//run:t12345uehehe123haha
		
		//5����ת��reverse
		sb.reverse();
		//run:ahah321eheheu54321t
		
		//6������Ϊ�������õ����ಿ�֣�
		sb.setLength(2);
		//run:ah
		
		System.out.println(sb);
		
		//��+���ĵײ����չʾ
		//String s = "a"+5+'c';
		//s = new StringBuffer().append("a").append(5).append('c').toString();
	}

}
