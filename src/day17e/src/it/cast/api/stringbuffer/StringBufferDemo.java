package it.cast.api.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		/**
		 * StringBuffer:
		 * 1、是一个字符串缓冲区，其实就是一个容器。
		 * 2、长度可变，任意类型都可以。注意：是将任意数据都转成字符串进行存储。
		 * 3、容器对象提供很多对容器中数据的操作功能，比如：添加、删除、查找、修改。
		 * 4、必须所有的数据最终变成一个字符串。
		 * 
		 * 和数组最大的不同：
		 * 数组：存储完可以单独操作每一个元素，每个元素都是独立的。
		 * 字符串缓冲区：所有存储的元素都被转成字符串，而且最后拼成了一个大字符串。
		 * */
		
		//1、创建一个字符串缓冲区对象，用于存储数据。
		StringBuffer sb = new StringBuffer();
		
		//2、添加数据。不断添加数据后，要对缓冲区中的最后的数据进行操作，必须转成字符串才可以。
		sb.append(true).append("hehe").append(123);//方法调用链
		sb.append("haha");
		//String str = sb.append(true).append("hehe").append(123).toString();
		//run:truehehe123haha
		
		sb.insert(2, false);//在索引位置2开始插入，包括2
		//run:trfalseuehehe123haha
		
		//3、删除：delete和remove
		//deleteCharAt(int index); //删除指定位置的元素
		sb.delete(1, 4);//左闭右开
		//run:tlseuehehe123haha
		
		//4、替换：replace
		sb.replace(1, 4, "12345");//左闭右开，字符串可以比start到end长
		//run:t12345uehehe123haha
		
		//5、反转：reverse
		sb.reverse();
		//run:ahah321eheheu54321t
		
		//6、设置为定长（裁掉多余部分）
		sb.setLength(2);
		//run:ah
		
		System.out.println(sb);
		
		//“+”的底层过程展示
		//String s = "a"+5+'c';
		//s = new StringBuffer().append("a").append(5).append('c').toString();
	}

}
