package cn.itcast.api.b.subclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.itcast.domain.Student;

public class ArrayListTest {

	public static void main(String[] args) {
		List list = new ArrayList();
//		list.add("abc1");
//		list.add("abc2");
//		list.add("abc1");
//		list.add("abc2");
//		list.add("abc1");
//		list.add("abc2");
		
		//自定义对象
		list.add(new Student("lisi1",21));
		list.add(new Student("lisi2",22));
		list.add(new Student("lisi1",21));
		list.add(new Student("lisi2",22));
		list.add(new Student("lisi1",21));
		
		getSingleElement(list);//去除重复元素。
		System.out.println(list);

	}
	
	
	/*
	 * 案例：去除List集合中的重复元素。
	 * 
	 * 思路
	 * 1、先创建一个临时容器，用于存储唯一性的元素。
	 * 2、遍历原容器，将遍历到的元素到临时容器中去判断是否存在。
	 * 3、若存在，不存储到临时容器；如果不存在，存储到临时容器中。
	 * 4、遍历结束后，临时容器中存储的就是唯一性的元素。
	 * 5、如果需要将这些唯一性的元素保留到原容器中，只要将原容器清空，将临时容器中的元素添加到原容器中即可。
	 * */
	
	public static void getSingleElement(List list) {
		//1、创建一个临时容器。
		List temp = new ArrayList();
		
		//2、遍历原容器
		for (Iterator it = list.iterator(); it.hasNext(); ) {
			Object obj = it.next();
			
			//对遍历到的每个元素都到临时容器中去判断是否包含。<关键>
			if(!temp.contains(obj)) {//如果不存在，就添加到临时容器中。contains底层是equals方法
											  //Student中的equals是继承自父类Object的equals方法，比较的是引用的地址。
											  //针对本代码，需要Student重写equals方法
				temp.add(obj);
			} 
		}
		//唯一性的元素已经被记录到临时容器中。
		//清空原容器中的元素
		list.clear();
		
		//把临时容器中的元素添加到原容器中。
		list.addAll(temp);
	}

}
