package me.ibyte.sorting;

import java.util.Arrays;

public class bubble {

	public static void main(String[] args) {
		Integer[] arr = { 22, 11, 34, 111, 453, 5 };
		BubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static <T extends Comparable<T>> void BubbleSort(T[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
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
