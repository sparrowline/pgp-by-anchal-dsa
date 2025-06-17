package week_4;
//https://leetcode.com/problems/powx-n/
public class MyPow {

	// Approach-->
	// 1. explain thougth process
	// 2. be ready to optimize.
	// 3.spott patterns insted of memorising.
	// 4.prepare based on company requirement (theire most fav topics.);
	public double myPow(double x, int n) {
		double ans = 1.0;
		long N = n;
		if (N < 0)
			N = -1 * N;
		while (N > 0) {
			if (N % 2 == 1) {
				ans = ans * x;
				N = N - 1;

			} else {
				x = x * x;
				N = N / 2;

			}
		}
		if (n < 0)
			ans = (double) (1.0) / (double) ans;
		return ans;

	}
}
