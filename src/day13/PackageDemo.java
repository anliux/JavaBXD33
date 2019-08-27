package mypack;//包名中的所有的字母都小写
//package mypack.haha.hehe.xixi;//多级包时，加句点

/*
对于多个类，为了便于管理（类的同名情况），所以java提供了一个解决方案
包机制：落实到操作系统上，就是文件夹。
对Java的文件进行分文件夹管理。

包的定义：使用关键字 package。

包的作用：
	1、对类文件进行管理。
	2、给类文件提供了名称空间。

对带有package定义的java文件进行指定类文件位置的编译方式：
javac -d 目录 源文件

如果目录选择的不是当前目录，想要访问包中类时：
通过设置classpath：set classpath=包所在的父目录


-------------------------------------------
包与包之间访问，提示一个错误：找不到符号DemoA

原因：类名写错，有了包的类，类名：包名.类名 -- 这才是类的全名称
解决：使用DemoA，必须写package.DemoA

-------------------------------------------
编译错误：程序包packa不存在

原因：packa这个包没有找到，在当前目录下
解决：应该告诉jvm这个程序包的位置 -- set classpath=d.myclass

-------------------------------------------
运行错误：DemoA在packa中不是公共的，无法从外部对其进行访问（两次）
两次：左边不是公共的，右边不是公共的 -- 多态，可能前后不一样

原因：DemoA这个类在packa包中权限不够
解决：提升DemoA的权限，提升到public。

--------------------------------------------
编译错误：show()在DemoA中不是公共的，无法从外部对其访问

原因：show方法的权限不够
解决：show用public修饰
注意：前提是class是公共的，否则即使里面的方法是公共，但是类不公共，照样访问不到的。


总结：
包与包之间的类在访问时，被访问的类以及成员都必须public修饰

注意事项：
被public修饰的类或者接口所属的java文件名必须和类或接口的名称一致。否则编译失败。


包与包之间继承：
父类可以给其他包中的子类提供一种特殊的权限protected
只有继承为子类后，才可以访问的权限。

			
			public		protected		default		private
一个类中	  ok		    ok			   ok		   ok
一个包中	  ok			ok			   ok
子类中		  ok		    ok
不同包中	  ok

包与包之间访问，只有两种权限可用，public protected（该权限只能给不同包中的子类使用）

===========================================================

包的出现，导致类的名称过长，书写不方便，咋办？
可以通过指定的关键字解决：import -- 导入

import作用简化类名书写，省略包名。
import不是必须要写。不写import，则直接写全包名即可。

特殊情况一：
packa\packaa\DemoAA.class
	 \DemoA.class
import packa.*;
new DemoAA();
//不行。明确了使用的类所属的包是packa下的，而不会导入packa中子包中的类

如果要使用DemoAA:
import packa.packaa.*;
new DemoAA();

导包：导入的是包中的类，不是包中的包



特殊情况二：不同包中有相同名称的类。
使用该类时，必须指定包名，否则区分不出来。
packa\Demo.class
packb\Demo.class

import packa.Demo;
import packb.Demo;
//new Demo(); //不行。产生了不确定性
new packa.Demo(); //这样可以

注：一般写一个package并且放在程序首行，但是可以写多个import
*/

import packa.DemoA;
import packa.*;//一个包中需要的类很多时，写通配符星号即可
		//真正开发时，不建议用星号，有几十个就写几十个（高级编辑器一个快捷键解决）


class PackageDemo
{
	public static void main(String[] args) 
	{
		//packa.DemoA d = new packa.DemoA();
		DemoA d = new DemoA();//import之后可简化为这条
		d.show();

		//packfu.DemoFu d1 = new packfu.DemoFu()
		//d1.showFu();
		System.out.println("Hello package!");
	}
}
