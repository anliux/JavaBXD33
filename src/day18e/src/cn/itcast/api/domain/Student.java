package cn.itcast.api.domain;

public class Student {
	private String name;
	private int age;
	
	/*
	 * ����ѧ�������ж���ͬ�����ݡ�
	 * ����equals������ֻҪͬ����ͬ���䣬����Ϊͬһ�ˣ���Ϊ�ظ�Ԫ�ء�
	 * 
	 * */
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(!(obj instanceof Student)) {
			throw new ClassCastException();
		}
		Student stu = (Student)obj;
		return this.name.equals(stu.name) && this.age==stu.age;
	}
	
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
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
