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
	 * ������Person�����ж��Ƿ���ͬ�����ݡ�ֻҪ��ͬ������ͬ���䣬����ͬһ���ˡ�
	 * 
	 * */
		
	@Override
	public boolean equals(Object obj) {//Person��equals
		// TODO Auto-generated method stub
		if(!(this==obj))
			return true;
		
		if(!(obj instanceof Person))
			throw new ClassCastException("���ʹ���");
		
		Person p = (Person)obj;
		return this.name.equals(p) && this.age==p.age;//�ַ��������equals
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	/**
	 * �Ƚ������С�ķ���
	 * 
	 * */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(!(o instanceof Person))
			throw new ClassCastException("���ʹ���");
		Person p = (Person)o;
		
		return this.age - p.age;
	}
	
	
}
