package java_8;

import java.util.function.Function;

//Function is a functional interface introduced in java 8 which takes input and perform operations on it.

public class FunctionPractice {
	
	public static void main(String[] args) {
		Function<Integer, Integer> doubleIt = x -> 2*x;
		System.out.println("Double of provided value is : "+doubleIt.apply(30));
		
		Function<Integer,Integer> tripleIt = x -> 3*x;
		System.out.println("triple of provided value is : "+tripleIt.apply(40));
		
		
		//and : combine two operations using and;
		System.out.println(doubleIt.andThen(tripleIt).apply(20));
		
		//compose: is reverse of andThen means it will first perform second method operation and then first operation
		System.out.println(doubleIt.compose(tripleIt).apply(20));
		
		System.out.println(doubleIt.apply(100));
		
		//identity : static method present in Function interface to give output which is provided;
		Function<Integer,Integer> identity =  Function.identity();
		Integer res2 = identity.apply(8);
		System.out.println(res2);
	}
	
	
	

}
