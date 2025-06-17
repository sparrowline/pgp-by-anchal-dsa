package week_4;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
	public List<List<Integer>> powerSet(int[] nums) {
		// your code goes here

		List<List<Integer>> result = new ArrayList();
		int n = nums.length;
		int total = 1 << n; // 2^n all possible combiantions;

		for (int i = 0; i < total; i++) {
			List<Integer> subset = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) { // is ith bit ON(on means its a subset)
					subset.add(nums[j]);
				}
			}
			result.add(subset);
		}
		return result;
	}
}
