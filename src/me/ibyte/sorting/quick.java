package me.ibyte.sorting;

import java.util.Arrays;

public class quick {

	public static void main(String[] args) {
		Integer[] arr = { 2, 22, 11, 34, 111, 1, 453, 5, 3 };
		QuickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static <T extends Comparable<T>> void QuickSort(T[] arr, int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return;
		}
		int pivot = partition(arr, startIndex, endIndex);
		QuickSort(arr, startIndex, pivot - 1);
		QuickSort(arr, pivot + 1, endIndex);
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
