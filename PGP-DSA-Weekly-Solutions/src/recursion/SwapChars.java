package recursion;
//⏱️ Time & Space Complexity:
//	•	Time Complexity: O(n)
//	•	Space Complexity: O(n) due to the recursion stack.
//
//🔁 If you’re asked to do it strictly in-place, iterative is better (no stack overhead). But recursion works well and is sometimes asked to check understanding of function calls.

public class SwapChars {
	
	//Using recursion;
	public void reverseString(char s[]) {
		
		reverseStringHelper(s,0,s.length-1);
		
	}
	
	private void reverseStringHelper(char s[],int left,int right) {
		
		//base case condition;
		if(left>=right) return;
		
		//swap the elements;
		
		char temp = s[left];
		s[left] = s[right];
		s[right] = temp;
		
		reverseStringHelper(s,left+1,right-1);
	}
	

	    public static void main(String[] args) {
	        char[] s = { 'h', 'e', 'l', 'l', 'o' };
	        
	        SwapChars sc = new SwapChars();
	        System.out.println(s);
	        sc.reverseString(s);
	        System.out.println(s); // Output: "olleh"
	    }
	}


