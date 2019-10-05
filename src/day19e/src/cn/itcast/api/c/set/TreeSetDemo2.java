package cn.itcast.api.c.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import cn.itcast.api.d.comparator.ComparatorByName;
import cn.itcast.domain.Student;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		//在创建TreeSet集合对象时，就明确比较器。
		Set set = new TreeSet(new ComparatorByName());
		
		/*
		 * 想要按照学生的姓名排序，说明学生中的自然排序不是所需要的，
		 * 这时就只能使用比较器。ComparatorByName.
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
