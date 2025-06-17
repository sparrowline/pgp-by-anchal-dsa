package week_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//https://www.youtube.com/watch?v=b7AYbpM5YrE&t=21s striver  explanation 
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

//User function Template for Java for string type data.
class AllPossibleStrings {
 public List<String> AllPossibleStrings(String s) {
     // Code here
     List<String> result = new ArrayList<>();
     int n = s.length();
     int total = 1<<n;
     
     for(int i = 1;i<total;i++){
         StringBuilder subset = new StringBuilder();
         for(int j = 0;j<n;j++){
             if((i & (1<<j))!=0){
                 subset.append(s.charAt(j));
             }
         }
         result.add(subset.toString());
     }
     Collections.sort(result);
     return result;
 }
}
