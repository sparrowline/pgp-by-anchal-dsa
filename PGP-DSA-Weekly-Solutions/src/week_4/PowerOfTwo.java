package week_4;

public class PowerOfTwo {
	class Solution {
		public boolean isPowerOfTwo(int n) {

			// B.F:---------------------------------------
			// while(n>0 && n%2==0){
			// n = n/2;
			// }

			// return n==1;
			// }

			//optimized using bit manipulation:-------------------------
			//return n > 0 && (n & (n - 1)) == 0;
			
			
			
			// Using Recursion :--------------------
	        if(n<=0) return false;
	        if(n==1) return true;

	        return ((n%2==0) && isPowerOfTwo(n/2));
		}
	}
}
