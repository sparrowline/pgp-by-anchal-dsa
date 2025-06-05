package week_4;

public class PalindromString {
	public static void main(String[] args) {
		String str = "MADAM";
		System.out.print(isPalindrome(str,0));
	}
	
	private static boolean isPalindrome(String str,int index) {
		int n = str.length();
		if(index>=n/2) return true;
		
		if(str.charAt(index)!=str.charAt(n-1-index)) return false;
		
		return isPalindrome(str,index+1);
		
	}

}
