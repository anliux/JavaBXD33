package cn.itcast.api.c.collection;

import java.util.ArrayList;
import java.util.Collection;//ctrl+shift+o������

public class CollectionDemo {

	public static void main(String[] args) {
//		Collection coll = new ArrayList();  //Ŀǰ��ʾCollection��������������������������ʲô��
			//����ת�ͣ��������չ�ԣ������������ͣ��õĶ��Ǹ��෽�������������ࡣ
//		colletionDemo(coll);

		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
	    collectionDemo2(c1, c2);
		
	}

	//��ʾCollection�д�all����
	public static void collectionDemo2(Collection c1, Collection c2) {
		//1���������������Ԫ��
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		
		c2.add("abc1"); //�ظ�
		c2.add("abc5");
		c2.add("abc6");
		
		//�������c2Ԫ�ص�c1��
		c1.addAll(c2);
		
		//����all
		//boolean b = c1.contains(c2);//contains(): ����� collection ����ָ����Ԫ�أ��򷵻� true
			//��c1�в�û��һ������c2�ļ���Ԫ�أ���false
		boolean b = c1.containsAll(c2);  //true
			//����� collection ����ָ�� collection �е�����Ԫ�أ��򷵻� true��
				
		//ɾ��c1�е����к�c2��ͬ��Ԫ�ء�
		c1.removeAll(c2);// �Ƴ��� collection ����ЩҲ������ָ�� collection �е�����Ԫ�أ���ѡ��������
		
		//����c1�еĺ�c2��ͬ��Ԫ�ء���removeAll�෴��
		c1.retainAll(c2);//�������� collection ����ЩҲ������ָ�� collection ��Ԫ�أ���ѡ��������
				
		System.out.println("c1="+c1);
		System.out.println("b="+b);
		
	}
	
	//��ʾCollection�е�һ�㷽��
	public static void colletionDemo(Collection coll) {
		//1������������Ӷ���Ԫ�ء�add(Object); ��̬
		coll.add("itcast1");
		coll.add("itcast2");
		coll.add("itcast3");
		
		//2��ɾ����
		coll.remove("itcast2");//add��remove�ķ���ֵ���ǲ�����
		
		//3���ж��Ƿ������
		System.out.println(coll.contains("itcast1"));//true
		
		//4���п� isEmpty() -- ������Ԫ��ʱ����true
		
		//5������ size() -- ���ؼ����е�Ԫ������length��
		
		//6����� clear()
		coll.clear();  //[]
				
		System.out.println(coll);  //[itcast1, itcast2, itcast3]
				
	}

}
