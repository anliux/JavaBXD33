/*
需求：
资源有姓名和性别。
两个线程：
	一个负责给姓名和性别赋值
	一个负责获取姓名和性别的值

参阅ThreadDemo2.java文件

要求1：运行一下，解决程序的“妖”的问题
	分析：
	加入同步，必须保证同一个锁，解决妖的问题

要求2：实现正确数据间的传输 如
	张飞--男
	rose--女女女
	张飞--男
	rose--女女女
	使用等待唤醒机制
	wait(), notify(), notifyAll();
	对于等待都需要判断，定义条件。

要求3：对代码进行重构
	将name，sex私有化，资源类提供对其访问的方法

要求4：将程序改为JDK1.5的Lock Condition接口
	Lock替换了同步函数或者同步代码块
	Condition替代了监视器方法，将监视器方法从锁上分离出来，单独封装到Condition对象。
*/


class  ThreadTest2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
