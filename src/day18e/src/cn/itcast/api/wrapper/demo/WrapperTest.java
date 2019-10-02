package cn.itcast.api.wrapper.demo;

import java.util.Arrays;

public class WrapperTest {

	private static final String SPACE = " ";

	public static void main(String[] args) {
		/*
		 * ��ϰ��������
		 * "23 9 -4 18 100 7"
		 * Ҫ����⴮���ְ��մ�С������������һ����ֵ������ַ�����
		 * ˼·��
		 * 1��ֻ������ᡣ������Ҫ���飬�����о�Ҫ��Ԫ�ء�
		 * 2��Ԫ�أ����ַ������ôȡ������Ҫ��ȡ�ַ����е����ݣ���ҪString����
		 * 3�����ַ�����ȡ����ֵ��洢��һ��int�����С���ΪҪ����
		 * 4�����������������ַ�����
		 * 
		 * */
		String numsString = "23 9 -4 18 100 7";
		numsString = sortNumberString(numsString);
		System.out.println("nums="+numsString);

	}

	public static String sortNumberString(String numsString) {
		//1����ȡ�ַ����е����֡���ô��ȡ��һ���ַ���ͨ�������ָ�ɶ���ַ��� split();
		String[] strs = numsString.split(SPACE);
		
		//2������ֱ�Ӷ��ַ������д�С������Ϊ�ַ�����23��9С��������ת��������
		int[] nums = parseIntArray(strs);
		
		//3������������
		Arrays.sort(nums);
		
		//4��������ת���ַ�����
		return toString(nums);
	}

	private static String toString(int[] nums) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nums.length; i++) {
			if(i!=nums.length-1)
				sb.append(nums[i]+" ");
			else
				sb.append(nums[i]);
		}
		return sb.toString();
	}

	private static int[] parseIntArray(String[] strs) {
		//1������һ��int���顣
		int[] arr = new int [strs.length];
		
		//2�������ַ������飬��Ԫ��ת��int�洢��arr�С�
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(strs[i]);
		}
		return arr;
	}

}
