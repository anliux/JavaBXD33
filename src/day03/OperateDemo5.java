class  OperateDemo5
{
	public static void main(String[] args) 
	{
		
		//三元运算符：格式：(条件表达式)?表达式1:表达式2;
		int x = 6,y;
		y = x>2?100:200;//成立得100，不成立得200
		System.out.println("y="+y);

		//获取两个数中的大数
		int a = 3, b = 4;
		System.out.println("max="+((a>b)?a:b));

		//需求：三个数，获取最大的一个。
		//课堂作业，不知是不是最优解。已验证，待老师解答。
		//本节最后Test中解答：确实要引入其他变量。思路正确。
		int c = 500, d = 100, e = 9;
		int max = (c>d?c:d);//可直接初始化，不用另起一行。
		max = (max>e?max:e);
		System.out.println("max="+max);

	}
}
