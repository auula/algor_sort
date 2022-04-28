package me.ibyte.sorting;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		Integer[] arr = { 22, 11, 34, 111, 453, 5, 1 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// 遍历都是次和没有关系，如果是获取下标就要减一了
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j + 1].compareTo(arr[j]) < 0) {
					T temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
