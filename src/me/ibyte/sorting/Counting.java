package me.ibyte.sorting;

import java.util.Arrays;

public class Counting {

	public static void main(String[] args) {
		Integer[] arr = { 22, 11, 34, 111, 1, 453, 5 };
		arr = countingSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	// https://segmentfault.com/q/1010000003902641
	public static Integer[] countingSort(Integer[] arr) {
		int max = arr[0], min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		 // 计数出区间偏移
		int offset = max - min + 1;

		// 根据区间创建计数数组
		int[] counts = new int[offset];

		// 对应的下标累加
		for (int i = 0; i < arr.length; i++) {
			counts[arr[i] - min]++;
		}
		
		// 为了保证某个元素之前的位置，就都要累加前面元素的个数
		for (int i = 1; i < counts.length; i++) {
			// 当前累加前面元素之和
			counts[i] += counts[i - 1];
		}

		
		// 排序数组，倒序遍历输出元素每次减一
		Integer[] sortd = new Integer[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			sortd[counts[arr[i] - min] - 1] = arr[i];
			counts[arr[i] - min]--;
		}
		
		return sortd;
	}
}
