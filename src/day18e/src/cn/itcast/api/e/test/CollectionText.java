package cn.itcast.api.e.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import cn.itcast.api.domain.Student;

public class CollectionText {

	public static void main(String[] args) {
		/*
		 * 往集合中存储自定义的对象并取出。
		 * */ 
		//1、创建集合对象
		Collection coll = new ArrayList();
		
		//2、添加具体的学生元素。
		Student stu = new Student("lisi1",21);
		coll.add(stu);
		coll.add(stu);//这样才叫重复。元素相同是指对象相同。判断依据是equals
		coll.add(new Student("lisi2",22));
		coll.add(new Student("lisi3",23));
		coll.add(new Student("lisi3",23));
		
		/*
		 * 什么是重复？都是有判断依据的。
		 * 依据都是通过方法来完成的。
		 * */
		
		for (Iterator it = coll.iterator(); it.hasNext();) {
			Student student = (Student) it.next();
			System.out.println(student.getName());
		}
		
		
	}

}

