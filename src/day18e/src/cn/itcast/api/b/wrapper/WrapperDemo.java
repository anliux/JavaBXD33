package cn.itcast.api.b.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		/*
		 * 场景：
		 * 通过文本框获取用户输入的数字数据，但是得到的都是字符串。
		 * 如果想要对字符串中的数字进行运算，必须将字符串转成数字。
		 * 
		 * java中提供了相应的解决的对象。
		 * 基本数据类型对象包装类：java将基本数据类型值封装成对象。
		 * 封装成对象的好处：可以提供更多的操作基本数值的功能。
		 * 基本数据类型：8种
		 * byte			Byte
		 * short		Short
		 * int 			Integer
		 * long			Long
		 * float		Float
		 * double		Double
		 * boolean		Boolean
		 * char			Character 
		 * 
		 * */
		
		//学习一下Integer
		/*
		 * 基本数据类型包装类的特点：
		 * 1、用于在基本数据和字符串之间进行转换。<重点!!!!>
		 * int parseInt(string);
		 * byte parseByte(string);
		 * boolean parseBoolean(string);
		 * 特殊：Character没有解析方法。
		 * 
		 * */
		
		System.out.println(Integer.MAX_VALUE);//MIN>VALUE:int类型所能表示的最小值
		System.out.println(Integer.toBinaryString(-6));
			//十进制转成其他进制：进制转换的返回值是Sting类，toHexString(int i), toOctalString(int i);
		
		//1、字符串--->基本数值。基本数值（字符串） 演示Integer int(String)
		System.out.println(Integer.parseInt("123")+2);
			//输入的数据格式错误：抛出异常java.lang.NumberFormatException（运行时异常）
		
		System.out.println(Integer.parseInt("110", 10));//radix基数，即指定进制。若不符合，抛出数字格式异常。
			//可以将其他进制转成十进制，与上面的toXxxx方法相呼应。
		
		//2、基本数值--->字符串：34+"";（不专业）  String.valueOf(34);(返回参数的字符串表现形式) Integer.toString(int);
		System.out.println(34+5);
		
		//3、基本数值<----->包装对象
		//基本数值--->包装对象
		Integer i = new Integer(4);//用构造函数	
		Integer ii = new Integer("4");//和上一行是一回事
		Integer iii = Integer.valueOf(4);//静态方法
		//包装对象--->基本数值
		int num = i.intValue();
		
		
		
		
	}

}
