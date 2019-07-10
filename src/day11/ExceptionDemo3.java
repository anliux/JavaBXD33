/*
异常的应用：
在编写程序时，必须要考虑程序的问题情况。

举例：卖水果功能需要传递钱参数，有可能有假币。
所以定义程序需要考虑程序的健壮性。

加入一些逻辑性的判断。
*/

class Demo
{
	//对给定的数组通过给定的角标获取元素
	int getElement(int[] arr, int index)
	{
		/*
		jvm出了问题，自己打包对象并抛出。
		但是它所提供的信息不够给力。想要更清晰，需要自己写。
		它的抛出不满足我们的要求。准备自己抛。
		*/
		if(arr==null)
		{
			throw new NullPointerException("arr指向的数组不存在");
		}
		
		if(index<0 || index>arr.length)
		{
			/*
			该条件如果满足，功能已经无法继续运算。这时就必须结束功能，并将问题告知给调用者。这时就需要通过异常来解决。
			怎么用呢？
			1、创建一个异常对象。封装一些提示信息（自定义）
			2、需要将这个对象告知给调用者。怎么告知？怎么将这个对象传递给调用者呢？通过关键字throw就可以完成。
			   格式：throw 异常对象;
			3、throw用在函数内，抛出异常对象，并可以结束函数。
			*/
			throw new ArrayIndexOutOfBoundsException("错误的角标，"+index+"索引在数组中不存在");
		}
		
		
		int element = arr[index];
		return element;
	}
}

class ExceptionDemo3 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		int[] arr = {34,12,67};
		int num = d.getElement(null, 2);
		System.out.println("num="+num);
		System.out.println("over");
	}
}
