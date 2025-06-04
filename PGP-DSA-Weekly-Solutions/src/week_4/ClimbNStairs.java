package week_4;

public class ClimbNStairs {

	public static int climbNstairs(int n) {
		if(n<0) return 0;
		if(n<1) return 1;
		
		return climbNstairs(n-1)+climbNstairs(n-2);
	}
	
	public static void main(String[] args) {
        System.out.println(climbNstairs(0)); // Expected: 1 (1 way: no steps)
        System.out.println(climbNstairs(1)); // Expected: 1 (1 way: 1)
        System.out.println(climbNstairs(2)); // Expected: 2 (1+1, 2)
        System.out.println(climbNstairs(3)); // Expected: 3 (1+1+1, 1+2, 2+1)
        System.out.println(climbNstairs(4)); // Expected: 5 (1111, 112, 121, 211, 22)
        System.out.println(climbNstairs(5)); // Expected: 8
        System.out.println(climbNstairs(6)); // Expected: 13
        System.out.println(climbNstairs(-1)); // Expected: 0 (invalid case)
        System.out.println(climbNstairs(-12)); // Expected: 0 (invalid case)

    }
	
}
