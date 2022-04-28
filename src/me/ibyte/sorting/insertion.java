package me.ibyte.sorting;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		Integer[] arr = { 22, 11, 34, 111, 1, 453, 5 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static <T extends Comparable<T>> void insertionSort(T[] arr) {
		for (int i = 1; i < arr.length ; i++) {
			int previous = i -1;
			T current = arr[i];
			while (previous >= 0) {
				if (current.compareTo(arr[previous]) < 0) {
					arr[previous + 1] = arr[previous];
				} else {
					break;
				}
				previous -= 1;
			}
			T temp = arr[previous + 1];
			arr[previous + 1] = current;
			current = temp;
		}
	}
}
