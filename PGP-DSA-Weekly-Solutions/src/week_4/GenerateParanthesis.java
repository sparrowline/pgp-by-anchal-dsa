package week_4;

import java.util.ArrayList;
import java.util.List;
//https://www.youtube.com/watch?v=fNjY-M_6VpI
public class GenerateParanthesis {
	public List<String> generateParenthesis(int n) {

		// List<String> result = new ArrayList<>();
		// helper("",0,0,n,result);
		// return result;

		// }

		// private static void helper(String current,int openPar,int closePar, int n
		// ,List<String> result){

		// //Base case;
		// if(openPar == n && closePar == n){
		// result.add(current);
		// return;
		// }

		// //recursive Case;
		// if(openPar < n){
		// helper(current+'(',openPar+1,closePar,n,result);
		// }
		// if(openPar >closePar){
		// helper(current+')',openPar,closePar+1,n,result);
		// }

		//Using String builder to avoid object creation; much efficient than string 
		List<String> result = new ArrayList<>();
		StringBuilder current = new StringBuilder(); // mutable
		helper(current, 0, 0, n, result);
		return result;

	}

	private static void helper(StringBuilder current, int openPara, int closePara, int n, List<String> result) {

		// base case;
		if (openPara == n && closePara == n) {
			result.add(current.toString());
			return;
		}

		// add openParanthesis
		if (openPara < n) {
			helper(current.append('('), openPara + 1, closePara, n, result);
			current.deleteCharAt(current.length() - 1);
		}

		// add closeParanthesis
		if (openPara > closePara) {
			helper(current.append(')'), openPara, closePara + 1, n, result);
			current.deleteCharAt(current.length() - 1); // backtrack;
		}

	}

}
