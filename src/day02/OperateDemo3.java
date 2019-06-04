class  OperateDemo3
{
	public static void main(String[] args) 
	{
		/*
		
		比较运算符：运算完的结果要么是true，要么是false。

		注意不要把==写成=

		*/
		
		System.out.println("3!=4的结果是"+(3!=4));
		System.out.println("4>=3的结果是"+(4>=4));
		System.out.println("3==4的结果是"+(3==4));

		/*
		
		逻辑运算符：&, |, ^, !, &&, ||

		针对布尔型数值的运算，结果也是布尔型。
		注意两种短路，面试会考到。
		
		*/
		int a = 3;

		//&:与，一假即假，全真才真。
		System.out.println(a>4 & a<2);

		//|:或，一真即真，全假才假。
		System.out.println(a>0 | a<2);

		//^:异或，两边相同为false，不同为true
		System.out.println(a>4 ^ a<2);

		//!:非，就是反面
		System.out.println(!(a>1));//注意：!的优先级高于大于号吗，得加括号。

		//&&：短路与，前假则短路
		System.out.println(a<1 && a>0);//若后面是需要得结果的，则用短路不是好的选择。

		//||:短路非，前真则短路
		System.out.println(a>1 || a<4);




	}
}