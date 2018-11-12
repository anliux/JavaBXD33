/*
对前五天的知识点进行简单回顾。

案例：对数组操作，获取最大值。

思路：
1、一组数，要获取最大值。
2、怎么比较？挨个比较。要获取数组中的每一个数据都要比较。
3、比较完，记下来比较大的数，并用这个较大的数和下一个数据比较，不断记录较大的值。
4、如果所有数据都比较完，那么最后记录的较大的数就是最大值。

步骤：
1、需要一个类。
2、这个类需要独立运行，必须有main方法。
3、有一个数组。
4、每一次较大的数据都有可能不同。变量。
5、把数组的数据都获取出来。为了比较。遍历。
6、在遍历过程中，需要比较，判断。
7、每满足一次判断条件，就用变量记录较大的值。变量存储。

代码：

测试：


*/


//1、需要一个类。
class  ArrayDemo
{
	//2、这个类需要独立运行，必须有main方法。
	public static void main(String[] args) 
	{
		//3、有一个数组。
		int[] arr = {23,11,88,56,78};

		//4、每一次较大的数据都有可能不同。变量。
		int maxValue = arr[0]; //初始化为数组中的任意一个元素。

		//5、把数组的数据都获取出来。为了比较。遍历。
		for (int i=1; i<arr.length; i++)
		{
			//6、在遍历过程中，需要比较，判断。
			if(arr[i] > maxValue)
				
				//7、每满足一次判断条件，就用变量记录较大的值。变量存储。
				maxValue = arr[i];
		}

		//8、一旦遍历结束，maxValue中存储的就是该数组的最大值。

		//为了显示最大值，告诉使用者。输出语句。
		System.out.println("最大值："+maxValue);
	}
}

//class名称与.java文件名称不一致
//javac 前五天回顾.java   --->    生成 ArrayDemo.class 文件
//java ArrayDemo    ------>      运行

/*

案例2：又来一个数组，要获取最大值。复制代码并改变量名，怂。
	   既然代码不变，为什么不提高这段代码的重复使用呢？传说中的复用性。

	   怎么提高复用性？将这部分代码编程一个整体。并给这个整体起个名字(目的为了便于使用这个整体)
	   Java中代码编程一个整体，通过函数体现，所以，函数就是一个类中的功能。

*/
class ArrayDemo2
{
	public static void main(String[] args)
	{
		int[] arr = {12,34,55,88};
		//获取最大值，需要一个功能。
		int maxValue = getMaxValue(arr);
		System.out.println("maxValue:"+maxValue);
		
		int[] arr2 = {1,2,34,21,9};
		int maxValue2 = getMaxValue(arr2);
		System.out.println("maxValue2:"+maxValue2);

	}

	//需要getMaxValue功能，而这个功能目前是没有的，所以需要自定义。提高复用性
	public static int getMaxValue(int[] arr)
	{
		int maxValue = arr[0];

		for (int x=1; x<arr.length; x++)
		{
			if(arr[x]>maxValue)
				maxValue = arr[x];
		}

		//一旦遍历结束，maxValue中存储的就是该数组的最大值。
		//将该值返回，不要打印，因为不是该功能的职责。
		return maxValue;
	}
}





/*
案例3：继续升级，很多类中都有数组，都需要获取其最值。
怎么办？不要复制。
将所需的功能封装到指定的类中。



*/
class ArrayDemo3
{
	public static void main(String[] args)
	{
		int[] arr = {33,43,67,98};
		
		//想要使用ArrayTool中的功能，需要先建立ArrayTool这个类应用程序的对象，通过new完成。
		//都是引用型，类与数组类似，数组存放数据，类存放功能，通过new创建实体
		ArrayTool tool = new ArrayTool();
		int maxValue = tool.getMaxValue(arr);//通过tool这个对象调用它的获取最大值的功能

		//int maxValue = ArrayTool.getMaxValue(arr);//当调用功能有static时

		System.out.println("maxValue:"+maxValue);

		//获取最小值
		int minValue = tool.getMinValue(arr);
		System.out.println("minValue:"+minValue);
	}

}
/*
将操作数组的最大值的功能单独封装到一个类中
这样使用这个功能只要找到功能所属的类就可以了。

ArrayTool tool = new ArrayTool();//这个就是对象
int maxValue = tool.getMaxValue(arr);

所有的功能都在对象中。只要找到了对象，就可以使用这些功能，而不需要关注功能的细节。

Arrays.sort(arr);//真正开发的时候写这个就行。最优的。

要学的：先找能解决问题的功能，再找功能所属的类或对象。
自己做：先做对象，再做方法，方便以后复用。
*/



class ArrayTool
{
	//获取最大值。
	public /*static*/ int getMaxValue(int[] arr)  //static不是必需的
	{
		int maxValue = arr[0];

		for (int x=1; x<arr.length; x++)
		{
			if(arr[x]>maxValue)
				maxValue = arr[x];
		}

		return maxValue;
	}

	//获取最小值
	public /*static*/ int getMinValue(int[] arr)
	{
		//code..
		return 0;//仅为编译通过。
	}

	//二分查找。折半。
	public /*static*/ int binarySearch(int[] arr)
	{
		return 0;
	}
}










