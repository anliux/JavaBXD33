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
		
		//�Զ������
		list.add(new Student("lisi1",21));
		list.add(new Student("lisi2",22));
		list.add(new Student("lisi1",21));
		list.add(new Student("lisi2",22));
		list.add(new Student("lisi1",21));
		
		getSingleElement(list);//ȥ���ظ�Ԫ�ء�
		System.out.println(list);

	}
	
	
	/*
	 * ������ȥ��List�����е��ظ�Ԫ�ء�
	 * 
	 * ˼·
	 * 1���ȴ���һ����ʱ���������ڴ洢Ψһ�Ե�Ԫ�ء�
	 * 2������ԭ����������������Ԫ�ص���ʱ������ȥ�ж��Ƿ���ڡ�
	 * 3�������ڣ����洢����ʱ��������������ڣ��洢����ʱ�����С�
	 * 4��������������ʱ�����д洢�ľ���Ψһ�Ե�Ԫ�ء�
	 * 5�������Ҫ����ЩΨһ�Ե�Ԫ�ر�����ԭ�����У�ֻҪ��ԭ������գ�����ʱ�����е�Ԫ����ӵ�ԭ�����м��ɡ�
	 * */
	
	public static void getSingleElement(List list) {
		//1������һ����ʱ������
		List temp = new ArrayList();
		
		//2������ԭ����
		for (Iterator it = list.iterator(); it.hasNext(); ) {
			Object obj = it.next();
			
			//�Ա�������ÿ��Ԫ�ض�����ʱ������ȥ�ж��Ƿ������<�ؼ�>
			if(!temp.contains(obj)) {//��������ڣ�����ӵ���ʱ�����С�contains�ײ���equals����
											  //Student�е�equals�Ǽ̳��Ը���Object��equals�������Ƚϵ������õĵ�ַ��
											  //��Ա����룬��ҪStudent��дequals����
				temp.add(obj);
			} 
		}
		//Ψһ�Ե�Ԫ���Ѿ�����¼����ʱ�����С�
		//���ԭ�����е�Ԫ��
		list.clear();
		
		//����ʱ�����е�Ԫ����ӵ�ԭ�����С�
		list.addAll(temp);
	}

}
