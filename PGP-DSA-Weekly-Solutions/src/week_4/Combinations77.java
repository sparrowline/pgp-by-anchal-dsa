package week_4;

import java.util.ArrayList;
import java.util.List;

public class Combinations77 {
	    // https://www.youtube.com/watch?v=QQ9Tn2i269I
	    public List<List<Integer>> combine(int n, int k) {
	        List<List<Integer>> result = new ArrayList<>();
	        List<Integer> temp = new ArrayList<>();
	        backtrack(1,n,k,result,temp);
	        return result;
	        
	    }

	    private void backtrack(int start,int n,int k,List<List<Integer>> result,List<Integer> temp){

	        if(k==0){
	            result.add(new ArrayList<>(temp));
	            return;
	        }
	        if(start>n) return;

	        
	        temp.add(start);
	        backtrack(start+1,n,k-1,result,temp);


	        temp.remove(temp.size()-1);
	        backtrack(start+1,n,k,result,temp);
	    }
	}

