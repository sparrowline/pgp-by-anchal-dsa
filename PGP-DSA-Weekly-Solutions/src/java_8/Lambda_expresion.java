package java_8;

import week_4.MyPow;

//Lambda expresion is just an implementation of functional interface;
//Java 8 :--> minimal code ,functional programing;
//java 8 :-->lambda expresion, Stream,Date and Time api.
public class Lambda_expresion {
//
	public static void main(String[] args) {

		Thread thread = new Thread(new Myclass());
		thread.start();

		// short hand method using lambda which is direct implementation of functional
		// interface hence no need of boiler plate code and writing excessive classes
		Thread thread1 = new Thread(() -> System.err.println("Hello from java 8"));
		thread1.start();

	}
}


class Myclass implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello from runnable java 4 ");

	}

}
