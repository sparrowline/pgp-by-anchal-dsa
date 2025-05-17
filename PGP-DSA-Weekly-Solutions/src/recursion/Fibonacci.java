package recursion;

public class Fibonacci {

	// This method calculates the nth Fibonacci number using recursion.
	public int fib(int n) {

		// 👉 Base Case 1: If n is 0, return 0. (The 0th Fibonacci number is 0)
		if (n == 0) {
			return 0;
		}

		// 👉 Base Case 2: If n is 1, return 1. (The 1st Fibonacci number is 1)
		if (n == 1) {
			return 1;
		}

		// 🔁 Recursive Step:
		// If n is greater than 1, we calculate it by summing the two previous Fibonacci
		// numbers.
		// fib(n) = fib(n - 1) + fib(n - 2)
		int last = fib(n - 1); // Calculates the (n-1)th Fibonacci number
		int secondLast = fib(n - 2); // Calculates the (n-2)th Fibonacci number

		return last + secondLast; // Total gives the nth Fibonacci number

	}
}
