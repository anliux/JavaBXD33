package cn.itcast.api.c.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import cn.itcast.domain.Student;

public class TreeSetDemo {

	public static void main(String[] args) {
		// 演示TreeSet
		Set set = new TreeSet();
		
		/*
		 * TreeSet的add方法内部最终实现是:
		 * 需要将元素转成Comparable类型，为什么？因为这个类型具备排序的能力。
		 * 这个类型中有一个专门为排序提供了一个compareTo方法。
		 * 如果要让学生具备比较排序的功能，需要让那个学生扩展功能，实现Comparable接口。
		 * 
		 * */
		
//		set.add("haha");
//		set.add("abcde");
//		set.add("java");
		
		set.add(new Student("lisi1",21));
		set.add(new Student("lisi2",22));
		set.add(new Student("lisi0",24));
		set.add(new Student("lisi5",21));
		set.add(new Student("lisi3",20));
		
		for (Iterator it = set.iterator(); it.hasNext();) {
				System.out.println(it.next());			
		}

	}

}
