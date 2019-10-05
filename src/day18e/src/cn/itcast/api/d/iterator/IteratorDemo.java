package cn.itcast.api.d.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class IteratorDemo {

	public static void main(String[] args) {
		/*
		 * 要求必须会!!!!
		 * 
		 * 集合的取出方式：
		 * 
		 * */
		
		//创建集合对象
		Collection coll = new ArrayList();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		
		//2、获取容器的迭代器对象，通过iterator方法
		Iterator it = coll.iterator();//已经new好了，直接用即可。
		
		//3、使用具体的迭代器对象获取集合中的元素。参阅迭代器的方法。
		//hasNext()：如果仍有元素可以迭代，返回true
		//next()：返回迭代的下一个元素。
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//实际开发中：可以节约一点内存
		for (Iterator iterator = coll.iterator(); iterator.hasNext();) {
			System.out.println(it.next());
		}
		
		/*
		 * System.out.println(it.next()); 
		 * System.out.println(it.next());
		 * System.out.println(it.next()); 
		 * System.out.println(it.next());
		 */
		//System.out.println(it.next());  //java.util.NoSuchElementException 没有这个元素异常（运行时异常）

	}

}
