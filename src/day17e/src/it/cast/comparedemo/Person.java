package it.cast.comparedemo;

public class Person implements Comparable{
	private String name;
	private int age;
	
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	/**
	 * 建立了Person对象判断是否相同的依据。只要是同姓名，同年龄，就是同一个人。
	 * 
	 * */
		
	@Override
	public boolean equals(Object obj) {//Person的equals
		// TODO Auto-generated method stub
		if(!(this==obj))
			return true;
		
		if(!(obj instanceof Person))
			throw new ClassCastException("类型错误");
		
		Person p = (Person)obj;
		return this.name.equals(p) && this.age==p.age;//字符串对象的equals
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	/**
	 * 比较年龄大小的方法
	 * 
	 * */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(!(o instanceof Person))
			throw new ClassCastException("类型错误");
		Person p = (Person)o;
		
		return this.age - p.age;
	}
	
	
}
