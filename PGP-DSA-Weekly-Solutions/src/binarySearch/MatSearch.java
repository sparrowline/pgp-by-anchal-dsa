package binarySearch;
//https://www.geeksforgeeks.org/problems/search-in-a-matrix17201720/1
public class MatSearch {

//	Search in a Row-Column sorted matrix
	public static boolean matSearch(int mat[][], int x) {
		// your code here
		int m = mat.length; // number of row;
		int n = mat[0].length; // number of columns;

		int i = 0;
		int j = n - 1; // start from top right corner
		
		// carry out the condition till it reaches out of bound
		while (i < m && j >= 0) {
			if (mat[i][j] == x) {
				return true;// found the element;
			} else if (mat[i][j] > x) {
				j--; // move left
			} else if (mat[i][j] < x) {
				i++; // move down ;
			}
		}

		return false;

	}
}
