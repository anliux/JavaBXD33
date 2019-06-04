class  OperateDemo2
{
	public static void main(String[] args) 
	{
		/*

		赋值运算符：
		= += -= *= /= %=

		*/

		//=的简单应用：
		int x,y,z;
		x=y=z=3;
		System.out.println("x="+x+",y="+y+",z="+z);

		//+=的简单应用：
		int a = 2;//右边赋值给左边
		System.out.println("初始化值 a="+a);
		a+=4;//将左右两边的和赋值给左边，相当于a=a+4;
		System.out.println("经过+=后 a="+a);

		//一道经典面试题：
		short s = 4;
		//s = s + 5;
		//用这句会报错，右边完成运算结果是int型，无法确定是否在short范围内。

		s+=5;//编译通过。+=是赋值运算符，会做自动类型转换，不涉及丢失精度。

		System.out.println("Hello World!");
	}
}
