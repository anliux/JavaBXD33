package cn.itcast.api.e.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import cn.itcast.api.domain.Student;

public class CollectionText {

	public static void main(String[] args) {
		/*
		 * �������д洢�Զ���Ķ���ȡ����
		 * */ 
		//1���������϶���
		Collection coll = new ArrayList();
		
		//2����Ӿ����ѧ��Ԫ�ء�
		Student stu = new Student("lisi1",21);
		coll.add(stu);
		coll.add(stu);//�����Ž��ظ���Ԫ����ͬ��ָ������ͬ���ж�������equals
		coll.add(new Student("lisi2",22));
		coll.add(new Student("lisi3",23));
		coll.add(new Student("lisi3",23));
		
		/*
		 * ʲô���ظ����������ж����ݵġ�
		 * ���ݶ���ͨ����������ɵġ�
		 * */
		
		for (Iterator it = coll.iterator(); it.hasNext();) {
			Student student = (Student) it.next();
			System.out.println(student.getName());
		}
		
		
	}

}

