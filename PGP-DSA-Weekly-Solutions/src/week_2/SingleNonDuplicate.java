package week_2;

//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleNonDuplicate {
	public int singleNonDuplicate(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;

			// Ensure mid is even
			if (mid % 2 == 1) {
				mid--;
			}

			if (nums[mid] == nums[mid + 1]) {
				// Single element lies on the right half
				start = mid + 2;
			} else {
				// Single element lies on the left half including mid
				end = mid;
			}
		}
		// start will point to the single element
		return nums[start];
	}
}
