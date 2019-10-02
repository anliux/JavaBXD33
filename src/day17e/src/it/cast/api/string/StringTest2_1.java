package it.cast.api.string;

import java.util.Arrays;

public class StringTest2_1 {

	public static void main(String[] args) {
		/**
		 * ����һ���ַ�����������
		 * ["abc","nba","cctv","itcast"]
		 * Ҫ���С��������
		 * 
		 * 
		 * */
		
		String[] strs = {"abc","nba","cctv","itcast"};
		printArray(strs);
		sortString(strs); //С��棬û����ĺ�����ctrl+1�Զ�����
		printArray(strs);
	}

	//�Զ������ĺ���������tab�������л�ÿ�����ѡȡ
	/**
	 *  ����һ���ַ�����������
	 *  ˼·��
	 * 1��������int[]����ѡ��ð��
	 * 2���ַ�������ͬ��
	 * 3��forǶ��ѭ��
	 * 4��ѭ���н���Ԫ�صĴ�С�Ƚϣ�����������λ���û�
	 * 
	 * */
	public static void sortString(String[] strs) {
		for (int i = 0; i < strs.length-1; i++) {
			for (int j = i+1; j < strs.length; j++) {
				if(strs[i].compareTo(strs[j])>0)//����Ƚ��÷�����compareTo
					//strs[i]>strs[j]����д�ᱨ��
					swap(strs,i,j);
			}
		}
		//Arrays.sort(strs);
		//����һ�����
	}
	
	/**
	 * ����Ԫ�ص�λ���û�
	 * */
	private static void swap(String[] strs, int i, int j) {
		String temp = strs[i];
		strs[i]=strs[j];
		strs[j]=temp;
	}
	
	/**
	 * ��ӡ�ַ�������
	 * */
	private static void printArray(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]+" ");
		}
		System.out.println();
	}
}
