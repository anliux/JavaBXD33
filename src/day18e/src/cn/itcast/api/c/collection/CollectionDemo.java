package cn.itcast.api.c.collection;

import java.util.ArrayList;
import java.util.Collection;//ctrl+shift+o：导包

public class CollectionDemo {

	public static void main(String[] args) {
//		Collection coll = new ArrayList();  //目前演示Collection方法，不关心子类对象的类型是什么。
			//向上转型：提高了扩展性，隐藏了子类型，用的都是父类方法，不关心子类。
//		colletionDemo(coll);

		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
	    collectionDemo2(c1, c2);
		
	}

	//演示Collection中带all方法
	public static void collectionDemo2(Collection c1, Collection c2) {
		//1、给两个集合添加元素
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		
		c2.add("abc1"); //重复
		c2.add("abc5");
		c2.add("abc6");
		
		//添加所有c2元素到c1中
		c1.addAll(c2);
		
		//包含all
		//boolean b = c1.contains(c2);//contains(): 如果此 collection 包含指定的元素，则返回 true
			//而c1中并没有一个叫做c2的集合元素，故false
		boolean b = c1.containsAll(c2);  //true
			//如果此 collection 包含指定 collection 中的所有元素，则返回 true。
				
		//删除c1中的所有和c2相同的元素。
		c1.removeAll(c2);// 移除此 collection 中那些也包含在指定 collection 中的所有元素（可选操作）。
		
		//保留c1中的和c2相同的元素。与removeAll相反。
		c1.retainAll(c2);//仅保留此 collection 中那些也包含在指定 collection 的元素（可选操作）。
				
		System.out.println("c1="+c1);
		System.out.println("b="+b);
		
	}
	
	//演示Collection中的一般方法
	public static void colletionDemo(Collection coll) {
		//1、往集合中添加对象元素。add(Object); 多态
		coll.add("itcast1");
		coll.add("itcast2");
		coll.add("itcast3");
		
		//2、删除。
		coll.remove("itcast2");//add和remove的返回值都是布尔型
		
		//3、判断是否包含。
		System.out.println(coll.contains("itcast1"));//true
		
		//4、判空 isEmpty() -- 不包含元素时返回true
		
		//5、长度 size() -- 返回集合中的元素数（length）
		
		//6、清除 clear()
		coll.clear();  //[]
				
		System.out.println(coll);  //[itcast1, itcast2, itcast3]
				
	}

}
