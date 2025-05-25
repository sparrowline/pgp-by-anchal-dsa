package week_2;

public class MaxSubarraySizeLessThanK {
	    // Function to check if all subarrays of size 'size' have sum < k
	    private static boolean isValid(int[] arr, int k, int size) {
	      return false;
	    }

	    // Main function to find the maximum subarray size with all sums < k
	    public static int maxSubarraySize(int[] arr, int k) {
	        int low = 1;
	        int high = arr.length;
	        int result = 0;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (isValid(arr, k, mid)) {
	                result = mid;
	                low = mid + 1; // Try larger size
	            } else {
	                high = mid - 1;
	            }
	        }

	        return result;
	    }

	    // Automated test cases
	    public static void runTests() {
	        int[][] testArrays = {
	            {1, 2, 3, 4},                   // All valid for size 1, 2; size 3 fails (sum = 9)
	            {5, 1, 3, 5, 10, 7, 4, 9, 2},   // Max subarray size where all subarrays have sum < 15
	            {1, 1, 1, 1},                   // All subarrays of any size valid if k is large
	            {10, 20, 30},                   // Only size 1 works if k = 25
	            {2, 2, 2, 2, 2}                 // Can test edge size cases with repeated elements
	        };

	        int[] ks = {8, 15, 10, 25, 5};
	        int[] expected = {2, 3, 4, 1, 2};

	        for (int i = 0; i < testArrays.length; i++) {
	            int result = maxSubarraySize(testArrays[i], ks[i]);
	            System.out.println("Test " + (i + 1) + ": Expected = " + expected[i] + ", Got = " + result);
	            assert result == expected[i] : "Test " + (i + 1) + " failed!";
	        }

	        System.out.println("\n✅ All test cases passed!");
	    }

	    public static void main(String[] args) {
	        runTests();
	    }
	}

