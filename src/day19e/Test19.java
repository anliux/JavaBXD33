Collection:
	|--List：有序，带索引，通过索引就可以精确操作集合中的元素。元素可重复。
			   List提供了增删改查的动作
			   增加：add(element);  add(index, element);
			   删除：remove(element);  remove(index);
			   修改：set(index, element);
			   查询：get(index)
			|--Vector：可增长的数组结构。同步的。效率非常低，已被ArrayList替代。
			|--ArrayLsit：数组结构，长度可变（原理：创建新数组+复制数组），查询速度很快，增删较慢。非同步的（后期加入的多是不同步的）。
			|--LinkedList：链表结构，不同步，增删速度快，查询速度较慢。
					可用于实现堆栈和队列。
					堆栈：先进后出 First in Last Out FILO 手枪弹夹
					队列：先进先出 Fisst in First Out FIFO 排队买票
									
			-- 一般选ArrayList：开发时查询多，增删慢。
			--List可存储重复元素，如果需求中要求容器中的元素必须保证唯一性。
	|--Set：不包含重复元素的集合，不保证顺序。而且方法与Collection一致。Set集合取出元素的方式只有一种：迭代器。
			|--HashSet：哈希表结构，不同步，保证元素唯一性的方式依赖于hashCode和equals方法。查询速度快，但只针对唯一性元素。
			|--TreeSet：可以对set集合中的元素进行排序。使用的是二叉树结构。
							 保证元素唯一性的方法：使用的对象比较方法的结果是否为0，为0就视为相同元素而不存。
							
							 |--对比：TreeSet不一定快，但是结果是有序的。				 

							 元素的排序比较有两种方式：
							 1、元素自身具备自然排序，其实就是实现了Comparable接口重写了compareTo方法。
							      如果元素自身不具备自然排序，或者具备的自然排序不是所需要的，这时只能用第二种方式。
							 2、比较器。其实就是在创建TreeSet集合时，在构造函数中指定具体的比较方式。
							 	  需要定义一个类，实现Comparor接口，重写compare方法。
							 
							 
							 
							 
							 