package binarySearch;

public class KthSmallestEleInMatrix {
// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
	public int kthSmallest(int[][] matrix, int k) {
		int count = 0;
		int m = matrix.length; // number of rows in the matrix;
		int n = matrix[0].length; // number of columns in the matrix;

		int low = matrix[0][0];
		int high = matrix[m - 1][n - 1];

		while (low < high) {
			int mid = low + (high - low) / 2;
			// increase the count if other element are smaller than the mid to get kth
			// positioin;
			count = countLessOrEqual(matrix, mid);
			if (count < k) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return low;
	}

	private static int countLessOrEqual(int matrix[][], int target) {
		int m = matrix.length; // number of rows in the matrix;
		int n = matrix[0].length;

		int row = m - 1;
		int col = 0;
		int count = 0;

		while (row >= 0 && col < n) {
			if (matrix[row][col] <= target) {
				count += (row + 1);
				col++; // move right
			} else {
				row--; // move up
			}
		}
		return count;
	}
}