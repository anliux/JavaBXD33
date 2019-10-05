package cn.itcast.api.b.subclass;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		/*
		 * LinkedList�����˽�
		 * ���з�����Χ��ͷ��βչ������ first last
		 * 
		 * addFirst();
		 * addLast();
		 * 
		 * getFirst();		//��ȡͷ��Ԫ�ء�
		 * getLast();
		 * 
		 * removeFirst();		//��ȡͷ��Ԫ�أ���ɾ��ͷ��Ԫ�ء�
		 * removeLast();
		 * 
		 * */
		
		LinkedList link = new LinkedList();
		
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
				
//		System.out.println(link);//[abc3, abc2, abc1]
//		System.out.println(link.getFirst());//abc3
//		System.out.println(link.getFirst());//abc3
//		System.out.println(link.removeFirst());//abc3
//		System.out.println(link.removeFirst());//abc2
//		System.out.println(link.removeFirst());//abc1
//		System.out.println(link.removeFirst());//java.util.NoSuchElementException
		
		while(!(link.isEmpty())) {
			System.out.println(link.removeFirst());
		}
		/*
		 * �Ƚ�����Ķ�ջ��ʽ
		 *  abc3
			abc2
			abc1
		 * */
		

	}

}
