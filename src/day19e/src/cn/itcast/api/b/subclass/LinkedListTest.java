package cn.itcast.api.b.subclass;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		/*
		 * 面试题：用LinkedList模拟一个堆栈或者队列数据结构。
		 * 创建一个堆栈或者队列数据结构对象，该对象中使用LinkedList来完成的。
		 * 
		 * 堆栈同理，注意add和get部分，相同。不同是先进先出的队列结构。
		 * */ 
		
		//创建一个队列对象。
		Queue queue = new Queue();
		
		//往队列中添加元素。
		queue.myAdd("itcast1");
		queue.myAdd("itcast2");
		queue.myAdd("itcast3");
		queue.myAdd("itcast4");
		
		while(!queue.isNull()) {
			System.out.println(queue.myGet());
		}
	}

}

/*
 *定义一个队列数据结构。queue * 
 * 
 * */
 class Queue{
	 //封装了一个链表数据结构
	 private LinkedList link;
	 
	 //队列初始化时，对链表对象初始化。
	 Queue(){
		 link = new LinkedList();
	 }
	 
	 //队列的添加元素功能。
	 public void myAdd(Object obj) {
		 //内部使用的就是链表方法。
		 link.addFirst(obj);
	 }
	 
	 //队列的获取方法：先进先出，获取last。first或last与上面相同，先进后出，不同，先进先出。
	 public Object myGet() {
		 return link.removeLast();
	 }
	 
	 //判断队列中元素是否为空。没有元素就为true
	 public boolean isNull() {
		 return link.isEmpty();
	 }
 }