package cn.itcast.api.b.subclass;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		/*
		 * �����⣺��LinkedListģ��һ����ջ���߶������ݽṹ��
		 * ����һ����ջ���߶������ݽṹ���󣬸ö�����ʹ��LinkedList����ɵġ�
		 * 
		 * ��ջͬ��ע��add��get���֣���ͬ����ͬ���Ƚ��ȳ��Ķ��нṹ��
		 * */ 
		
		//����һ�����ж���
		Queue queue = new Queue();
		
		//�����������Ԫ�ء�
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
 *����һ���������ݽṹ��queue * 
 * 
 * */
 class Queue{
	 //��װ��һ���������ݽṹ
	 private LinkedList link;
	 
	 //���г�ʼ��ʱ������������ʼ����
	 Queue(){
		 link = new LinkedList();
	 }
	 
	 //���е����Ԫ�ع��ܡ�
	 public void myAdd(Object obj) {
		 //�ڲ�ʹ�õľ�����������
		 link.addFirst(obj);
	 }
	 
	 //���еĻ�ȡ�������Ƚ��ȳ�����ȡlast��first��last��������ͬ���Ƚ��������ͬ���Ƚ��ȳ���
	 public Object myGet() {
		 return link.removeLast();
	 }
	 
	 //�ж϶�����Ԫ���Ƿ�Ϊ�ա�û��Ԫ�ؾ�Ϊtrue
	 public boolean isNull() {
		 return link.isEmpty();
	 }
 }