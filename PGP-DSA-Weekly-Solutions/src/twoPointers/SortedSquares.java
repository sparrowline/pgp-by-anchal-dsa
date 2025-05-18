package twoPointers;
//https://leetcode.com/problems/squares-of-a-sorted-array/
public class SortedSquares {
//Approach: as question says we have to store square of numbers of sorted array in sorted manner,
	//1.So the highest numbers which can found in the array are at extream positions if we ignore the sign (Math.abs())
	//2.Use Two pointer technique to compare the largest element (neglecting sign) and store it in the end of an array.
	//3.Follow this and your array is full of squares in sorted manner.
	public int[] sortedSquares(int[] nums) {
		// Using two pointer technique;

		int l = 0;
		int n = nums.length;
		int r = nums.length - 1;
		//creating res array to store the result;
		int res[] = new int[nums.length];

		
		for (int i = n - 1; i >= 0; i--) {
			
			if (Math.abs(nums[l]) > Math.abs(nums[r])) {
				res[i] = nums[l] * nums[l];
				l++;
			} else {
				res[i] = nums[r] * nums[r];
				r--;
			}
		}
		return res;
	}
}
