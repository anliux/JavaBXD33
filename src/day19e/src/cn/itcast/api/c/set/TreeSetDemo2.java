package cn.itcast.api.c.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import cn.itcast.api.d.comparator.ComparatorByName;
import cn.itcast.domain.Student;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		//�ڴ���TreeSet���϶���ʱ������ȷ�Ƚ�����
		Set set = new TreeSet(new ComparatorByName());
		
		/*
		 * ��Ҫ����ѧ������������˵��ѧ���е���Ȼ����������Ҫ�ģ�
		 * ��ʱ��ֻ��ʹ�ñȽ�����ComparatorByName.
		 * */
		
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
