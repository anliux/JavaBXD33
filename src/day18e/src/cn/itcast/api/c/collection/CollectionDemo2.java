package cn.itcast.api.c.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		
		/*
		 * 细节：
		 * 1、集合中存储的其实都是对象的地址
		 * 2、集合中可以存储基本数值吗？不行。但是JDK1.5后可以这么写，但存储的还是对象（基本数据类型包装类对象）
		 * 3、存储时提升为了Object，取出时要使用元素的特有内容，就必须向下转型。
		 * */
		//coll存储元素。
//		coll.add("abc1");//存储的是对象的引用
//		coll.add(3);//coll.add(Integer.valueOf(3));//自动装箱。
		coll.add("itcast1");//Object obj = "itcast1"; 提升为了Object
		coll.add("haha");
		coll.add("nba");
		for (Iterator it = coll.iterator(); it.hasNext();) {
			Object object = it.next();//取出来的都是Ojbect，需要使用元素的特有方法时，向下转型。
			String str = (String) object;
			System.out.println(str.length());
			
		}
		
		

	}

}
