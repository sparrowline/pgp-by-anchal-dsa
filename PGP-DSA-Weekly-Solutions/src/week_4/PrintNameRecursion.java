package week_4;

public class PrintNameRecursion {

	public static void main(String[] args) {
		
		recursion("Syed Rizwan",5);
		
	}
	
	private static void recursion(String name,int n) {
		if(n<1) return;
		
		System.out.println(name);
		recursion(name, n-1);
	}
}
