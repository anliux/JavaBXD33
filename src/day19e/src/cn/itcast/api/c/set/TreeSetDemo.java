package cn.itcast.api.c.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import cn.itcast.domain.Student;

public class TreeSetDemo {

	public static void main(String[] args) {
		// ��ʾTreeSet
		Set set = new TreeSet();
		
		/*
		 * TreeSet��add�����ڲ�����ʵ����:
		 * ��Ҫ��Ԫ��ת��Comparable���ͣ�Ϊʲô����Ϊ������;߱������������
		 * �����������һ��ר��Ϊ�����ṩ��һ��compareTo������
		 * ���Ҫ��ѧ���߱��Ƚ�����Ĺ��ܣ���Ҫ���Ǹ�ѧ����չ���ܣ�ʵ��Comparable�ӿڡ�
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
