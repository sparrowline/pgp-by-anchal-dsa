package week_2;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
public class SearchInRotatedSortedArray {

	public boolean search(int[] nums, int target) {

		int pivote = index(nums);

		if (target <= nums[pivote] && target >= nums[nums.length - 1]) {
			return findAnElement(nums, nums[pivote], nums.length - 1, target);
		} else {
			return findAnElement(nums, 0, nums[pivote], target);
		}

	}

	private static boolean findAnElement(int nums[], int start, int end, int k) {

		boolean result = false;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] == k) {
				return true;
			} else if (nums[mid] > nums[end]) {
				start = mid + 1;
			} else {
				end = mid - 1;// if both start and end are same (when array contains duplicate)
			}
		}
		return result;
	}

	private static int index(int[] nums) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] < nums[start]) {
				end = mid;
			} else if (nums[mid] > nums[end]) {
				start = mid + 1;
			} else {
				end--;// if both start and end are same (when array contains duplicate)
			}
		}
		return start;// returning the index position of pivote point;
	}
}
