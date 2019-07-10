/*
异常发生的过程。
*/

class Demo
{
	//对给定数组，通过给定的脚标获取元素。
	
	int getElement(int[] arr, int index)
	{
		int element = arr[index];
		/*
		没有找到4的脚标，运行时发生了问题，这个问题JVM认识
		这个问题java本身有描述，描述内容有：
		问题的名称，问题的内容，问题的发生位置
		既然有这么多信息，java就将这些信息直接封装到对象中
		ArrayIndexOutOfBoundsException

		throw new ArrayIndexOutOfBoundsException(index);//问题对象
											//函数到这里就结束了。
		jvm将问题抛给调用者main。
		*/
		return element;
	}
}


class ExceptionDemo2
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		int[] arr = {34,12,67};
		int num = d.getElement(arr,4);
		/*
		主函数就收到了越界异常对象。没有处理
		main函数就会继续抛出给调用者jvm
		jvm收到问题后，就做出了最终的处理方式。
		将问题对象中的名称、信息、问题的位置，都显示在屏幕上，让软件使用者知道。
		同时，让程序提前终止。
		*/
		System.out.println("num="+num);
		System.out.println("over");
	}
}
