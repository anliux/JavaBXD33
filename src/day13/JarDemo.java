/*
Jar包：java中的压缩包。（读法：架包，勾包）
使用不给力，但是真实开发必须用。

打压缩包后，java运行：直接将jar导入到classpath路径即可。
*/
package pack;
class  JarDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello jar!");
	}
}
//注：若将类文件在javac时指定到当前目录下（用-d .)但java时找不到
//这时看看classpath是不是自定义到指定路径下了，set classpath= 或 set classpath=.;%classpath%
//注意：java 运行类文件时，因为该类文件在包里不在当前目录，故找不到，需要加包名
//	java pack.JarDemo