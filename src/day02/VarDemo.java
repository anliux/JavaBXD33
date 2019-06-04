class VarDemo 
{
	public static void main(String[] args) 
	{
		//定义变量的格式：数据类型 变量名 = 初始化值；

		byte b = 6;
			
		short s = 4;

		int i = 7;

		long l = 12345678900l; 
		//错误：过大的整数。整数默认为int型。对于过大的数，数后加l（long的l）

		float f = 2.5f;
		//错误：不兼容的类型。小数默认为double型。小数后加f表示单精度存储

		char c = 1;//直接写数字不报错。

		char ch = '1';//char型正确的写法。

		boolean bo = true;//或者：boolean bo = false;

		System.out.println("Hello World!");
	}
}
