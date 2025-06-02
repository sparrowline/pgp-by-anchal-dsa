package week_4;

public class PrintNto1 {
	
	public static void printNto1(int N) {
		helper(1,N);
	}
	
	private static void helper(int start,int end) {
		if(start>end) return;
		
		helper(start+1,end);
		System.out.print(start+" ");
	}
	
	public static void main(String args[]) {
		printNto1(5);
	}
}
