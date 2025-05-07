package twoPointers;

//https://leetcode.com/problems/reverse-string/
public class ReverseAString {
	// tc of O(n) and sc of O(1) in two pointer approach instead of using stack;

	public void reverseString(char[] s) {
		// as mentioned in place hence cant use stack? will lead n space,
		// mostly we can use two pointer approach to reverse it two pointers by each
		// othere.

		// Using stack;
		// Stack<Character> st = new Stack();
		// for(int i =0 ;i<s.length;i++){
		// st.push(s[i]);
		// }

		// for(int i =0;i<s.length;i++){
		// s[i]= st.pop();
		// }

		int left = 0;
		int right = s.length - 1;

		while (left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}

	}
}
