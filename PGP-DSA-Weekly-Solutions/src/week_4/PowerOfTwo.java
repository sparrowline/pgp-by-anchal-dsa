package week_4;

public class PowerOfTwo {
	class Solution {
		public boolean isPowerOfTwo(int n) {

			// B.F;
			// while(n>0 && n%2==0){
			// n = n/2;
			// }

			// return n==1;
			// }

			// optimized using bit manuplation;
			return n > 0 && (n & (n - 1)) == 0;
		}
	}
}
