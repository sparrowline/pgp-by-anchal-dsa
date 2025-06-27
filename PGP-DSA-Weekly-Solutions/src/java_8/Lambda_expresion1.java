package java_8;

public class Lambda_expresion1 {
	public static void main(String[] args) {
		//without lambda;
		MathOperation sum  = new SumOperation();
		System.err.println(sum.operation(1,9));
		
		//with lambda
		MathOperation minus = ((a,b)->a-b);
		System.err.println(minus.operation(9, 3));
		
		MathOperation multi = (a,b)->a*b;
		System.err.println(multi.operation(8, 6));
	}

	
}

class SumOperation implements MathOperation{

	@Override
	public int operation(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	
}


interface MathOperation{
	int operation(int a,int b);
	
}

	
