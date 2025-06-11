package week_4;
//leetcode 216;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
	

    //Approach:
    // 1.defining variables
    // 2.calling helper;
    // 3.prepare helper
    //     1.helper
    //                   1. base case sum==k size==k if true?
    //                   2.invalid cases .
    //                   3.backtrack for correct elements/sum;

	    public List<List<Integer>> combinationSum3(int k, int n) {
	        List<List<Integer>> result = new ArrayList();
	        List<Integer> list = new ArrayList<>();
	        helper(1,0,n,list,result,k);
	        return result;
	    }

	    private void helper(int index,int sum,int target,List<Integer> list,List<List<Integer>> result,int k){
	        //Base Case: Valid Combinations;

	        if(sum==target && list.size()==k){
	            result.add(new ArrayList(list));
	            return;
	        }
	        //invalid size or sum;
	        if(sum>target || list.size()>k) return;

	        for(int i =index;i<=9;i++){
	            list.add(i); //choose;
	            helper(i+1,sum+i,target,list,result,k);//Explore;
	            list.remove(list.size()-1);  //Backtract;
	            
	        }
	    }


	
}
