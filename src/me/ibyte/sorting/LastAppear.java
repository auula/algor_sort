package me.ibyte.sorting;

public class LastAppear {

	public static void main(String[] args) {
		// 查找到14最后一次出现的位置
		int[] arr = { 10, 11, 12, 13, 14, 14, 14, 15, 16 };
		int index = fastAppear(arr, 14, 0, arr.length - 1); // 6
		System.out.println(index);
	}

	public static int fastAppear(int[] arr, int val, int low, int high) {
		int middle = 0;
		while (low < high) {
			middle = low + (high - low) / 2;
			if (arr[middle] < val) {
				low = middle + 1;
			} else if (arr[middle] > val) {
				high = middle - 1;
			} else {
				// 本来就是最后一个了那就直接返回，如果不是就看后面的元素是否一样，不一样则返回
				if ((middle == arr.length - 1 || arr[middle + 1] != val)) {
					return middle;
				} else {
					// 一样说明前面的范围可以排除掉，继续往后搜索
					low = middle + 1;
				}
			}

		}
		return -1;
	}

}
