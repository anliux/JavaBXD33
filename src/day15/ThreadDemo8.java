/*
多线程中最为常见的应用案例：
生产者消费者问题<做必须掌握!!!!>
生产和消费同时执行，需要多线程。
但是执行的任务不同，处理的资源却相同 -- 线程间的通信。

1、描述资源
2、描述生产者，因为具备着自己的任务
3、描述消费者，因为具备着自己的任务


问题1：
数据错误，已经被生产很早期的商品，才被消费到，出现了线程安全问题。加入同步解决。
使用同步函数。问题已解决，不会再消费到之前很早期的商品

问题2：
发现了连续生产却没有消费，同时对同一个商品进行多次消费。
希望的结果应该是：生产一个商品，就被消费掉，再生产下一个商品。

搞清楚几个问题：
生产者什么时候生产？消费者什么时候消费？
当盘子中没有面包时，就生产；如果有了面包，就不要生产。
当盘子中已有面包时，就消费；如果没有面包，就不要消费。
*/
//1、描述资源。属性：商品名称和编号。行为：对商品名称赋值，获取商品。
class Resource
{
	private String name;
	private int count=1;

	//1、提供设置的方法
	public synchronized void set(String name)
	{
		//给成员变量赋值并加上编号。
		this.name = name + count;
		//编号自增
		count++;
		//打印生成了哪个商品
		System.out.println(Thread.currentThread().getName()+"....生产者...."+this.name);
	}

	public synchronized void out()
	{
		System.out.println(Thread.currentThread().getName()+"......消费者......"+this.name);
	}
}

//2、描述生产者
class Producer implements Runnable
{
	private Resource r;

	//生产者一初始化就要有资源，需要将资源传递到构造函数中。
	Producer(Resource r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.set("面包");
		}
	}
}

//3、描述消费者
class Consumer implements Runnable
{
	private Resource r;

	//消费者一初始化就要有资源，需要将资源传递到构造函数中。
	Consumer(Resource r)
	{
		this.r = r;
	}
	
	public void run()
	{
		while(true)
		{
			r.out();
		}
	}
}

class  ThreadDemo8
{
	public static void main(String[] args) 
	{
		//1、创建资源对象
		Resource r = new Resource();

		//2、创建线程任务
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);

		//3、创建线程
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);

		t1.start();
		t2.start();
	}
}
