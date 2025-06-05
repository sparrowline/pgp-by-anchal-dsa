package week_4;

public class SummationOfN {
	public static void main(String[] args) {
		System.out.print(recursion(5));
	}
	private static int recursion(int end) {
		
		if(end<1) return end;
		 
		return end+recursion(end-1);
	}

}
