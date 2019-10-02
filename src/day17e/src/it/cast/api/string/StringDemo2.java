package it.cast.api.string;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * "abcde"
		 * 1、字符串是一个对象，那么它的方法必然是围绕操作这个对象的数据而定义的。
		 * 2、你认为字符串中有哪些功能呢？
		 * 	2.1 有多少个字符
		 *  	int length()// 返回此字符串的长度。空参，用this
		 *  2.2 字符的位置
		 *  	int indexOf(int ch, int fromIndex) // 返回指定字符在此字符串中第一次出现处的索引。
		 *  	// 参数：ch - 一个字符（Unicode 代码点）。 
		 *  2.3 获取指定位置上的字符
		 *  	char charAt(int index) // 返回指定索引处的 char 值。
		 *  2.4 获取部分字符串
		 * 		String substring(int beginIndex, int endIndex) 
		 *      // 返回一个新字符串，它是此字符串的一个子字符串。
		 *      // 该子字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符。
		 *      // 因此，该子字符串的长度为 endIndex-beginIndex。 
		 * */
		
		String str = "abada";
//		System.out.println("length="+str.length());
		//开发常用的不用查表方法：明确返回值为int后，直接先定义为int型
		int len = str.length();
		System.out.println("len="+len);
		
		//--------a字母出现的位置--------
		int index = str.indexOf('a');//获取的是指定字符第一次出现的位置
		System.out.println("index="+index);
		
		//--------第二个a字母出现的位置--------
		int index1 = str.indexOf('a', index+1);
		System.out.println("index1="+index1);
		
		//--------第三个a字母出现的位置--------
		int index2 = str.indexOf('a', index1+1);
		System.out.println("index2="+index2);
		
		//--------倒着查找-------------
		str = "lkjjflajlfkuooioeooweojgouoa";
		int index3 = str.lastIndexOf('m');
			//当要查找的字符不存在时，返回-1
		System.out.println("index3="+index3);
				
		//--------获取指定位置上的字符-------
		str = "itcast";
		char ch = str.charAt(3);
			// 不存在的角标会抛出异常： java.lang.StringIndexOutOfBoundsException
		System.out.println("ch="+ch);
		
		//--------获取部分字符串------
		String s = str.substring(2, 4);//包头 不包尾
			//开始角标和结束角标时：100%是左闭右开的。
		System.out.println("s="+s);
			
	}

}
