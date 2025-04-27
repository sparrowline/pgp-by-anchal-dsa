package week_2;
//https://leetcode.com/problems/find-peak-element/
public class FindPeakElement {

	public int findPeakElement(int[] nums) {
		// int start = 0;
		// int end = nums.length-1;
		// if(nums.length==1){
		// return 0;
		// }

		// while(start<end){

		// int mid = start+(end -start)/2;

		// //to prevent indexOutOfboundExcp
		// if(mid>0 && mid<end){
		// if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
		// return mid;
		// }else if(nums[mid-1]>nums[mid]){
		// end = mid-1;
		// }else {
		// start = mid+1;
		// }
		// }else if(mid==0){
		// if (nums.length==1) return 0;
		// return (nums[0]>nums[1]) ? 0 : 1;
		// }else if(mid==nums.length-1){
		// return (nums[end]>nums[end-1])? end : end-1;
		// }
		int n = nums.length;

		// Edge case: only one element
		if (n == 1)
			return 0;

		int start = 0;
		int end = n - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;

			// If current mid is greater than next → potential peak to the left
			if (nums[mid] > nums[mid + 1]) {
				end = mid; // include mid, because it might be the peak
			} else {
				start = mid + 1; // peak lies on the right
			}
		}

		// start == end → peak index
		return start;
	}

}
