package cn.itcast.api.d.comparator;

import cn.itcast.domain.Student;

public class ComparatorByName implements Comparable{

	@Override
	public int compareTo(Object o1, Object o2) {
		//1����ΪҪ�Ƚϵ���ѧ���������������������ת�ͳ�Student����
		
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		//�ȱȽ�����
		int temp = s1.getName().compareTo(s2.getName())
		//���������ͬ���ٱȽ����䡣
		return temp==0 ? s1.getAge()-s2.getAge() : temp;
	}

}
