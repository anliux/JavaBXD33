package cn.itcast.api.c.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import cn.itcast.domain.Student;

public class SetDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * */
		Set set = new HashSet();
		
		//ȥ�����ַ����е��ظ�Ԫ�ء�
		/*
		set.add("haha");
		set.add("java");
		set.add("itcast");
		set.add("haha");
		set.add("nba");
		set.add("nba");
		set.add("java");
		set.add("haha");
		set.add("itcast");
		*/
		
		//û��ȥ���Զ�������е��ظ�Ԫ�ء���һ���о�Set������������ݽṹ��
		/*
		 * Ϊʲôѧ������û�б�֤Ψһ���أ�
		 * ͨ���Թ�ϣ��ķ�����
		 * �洢Ԫ��ʱ���ȵ�����Ԫ�ض����hashCode()����,
		 * ��ÿ��ѧ���������½����Ķ�������hashCodeֵ������ͬ��Ҳ�Ͳ���Ҫ�ж�equals�����ˡ�
		 * ��Ҫ��������ͬ����ͬ��������֤ѧ�������Ψһ����ô�죿
		 * ����ʹ��Object�е�hashCode��������Ҫ���¶���hashCode���㷨���ݡ�
		 * ��˵����дhashCode������
		 * */
		set.add(new Student("lisi1",21));
		set.add(new Student("lisi2",22));
		set.add(new Student("lisi1",21));
		set.add(new Student("lisi2",22));
		set.add(new Student("lisi1",21));
		
		for (Iterator it = set.iterator(); it.hasNext();) {
			System.out.println(it.next());			
		}
	}

}
