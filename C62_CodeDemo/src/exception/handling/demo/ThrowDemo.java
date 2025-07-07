package exception.handling.demo;

public class ThrowDemo {

	public static void main(String[] args) {
		int age = 15;
		
		if(age < 18) {
			// Throwing an exception manually / explicitly
			throw new ArithmeticException("You must be 18 or older to vote.");
			//System.out.println("You are not eligible to vote");
		}else {
			System.out.println("You are eligible to vote");
		}

	}

}
