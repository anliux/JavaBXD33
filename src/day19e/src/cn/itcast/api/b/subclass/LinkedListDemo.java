package cn.itcast.api.b.subclass;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		/*
		 * LinkedList做个了解
		 * 特有方法：围绕头和尾展开定义 first last
		 * 
		 * addFirst();
		 * addLast();
		 * 
		 * getFirst();		//获取头部元素。
		 * getLast();
		 * 
		 * removeFirst();		//获取头部元素，并删除头部元素。
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
		 * 先进后出的堆栈形式
		 *  abc3
			abc2
			abc1
		 * */
		

	}

}
