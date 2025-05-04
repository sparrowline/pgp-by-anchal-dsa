package week_2;
//https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1
public class KthSmallestElement {

	public static int kthSmallest(int[] arr, int k) {
		// Your code here

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					// swap for ascending order;
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		return arr[k - 1]; //as array start from 0;

	}
}
