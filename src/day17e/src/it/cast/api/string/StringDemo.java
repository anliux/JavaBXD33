package it.cast.api.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个字符串
		String str = "abcd";
//		str = "haha";
		System.out.println("str="+str);
		
		//-----------------------
		System.out.println("--------多个引用指向同一个字符串--------");
		String s1 = "itcast";
		String s2 = "itcast";
		System.out.println(s1==s2);//true
			//"itcast"放在常量池里，, 共享，不同变量指向同一对象
		
		System.out.println("--------两个内容相同 创建方式不同的字符串--------");
		String s3 = "abc";
		String s4 = new String("abc");//开发不常用，通常传数组
		/*s3和s4有什么不同？
		 * s3创建：在内存中只要一个对象
		 * s4创建：在内存中有两个对象		 * 
		 * */
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
		//因为String复写了equals方法，
		//建立字符串自己的判断相同的依据, 是通过字符串对象中的内容来判断的
		
		
	}

}
