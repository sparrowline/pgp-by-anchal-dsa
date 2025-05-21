package week_3;
// This is spacial case of prefixSum problem where you need to calculate leftSum and rightSum as it dosnt ask for range;
public class EquilibriumPoint {
	
	    // Function to find equilibrium point in the array.
	    public static int findEquilibrium(int arr[]) {
	        // code here
	        
	    //     int n = arr.length;
	        
	    //     for(int i = 0;i<n;i++){
	            
	    //         int leftSum = 0;
	    //         int rightSum = 0;
	            
	    //         //calculate the left sum ;
	    //         for(int j=0;j<i;j++){
	    //             leftSum +=arr[j];
	    //         }
	            
	    //         //calculate the right sum;
	    //         for(int j = i+1;j<n;j++){
	    //             rightSum +=arr[j];
	    //         }
	            
	    //         //check lfs and rs
	    //         if(rightSum == leftSum ){
	    //             return i;
	    //         }
	    //     }
	    //     return -1;
	    // } 
	    //The above code will Give TLE Hence need to use optimize version i.e prefixSum
	    	
	            int totalSum = 0;
	            for(int num :arr){
	                totalSum +=num;
	            }
	            
	            int leftSum =0;
	            for(int i =0;i<arr.length;i++){
	                int rightSum = totalSum-leftSum-arr[i];
	                
	                if(leftSum == rightSum){
	                    return i;
	                }
	                leftSum +=arr[i];
	            }
	            return -1;
	            
	    }
	}


