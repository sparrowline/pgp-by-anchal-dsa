package week_2;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1
public class KthSmallestElement {

	public static int kthSmallest(int[] arr, int k) {
		// Your code here
//
//		for (int i = 0; i < arr.length - 1; i++) {
//
//			for (int j = i; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					// swap for ascending order;
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
//
//		return arr[k - 1]; //as array start from 0;

		mergeSort(arr, 0, arr.length - 1);

		return arr[k - 1];

	}

	private static void mergeSort(int arr[], int low, int high) {

		int mid = (low + high) / 2;
		while (low >= high)
			return;

		mergeSort(arr, low, mid); // sorting for left side of the array;
		mergeSort(arr, mid + 1, high); // sorting for right side of arr;

		merge(arr, low, mid, high);
	}

	private static void merge(int arr[], int low, int mid, int high) {

		List<Integer> list = new ArrayList();

		// define Pointers
		int left = low;
		int right = mid + 1;

		while (left <= mid && right <= high) {
			if (arr[left] < arr[right]) {
				list.add(arr[left]);
				left++;
			} else {
				list.add(arr[right]);
				right++;
			}
		}

		// if elements left on left side

		while (left <= mid) {
			list.add(arr[left]);
			left++;
		}

		while (right <= high) {
			list.add(arr[right]);
			right++;
		}

		for (int i = low; i <= high; i++) {
			arr[i] = (Integer) list.get(i - low);
		}

	}
}
