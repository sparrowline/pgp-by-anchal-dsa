package week_2;
//https://leetcode.com/problems/ugly-number-iii/
//here Defination of ugly number is somewhat different
public class UglyNumber3 {

	//brute force
	public int nthUglyNumber(int n, int a, int b, int c) {
//        int num =1;
//        int count=0;
//
//        while(true){
//            if(num%a==0 || num % b == 0 || num%c == 0){
//                count++;
//            }
//            if(count==n){
//            return num;
//        }
//        num++;
//        }
//    }
	
	//optimal using BinarySearch and maths;
	
	        long low =1;
	        long high = 20000000000L;
	        int result = 0;

	        while(low<=high){
	            long mid = low+(high-low)/2;
	            long count = countUgly(mid,a,b,c);

	            if(count>=n){
	                result = (int)mid;
	                high = mid-1;
	            }else{
	                low = mid+1;
	            }
	        }

	    return result;
	    }

	    // Counts how many numbers ≤ num are divisible by a, b, or c
	    private static long countUgly(long num,long a, long b, long c){
	        
	        long ab = lcm(a,b);
	        long bc = lcm(b,c);
	        long ac = lcm(a,c);
	        long abc = lcm(ab,c);
	        
	        //inclusion exclusion principle;
	        return (num/a)+(num/b)+(num/c)-(num/ab)-(num/bc)-(num/ac)+(num/abc);

	    }

	     // Helper to compute LCM
	    private static long lcm(long x,long y){
	        return (x*y)/gcd(x,y);
	    }

	         // Helper to compute GCD
	    private static long gcd(long a, long b){
	        if(b==0) return a;
	        return gcd(b,a%b);
	    }
	
	
	
	
}
