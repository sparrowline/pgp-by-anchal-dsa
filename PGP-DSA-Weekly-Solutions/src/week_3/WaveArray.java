package week_3;

public class WaveArray {
//	https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1/?track=amazon-arrays&batchId=192
	public static void convertToWave(int[] arr) {
		// code here
		if (arr.length == 1)
			return;
		for (int i = 0; i < arr.length - 1; i += 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
	}
}
