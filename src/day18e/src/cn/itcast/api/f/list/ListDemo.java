package cn.itcast.api.f.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.itcast.api.domain.Student;

public class ListDemo {

	public static void main(String[] args) {
		/*
		 * 使用List：解决插入元素的问题。因为add只是追加。
		 * List接口的特有方法：全都是围绕索引来定义的。
		 * List获取元素的方式：一种是迭代，一种是遍历+get
		 * List接口是支持对元素进行curd（增删改查）动作的。
		 * */
		List list = new ArrayList();
		
		//1、添加元素。
		list.add(new Student("wangcai1",21));
		list.add(new Student("wangcai2",22));
		list.add(new Student("wangcai3",23));
		
		//2、插入元素。
//		list.add(1, new Student("xiaoqiaong",25));
		//3、删除元素。
		list.remove(1);//remove(4)时：java.lang.IndexOutOfBoundsException：角标越界异常
			//没说是数组，也没说是字符串，就是角标越界异常。
		
		//4、修改元素。
		list.set(1, new Student("xiaoming",22));
		
		//5、获取元素
		Object obj = list.get(1);//get和remove都可以获取元素。
			//区别：get获取后，对应的元素还在list中，list长度不变。remove获取后，对应的元素从list中移除，list长度-1.
		for (int i = 0; i < list.size(); i++) {
			System.out.println("get("+i+"):"+list.get(i));
		}
		
		for (Iterator it = list.iterator(); it.hasNext();) {
			Student stu = (Student) it.next();
			System.out.println(stu);
		}

	}

}
