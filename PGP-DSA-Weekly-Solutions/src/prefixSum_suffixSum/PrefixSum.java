package prefixSum_suffixSum;

public class PrefixSum {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10 };
		int n = arr.length;

		// Step 1: Prefix sum array banate hain
		int[] prefix = new int[n];
		prefix[0] = arr[0]; // pehla element seedha copy

		// Har index par us tak ka total sum store karte hain
		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}

		// Step 2: Ab hum kisi bhi range ka sum nikaal sakte hain
		// Example: index 1 se 3 tak ka sum
		int left = 1;
		int right = 3;

		int rangeSum;
		if (left == 0) {
			rangeSum = prefix[right];
		} else {
			rangeSum = prefix[right] - prefix[left - 1];
		}

		System.out.println("Index " + left + " se " + right + " tak ka sum: " + rangeSum);
	}
}
