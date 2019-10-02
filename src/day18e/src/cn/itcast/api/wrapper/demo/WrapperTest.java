package cn.itcast.api.wrapper.demo;

import java.util.Arrays;

public class WrapperTest {

	private static final String SPACE = " ";

	public static void main(String[] args) {
		/*
		 * 练习：面试题
		 * "23 9 -4 18 100 7"
		 * 要求对这串数字按照从小到大排序，生成一个数值有序的字符串。
		 * 思路：
		 * 1、只有排序会。排序需要数组，数组中就要有元素。
		 * 2、元素：在字符串里，怎么取出来？要获取字符串中的内容，需要String对象
		 * 3、从字符串获取到数值后存储到一个int数组中。因为要排序。
		 * 4、将排序后的数组变成字符串。
		 * 
		 * */
		String numsString = "23 9 -4 18 100 7";
		numsString = sortNumberString(numsString);
		System.out.println("nums="+numsString);

	}

	public static String sortNumberString(String numsString) {
		//1、获取字符串中的数字。怎么获取：一个字符串通过参数分割成多个字符串 split();
		String[] strs = numsString.split(SPACE);
		
		//2、不能直接对字符串进行大小排序，因为字符串的23比9小，必须先转成整数。
		int[] nums = parseIntArray(strs);
		
		//3、对数组排序。
		Arrays.sort(nums);
		
		//4、将数组转成字符串。
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
		//1、定义一个int数组。
		int[] arr = new int [strs.length];
		
		//2、遍历字符串数组，把元素转成int存储在arr中。
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(strs[i]);
		}
		return arr;
	}

}
