package cn.itcast.api.c.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		
		/*
		 * ϸ�ڣ�
		 * 1�������д洢����ʵ���Ƕ���ĵ�ַ
		 * 2�������п��Դ洢������ֵ�𣿲��С�����JDK1.5�������ôд�����洢�Ļ��Ƕ��󣨻����������Ͱ�װ�����
		 * 3���洢ʱ����Ϊ��Object��ȡ��ʱҪʹ��Ԫ�ص��������ݣ��ͱ�������ת�͡�
		 * */
		//coll�洢Ԫ�ء�
//		coll.add("abc1");//�洢���Ƕ��������
//		coll.add(3);//coll.add(Integer.valueOf(3));//�Զ�װ�䡣
		coll.add("itcast1");//Object obj = "itcast1"; ����Ϊ��Object
		coll.add("haha");
		coll.add("nba");
		for (Iterator it = coll.iterator(); it.hasNext();) {
			Object object = it.next();//ȡ�����Ķ���Ojbect����Ҫʹ��Ԫ�ص����з���ʱ������ת�͡�
			String str = (String) object;
			System.out.println(str.length());
			
		}
		
		

	}

}
