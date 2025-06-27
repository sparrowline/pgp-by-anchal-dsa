package java_8;

import java.util.function.Predicate;

//Predicate is a functional interface (boolean valued function) --> checks the condition;
public class PredicatePractice {
	
	public static void main(String[] args) {
		Predicate<Integer> isEven = x->(x%2)==0;
		System.out.println("is Provided number is even : "+isEven.test(8));
		
		
		//with string
		Predicate<String> isWordStartsWithA = x->x.toLowerCase().startsWith("a");
		System.out.println("is word start with A : "+isWordStartsWithA.test("Arafat"));
		
		Predicate<String> isWordEndsWithT = x->x.toLowerCase().endsWith("t");
		System.out.println("is word end with t : "+ isWordEndsWithT.test("Arafat"));
		
		//combining two predicates
		Predicate<String> combine = isWordStartsWithA.and(isWordEndsWithT);
		System.out.println("is both conditions true? :" +combine.test("Arafat"));
		
		
	
	}
	

}
