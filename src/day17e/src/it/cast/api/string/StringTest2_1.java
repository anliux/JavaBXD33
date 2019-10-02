package it.cast.api.string;

import java.util.Arrays;

public class StringTest2_1 {

	public static void main(String[] args) {
		/**
		 * 案例一：字符串数组排序
		 * ["abc","nba","cctv","itcast"]
		 * 要求从小到大排序
		 * 
		 * 
		 * */
		
		String[] strs = {"abc","nba","cctv","itcast"};
		printArray(strs);
		sortString(strs); //小红叉，没定义的函数，ctrl+1自动创建
		printArray(strs);
	}

	//自动创建的函数，按照tab键可以切换每个框和选取
	/**
	 *  案例一：字符串数组排序
	 *  思路：
	 * 1、曾经：int[]排序，选择，冒泡
	 * 2、字符串排序同理
	 * 3、for嵌套循环
	 * 4、循环中进行元素的大小比较，满足条件就位置置换
	 * 
	 * */
	public static void sortString(String[] strs) {
		for (int i = 0; i < strs.length-1; i++) {
			for (int j = i+1; j < strs.length; j++) {
				if(strs[i].compareTo(strs[j])>0)//对象比较用方法：compareTo
					//strs[i]>strs[j]这样写会报错
					swap(strs,i,j);
			}
		}
		//Arrays.sort(strs);
		//可用一句替代
	}
	
	/**
	 * 数组元素的位置置换
	 * */
	private static void swap(String[] strs, int i, int j) {
		String temp = strs[i];
		strs[i]=strs[j];
		strs[j]=temp;
	}
	
	/**
	 * 打印字符串数组
	 * */
	private static void printArray(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]+" ");
		}
		System.out.println();
	}
}
