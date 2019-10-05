package cn.itcast.api.f.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.itcast.api.domain.Student;

public class ListDemo {

	public static void main(String[] args) {
		/*
		 * ʹ��List���������Ԫ�ص����⡣��Ϊaddֻ��׷�ӡ�
		 * List�ӿڵ����з�����ȫ����Χ������������ġ�
		 * List��ȡԪ�صķ�ʽ��һ���ǵ�����һ���Ǳ���+get
		 * List�ӿ���֧�ֶ�Ԫ�ؽ���curd����ɾ�Ĳ飩�����ġ�
		 * */
		List list = new ArrayList();
		
		//1�����Ԫ�ء�
		list.add(new Student("wangcai1",21));
		list.add(new Student("wangcai2",22));
		list.add(new Student("wangcai3",23));
		
		//2������Ԫ�ء�
//		list.add(1, new Student("xiaoqiaong",25));
		//3��ɾ��Ԫ�ء�
		list.remove(1);//remove(4)ʱ��java.lang.IndexOutOfBoundsException���Ǳ�Խ���쳣
			//û˵�����飬Ҳû˵���ַ��������ǽǱ�Խ���쳣��
		
		//4���޸�Ԫ�ء�
		list.set(1, new Student("xiaoming",22));
		
		//5����ȡԪ��
		Object obj = list.get(1);//get��remove�����Ի�ȡԪ�ء�
			//����get��ȡ�󣬶�Ӧ��Ԫ�ػ���list�У�list���Ȳ��䡣remove��ȡ�󣬶�Ӧ��Ԫ�ش�list���Ƴ���list����-1.
		for (int i = 0; i < list.size(); i++) {
			System.out.println("get("+i+"):"+list.get(i));
		}
		
		for (Iterator it = list.iterator(); it.hasNext();) {
			Student stu = (Student) it.next();
			System.out.println(stu);
		}

	}

}
