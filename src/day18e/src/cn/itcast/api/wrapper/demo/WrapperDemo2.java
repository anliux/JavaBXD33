package cn.itcast.api.wrapper.demo;

public class WrapperDemo2 {

	public static void main(String[] args) {
		//int i = 4;  //只能基本运算
		//Integer i = new Integer(4);//具备更多属性和行为
		//JDK1.5以后，有了一个包装类的新特性：目的是简化书写。自动装箱。
		Integer i = 4;//引用数据类型指向的必然是对象。
			//自动装箱。基本数值--->包装对象：三种方法。Integer i = Integer.valueOf(4);
			//valueOf源码中仍是new Integer(i);
		i = i + 5;//原理：等号右边将i对象转成基本数值。
		    //i.intValue() + 5; 自动拆箱。加法运算后，再次装箱。
			//1.4里：i = Integer.valueOf(i.intValue()+5);
		
		Integer a = new Integer(3);
		Integer b = new Integer(3);
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
			//Integer重写的equals方法：比较此对象与指定对象。
			//当且仅当参数不为 null，并且是一个与该对象包含相同 int值的 Integer对象时，
			//结果为 true。
		
		//小细节：
		Integer x = 128;
		Integer y = 128;
		System.out.println(x==y);//false
		System.out.println(x.equals(y));//true
		
		Integer c = 127;
		Integer d = 127;
		System.out.println(c==d);//true
		System.out.println(c.equals(d));//true
		
		//在jdk1.5中，自动装箱时，如果数值在byte范围之内（-128~127），不会新创建对象空间而是使用原有空间。
		
		
		
		
	}

}
