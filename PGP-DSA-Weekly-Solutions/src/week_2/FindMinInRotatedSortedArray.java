package week_2;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMinInRotatedSortedArray {

	public int findMin(int[] nums) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] < nums[start]) {
				end = mid;
			} else if (nums[mid] > nums[end]) {
				start = mid + 1;
			} else {
				// if bothe start and end are same reduce the condition.
				end--;
			}
		}
		return nums[start];
	}

}
