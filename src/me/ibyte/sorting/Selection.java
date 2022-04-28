package me.ibyte.sorting;

import java.util.Arrays;

public class Selection {

	public static void main(String[] args) {
		Integer[] arr = { 22, 11, 34, 111,1, 453, 5 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	
	public static <T extends Comparable<T>> void selectionSort(T[] arr){
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[min]) < 0) {
					min = j;
				}
			}
			T temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}
