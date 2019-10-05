package cn.itcast.api.d.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class IteratorDemo {

	public static void main(String[] args) {
		/*
		 * Ҫ������!!!!
		 * 
		 * ���ϵ�ȡ����ʽ��
		 * 
		 * */
		
		//�������϶���
		Collection coll = new ArrayList();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		//2����ȡ�����ĵ���������ͨ��iterator����
		Iterator it = coll.iterator();//�Ѿ�new���ˣ�ֱ���ü��ɡ�
		
		//3��ʹ�þ���ĵ����������ȡ�����е�Ԫ�ء����ĵ������ķ�����
		//hasNext()���������Ԫ�ؿ��Ե���������true
		//next()�����ص�������һ��Ԫ�ء�
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//ʵ�ʿ����У����Խ�Լһ���ڴ�
		for (Iterator iterator = coll.iterator(); iterator.hasNext();) {
			System.out.println(it.next());
		}
		
		/*
		 * System.out.println(it.next()); 
		 * System.out.println(it.next());
		 * System.out.println(it.next()); 
		 * System.out.println(it.next());
		 */
		//System.out.println(it.next());  //java.util.NoSuchElementException û�����Ԫ���쳣������ʱ�쳣��

	}

}
