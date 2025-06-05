package week_4;

public class ReverseAnArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(" Before Reversed ");
		for(int num :arr) {
			System.out.print(num+" ");
		}
		helper(arr,0,arr.length-1);
		
		System.out.println("\n After Reversed");
		for(int num :arr) {
			System.out.print(num+" ");
		}
	}
	
	private static void helper(int arr[], int start,int end) {
		
		if(start>=end) return;
		
			//swap
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			helper(arr,start+1,end-1);
	}

}
