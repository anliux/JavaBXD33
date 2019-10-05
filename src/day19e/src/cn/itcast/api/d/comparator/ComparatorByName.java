package cn.itcast.api.d.comparator;

import cn.itcast.domain.Student;

public class ComparatorByName implements Comparable{

	@Override
	public int compareTo(Object o1, Object o2) {
		//1、因为要比较的是学生对象的姓名，所有向下转型成Student对象。
		
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		//先比较姓名
		int temp = s1.getName().compareTo(s2.getName())
		//如果姓名相同，再比较年龄。
		return temp==0 ? s1.getAge()-s2.getAge() : temp;
	}

}
