package it.cast.api.string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 方法查找练习:
		 * 1、字符串是否以指定字符串开头。结尾同理。
		 * 		boolean startsWith(string)
		 * 		boolean endsWith(string)
		 * 
		 * 2、字符串中是否包含另一个字符串。
		 * 		boolean contains(string)
		 * 		int indexOf(string) //如果返回-1，表示不存在
		 * 
		 * 3、字符串中另一个字符串出现的位置。
		 * 		int indexOf(string) 
		 * 
		 * 4、将字符串中指定的字符串替换成另一个字符串。
		 * 		String replace(oldstring, newstring)
		 * 
		 * 5、字符串如何比较大小。
		 * 		int compareTo(String anotherString)
		 * 
		 * 6、将字符串转成一个字符数组。或者字节数组。
		 * 		char toCharArray()
		 * 		byte getBytes()
		 * 
		 * 7、将字母字符串转成大写的字母字符串。
		 * 		String toUpperCase()
		 * 		String toLowerCase()
		 * 
		 * 8、将字符串按照指定的方式分解成多个字符串，"lisi, wangwu, zhaoliu"获取三个姓名。
		 * 		String[] split(string)
		 * 
		 * 
		 * 
		 * */
		
		//1
		String str = "StringDemo.java";
		boolean b1 = str.startsWith("Demo");//false
		//2
		boolean b2 = str.contains("Demo"); //CharSequence x = "Demo"; 多态
		//4
		String s = str.replace("Demo", "Test");
			//没有被替换内容时，结果是原串。
		System.out.println("s="+s);
		//6
		char[] chs = str.toCharArray();
		byte[] nums = str.getBytes();
		//7
		String upperString = str.toUpperCase();
		String lowerString = str.toLowerCase();
		//8
		str = "lisi,wangwu,zhaoliu"; //空格会保留
		String[] names = str.split(","); //表示用所传实参切割
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//5、字符串如何比较大小？
		int result = "ab".compareTo("cd");
			//第一个相同时，比较第二个，差值是首个不同的差值
		System.out.println("result="+result);
		
		//只要想让对象具备比较大小的功能，只需实现Comparable接口
		
	}

}
