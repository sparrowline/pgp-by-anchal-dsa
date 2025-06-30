package week_4;

import java.util.ArrayList;
import java.util.List;

public class Permutation46 {

	// https://www.youtube.com/watch?v=H232aocj7bQ
	// //Approach:
	// 1.iterate over each character.
	// 2.for each char pick first char
	// 3.go back,
	// 4.try picking the next;

	public List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		int n = nums.length;
		solve(result, temp, nums);
		return result;
	}

	private void solve(List<List<Integer>> result, List<Integer> temp, int[] nums) {

		// if we match the length we got the permutation;
		if (temp.size() == nums.length) {
			result.add(new ArrayList(temp));
		}

		for (int num : nums) {
			// skip if duplicate elements found;
			if (temp.contains(num))
				continue;

			// add new element;
			temp.add(num);
			// go back to try other elements.
			solve(result, temp, nums);

			temp.remove(temp.size() - 1);
		}
	}
}
