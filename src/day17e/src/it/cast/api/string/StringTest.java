package it.cast.api.string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * ����������ϰ:
		 * 1���ַ����Ƿ���ָ���ַ�����ͷ����βͬ��
		 * 		boolean startsWith(string)
		 * 		boolean endsWith(string)
		 * 
		 * 2���ַ������Ƿ������һ���ַ�����
		 * 		boolean contains(string)
		 * 		int indexOf(string) //�������-1����ʾ������
		 * 
		 * 3���ַ�������һ���ַ������ֵ�λ�á�
		 * 		int indexOf(string) 
		 * 
		 * 4�����ַ�����ָ�����ַ����滻����һ���ַ�����
		 * 		String replace(oldstring, newstring)
		 * 
		 * 5���ַ�����αȽϴ�С��
		 * 		int compareTo(String anotherString)
		 * 
		 * 6�����ַ���ת��һ���ַ����顣�����ֽ����顣
		 * 		char toCharArray()
		 * 		byte getBytes()
		 * 
		 * 7������ĸ�ַ���ת�ɴ�д����ĸ�ַ�����
		 * 		String toUpperCase()
		 * 		String toLowerCase()
		 * 
		 * 8�����ַ�������ָ���ķ�ʽ�ֽ�ɶ���ַ�����"lisi, wangwu, zhaoliu"��ȡ����������
		 * 		String[] split(string)
		 * 
		 * 
		 * 
		 * */
		
		//1
		String str = "StringDemo.java";
		boolean b1 = str.startsWith("Demo");//false
		//2
		boolean b2 = str.contains("Demo"); //CharSequence x = "Demo"; ��̬
		//4
		String s = str.replace("Demo", "Test");
			//û�б��滻����ʱ�������ԭ����
		System.out.println("s="+s);
		//6
		char[] chs = str.toCharArray();
		byte[] nums = str.getBytes();
		//7
		String upperString = str.toUpperCase();
		String lowerString = str.toLowerCase();
		//8
		str = "lisi,wangwu,zhaoliu"; //�ո�ᱣ��
		String[] names = str.split(","); //��ʾ������ʵ���и�
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//5���ַ�����αȽϴ�С��
		int result = "ab".compareTo("cd");
			//��һ����ͬʱ���Ƚϵڶ�������ֵ���׸���ͬ�Ĳ�ֵ
		System.out.println("result="+result);
		
		//ֻҪ���ö���߱��Ƚϴ�С�Ĺ��ܣ�ֻ��ʵ��Comparable�ӿ�
		
	}

}
