package cn.itcast.api.domain;

public class Student {
	private String name;
	private int age;
	
	/*
	 * 建立学生对象判断相同的依据。
	 * 覆盖equals方法，只要同姓名同年龄，就视为同一人，视为重复元素。
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
