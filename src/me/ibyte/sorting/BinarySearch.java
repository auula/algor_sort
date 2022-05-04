package me.ibyte.sorting;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 10, 11, 12, 13, 14, 15 ,15};
		int index = bsearch(arr, 14, 0, arr.length - 1);
		System.out.println(index);
	}

	public static int bsearch(int[] arr, int n, int low, int hight) {

		if (low > hight) {
			return -1;
		}

		int middle = low + (hight - low) / 2;

		if (arr[middle] == n) {
			return middle;
		}

		if (arr[middle] < n) {
			return bsearch(arr, n, middle + 1, hight);
		} else {
			return bsearch(arr, n, low, middle - 1);
		}

	}

}
