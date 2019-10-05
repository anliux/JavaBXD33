package cn.itcast.domain;

public class Student implements Comparable {
	private String name;
	private int age;
		
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/*/��дhashCode����������Student�����hashCodeֵ�㷨��
	 * ͨ��ѧ�����������������������������hashֵ��
	 * */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final NUMBER = 31;
		return name.hashCode() + age*NUMBER;  //������һ����Ϊ������֤hashֵ��ͬ��ֹ�����������䲻ͬ������hashֵ��ͬ�������
	}
	
	//��д��equals������������Student�����ж���ͬ�����ݡ�
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		
		if(!(obj instanceof Student))
			throw new ClassCastException();
		Student stu = (Student) obj;
		
		return this.name.equals(stu.name) && this.age==stu.age;
	}
	
	//ע��Ҳ������shift+alt+s���Զ�������дhashCode��equals����
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	/*
	 * ��дcompareTo����������ѧ������Ȼ���򣨶����Ĭ������ʽ��
	 * ����ѧ����������
	 * */
	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Student)) {
			throw new ClassCastException();
		}
		Student stu = (Student) o;
		
//		if(this.age>stu.age)
//			return 1;
//		if(this.age<stu.age)
//			return -1;
//		return 0;
		/*
		 * ע�⣺�ڱȽ�ʱ��������ȷ���Σ���Ҫ������ͬ�������Ƚϴ�Ҫ����
		 * */
		int temp = this.age -stu.age;
		
		return temp==0 ? this.name.compareTo(stu.name) : temp;
	}
	
	
			
}
