package week_2;

//https://leetcode.com/problems/search-insert-position/description/
public class SearchInsert {

	public int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		
		while (low <= high) {
			
			int mid = low + (high - low) / 2;

			if (nums[mid] == target) {
				return mid; // Target found
			} else if (nums[mid] < target) {
				low = mid + 1; // Search right half
			} else {
				high = mid - 1; // Search left half
			}
		}

		// Target not found, return insertion index
		return low;
	}

}
