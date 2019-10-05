package cn.itcast.api.a.ListIterator;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("itcast1");
		list.add("itcast2");
		list.add("itcast3");
		list.add("itcast4");

		/*
		 * ��ȡ�����е�Ԫ�ء�
		 * �����������Ԫ�ص���itcast2���Ͳ���һ����Ԫ��java
		 * 
		 * �������쳣java.util.ConcurrentModificationException
		 * �ڵ��������У�ʹ���˼��ϵķ�����Ԫ�ؽ��в��������µ���������֪�������еı仯�������������ݵĲ�ȷ���ԡ�
		 * 
		 * ������ڵ���ʱ����Ҫʹ�ü��ϵķ�������Ԫ�ء�
		 * �������ڵ���ʱ��Ԫ�ز�����ô�죿����ʹ�õ������ķ���������
		 * ���Ǻ��ź����������ķ�ʽֻ��hasNext(), next(), remove()
		 * Iterator��һ���ӽӿ�ListIterator������ɸ�����Ľ���� 
		 * ��λ�ȡ���ӽӿڶ����أ�ͨ��List�ӿ��е�ListIterator()�Ϳ��Ի�ȡ��
		 * ��ס�����б������ֻ��List�ӿ��С����������������������ڵ��������е���ɾ�Ĳ鶯����
		 * ��Ϊlist����������
		 * 
		 * hasPrevious(): �����������б��б�������ж��Ԫ�أ��򷵻�true
		 * listIterator(int index): ���б��ָ��λ�ÿ�ʼ����
		 * */
		
//		Iterator it = list.iterator();
		//��ȡ�б����������
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			Object obj = it.next();  //java.util.ConcurrentModificationException
				//��������⵽����Ĳ����޸ģ��������������޸�ʱ���׳����쳣
			if("itcast2".equals(obj)) {
//				list.add("java");
//				it.add("java");
				it.set("java");//��itcas2��Ϊjava
			}
		}
		System.out.println(list);
		
	}

}
