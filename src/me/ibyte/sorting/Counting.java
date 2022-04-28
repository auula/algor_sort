package me.ibyte.sorting;

import java.util.Arrays;

public class Counting {

	public static void main(String[] args) {
		Integer[] arr = { 22, 11, 34, 111, 1, 453, 5 };
		countingSort(arr);
		System.out.println(Arrays.toString(arr));
	}

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

		int offset = max - min + 1;
		int[] counts = new int[offset];
		for (int i = 0; i < arr.length; i++) {
			counts[arr[i] - min] += 1;
		}

		for (int i = 1; i < counts.length; i++) {
			// 当前累加前面元素之和
			counts[i] += counts[i - 1];
		}

		Integer[] sortd = new Integer[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			sortd[counts[arr[i] - min]-1] = arr[i];
			counts[arr[i] - min] -= 1;
		}

		return sortd;
	}
}
