package cn.itcast.api.wrapper.demo;

public class WrapperDemo2 {

	public static void main(String[] args) {
		//int i = 4;  //ֻ�ܻ�������
		//Integer i = new Integer(4);//�߱��������Ժ���Ϊ
		//JDK1.5�Ժ�����һ����װ��������ԣ�Ŀ���Ǽ���д���Զ�װ�䡣
		Integer i = 4;//������������ָ��ı�Ȼ�Ƕ���
			//�Զ�װ�䡣������ֵ--->��װ�������ַ�����Integer i = Integer.valueOf(4);
			//valueOfԴ��������new Integer(i);
		i = i + 5;//ԭ���Ⱥ��ұ߽�i����ת�ɻ�����ֵ��
		    //i.intValue() + 5; �Զ����䡣�ӷ�������ٴ�װ�䡣
			//1.4�i = Integer.valueOf(i.intValue()+5);
		
		Integer a = new Integer(3);
		Integer b = new Integer(3);
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
			//Integer��д��equals�������Ƚϴ˶�����ָ������
			//���ҽ���������Ϊ null��������һ����ö��������ͬ intֵ�� Integer����ʱ��
			//���Ϊ true��
		
		//Сϸ�ڣ�
		Integer x = 128;
		Integer y = 128;
		System.out.println(x==y);//false
		System.out.println(x.equals(y));//true
		
		Integer c = 127;
		Integer d = 127;
		System.out.println(c==d);//true
		System.out.println(c.equals(d));//true
		
		//��jdk1.5�У��Զ�װ��ʱ�������ֵ��byte��Χ֮�ڣ�-128~127���������´�������ռ����ʹ��ԭ�пռ䡣
		
		
		
		
	}

}
