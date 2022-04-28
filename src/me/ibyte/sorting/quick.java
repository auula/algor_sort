package me.ibyte.sorting;

import java.util.Arrays;

public class Quick {

	public static void main(String[] args) {
		Double[] arr = { 2.1, 2.2, 11.11, 3.4, 111.1, 1.0, 45.3, 5.12, 3.3 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	
	public static <T extends Comparable<T>> void quickSort(T[] arr, int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return;
		}
		int pivot = partition(arr, startIndex, endIndex);
		quickSort(arr, startIndex, pivot - 1);
		quickSort(arr, pivot + 1, endIndex);
	}

	public static <T extends Comparable<T>> int partition(T[] arr, int startIndex, int endIndex) {
		int left = startIndex, right = endIndex;
		int pivot = startIndex;
		while (left != right) {
			while (left < right && (arr[right].compareTo(arr[pivot]) >= 0)) {
				right -= 1;
			}
			while (left < right && (arr[left].compareTo(arr[pivot]) < 0)) {
				left += 1;
			}
			if (left < right) {
				T temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		arr[startIndex] = arr[left];
		arr[left] = arr[pivot];
		return left;
	}

}
