package week_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
public class FindDuplicatesInArray {

	    public List<Integer> findDuplicates(int[] arr) {
	        
	        HashMap<Integer,Integer> freqMap = new HashMap();
	        
	        //count frequency of elements by adding it in freqmap
	        for(int num : arr){
	            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
	        }
	        
	        //Collect the numbers that apears more than one.
	        
	        ArrayList result = new ArrayList();
	        
	        
	            for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
	                if(entry.getValue()>1){
	                    result.add(entry.getKey());
	                }
	            }
	            return result;
	    }
	
}
