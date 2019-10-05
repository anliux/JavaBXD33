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
		 * 获取集合中的元素。
		 * 如果集合中有元素等于itcast2，就插入一个新元素java
		 * 
		 * 引发了异常java.util.ConcurrentModificationException
		 * 在迭代过程中，使用了集合的方法对元素进行操作，导致迭代器并不知道集合中的变化，容易引发数据的不确定性。
		 * 
		 * 解决：在迭代时，不要使用集合的方法操作元素。
		 * 但还想在迭代时对元素操作怎么办？可以使用迭代器的方法操作。
		 * 可是很遗憾：迭代器的方式只有hasNext(), next(), remove()
		 * Iterator有一个子接口ListIterator可以完成该问题的解决。 
		 * 如何获取该子接口对象呢？通过List接口中的ListIterator()就可以获取。
		 * 记住：该列表迭代器只有List接口有。而且这个迭代器可以完成在迭代过程中的增删改查动作。
		 * 因为list里有索引。
		 * 
		 * hasPrevious(): 如果逆向遍历列表，列表迭代器有多个元素，则返回true
		 * listIterator(int index): 从列表的指定位置开始遍历
		 * */
		
//		Iterator it = list.iterator();
		//获取列表迭代器对象。
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			Object obj = it.next();  //java.util.ConcurrentModificationException
				//当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常
			if("itcast2".equals(obj)) {
//				list.add("java");
//				it.add("java");
				it.set("java");//将itcas2改为java
			}
		}
		System.out.println(list);
		
	}

}
