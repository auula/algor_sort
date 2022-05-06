package me.ibyte.sorting;

public class FirstAppear {

	public static void main(String[] args) {
		// 查找到14第一次出现的位置
		int[] arr = { 10, 11, 12, 13, 14, 14, 14, 15, 16 };
		int index = firstAppear(arr, 14, 0, arr.length - 1); // 4
		System.out.println(index);
	}

	public static int firstAppear(int[] arr, int val, int low, int high) {
		int middle = 0;
		while (low < high) {
			middle = low + (high - low) / 2;
			if (arr[middle] < val) {
				low = middle + 1;
			} else if (arr[middle] > val) {
				high = middle - 1;
			} else {
				// 如果在一个位置是就是头部说明就在头部
				// 如果是在中间某一部分出现那么就看看前面是否重复如果重复就找打了
				if (middle == 0 || arr[middle - 1] != val) {
					return middle;
				} else {
					// 如果上面条件都不满足，说明要找的元素在左半部分，砍掉右边部分
					high = middle - 1;
				}
			}
		}
		return -1;
	}
}
