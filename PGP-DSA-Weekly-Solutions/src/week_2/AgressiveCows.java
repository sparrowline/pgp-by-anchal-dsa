package week_2;

import java.util.Arrays;

public class AgressiveCows {
	public static int aggressiveCows(int[] stalls, int k) {
	    //     // code here //k = cows;
	    //     Arrays.sort(stalls);
	        
	    //     int low = 1;
	    //     int high = stalls[stalls.length-1]-stalls[0];
	    //     int res = 0;
	        
	    //     while(low<=high){
	    //         int mid = low+(high-low)/2;
	    //         if(canPlaceCows(stalls,k,mid)){
	    //             res = mid;
	    //             low = mid+1; //try for bigger min distance;
	    //         }else{
	    //             high = mid-1; //try for possiible distance;
	    //         }
	    //     }
	    //         return res;
	    // }
	    
	    // //dist == mid element from bs;
	    // private static boolean canPlaceCows(int arr[],int cows , int dist){
	    //      int position = arr[0];
	    //      int count = 1;
	         
	    //      for(int i= 1 ;i<arr.length ;i++){
	    //          if(arr[i]-position >=dist ){
	    //              count++;
	    //              position = arr[i];
	    //          }
	    //          if(count==cows) return true;
	    //      }
	    //      return false;
	    // }
	            Arrays.sort(stalls);
	            //low and high are min and max distance between two cows;
	            int low = 0;
	            int high = stalls[stalls.length-1]-stalls[0];
	            int res = 0;
	            while(low<=high){
	                int mid = low+(high-low)/2;
	                
	                if(canPlaceCows(stalls,k,mid)){
	                    res = mid; // if can place then try for max posible distance can be placed
	                    low = mid+1;
	                }else{
	                    high = mid-1; //if not possible reduce distance;
	                }
	            }
	            return res;
	    }
	    
	    private static boolean canPlaceCows(int arr[],int cows,int dist){
	        //place cow at first position;
	        int position = arr[0];
	        int count = 1;
	        
	        //check in the loop whether we can place cows with provided distance or not;
	        
	        for(int i = 1;i<arr.length;i++){
	            if(arr[i]-position>= dist){
	                count++;
	                //update the position to check from updated position to the next position dist is possible or not;
	                position = arr[i];
	            }
	            if(count == cows) return true;
	        }
	        return false;
	    }
}
