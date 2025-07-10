package exception.handling.Direct;

public class ThrowDemo {

	public static void main(String[] args) {
		int age = 17;
		
		if(age < 21) {
			// Throwing an exception manually / explicitly
			throw new ArithmeticException("You must be 18 or older to vote.");
			//System.out.println("You are not eligible to vote");
		}else {
			System.out.println("You are eligible to vote");
		}

	}

}
