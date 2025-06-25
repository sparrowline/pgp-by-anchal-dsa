package java_8;

public class Lambda_expresion1 {
	public static void main(String[] args) {
		
	}
}

interface MathOperation {
	
	public int oprate(int a,int b);
	
	
}

class SumOperation implements MathOperation{
	
	int c = 0;
	@Override
	public int oprate(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		System.out.println(c);

		return c = a+b;

	}
	
}