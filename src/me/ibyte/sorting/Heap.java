package me.ibyte.sorting;

import java.util.Arrays;

public class Heap {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 1, 10, 4 };
		Sort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	
	public static  void Sort(int[] numbers,int len) {
		build(numbers, len);
		for (int i = len - 1; i >= 0; i--) {
			swap(numbers, i, 0);
			heapify(numbers, i, 0);
		}
	}
	
	// 调整堆的函数
	private static void heapify(int[] tree, int len, int index) {

		if (index >= len) {
			return;
		}

		int max = index;
		int left = index * 2 + 1;
		int right = index * 2 + 2;

		if (left < len && tree[left] > tree[max]) {
			max = left;
		}
		if (right < len && tree[right] > tree[max]) {
			max = right;
		}

		if (max != index) {
			swap(tree,max,index);
			heapify(tree, len, max);
		}

	}

	public static void build(int[] tree, int len) {
		int parentIndex = (len - 1) / 2;
		while (parentIndex >= 0) {
			heapify(tree, len, parentIndex);
			parentIndex -= 1;
		}
	}
	
	
	private static void swap(int[] tree,int i,int j) {
		int temp = tree[i];
		tree[i] = tree[j];
		tree[j] = temp;
	}

}
