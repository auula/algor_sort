package me.ibyte.sorting;

import java.util.Arrays;

public class Heap {

	public static void main(String[] args) {
		int[] arr = { 4,10,3,5,1,2 };
		heapify(arr, arr.length, 0);
		System.out.println(Arrays.toString(arr));
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
			int temp = tree[index];
			tree[index] = tree[max];
			tree[max] = temp;
			heapify(tree, len, max);
		}

	}

}
