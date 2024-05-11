package oops.anonymous;

public class Armstrong {
	
	void calculate(int n) {
		int originalNumber = n;
		int result = 0;
		
		// Calculate the sum of cubes of digits
		while (n != 0) {
			int digit = n % 10;
			result += digit * digit * digit; // Cube of digit
			n /= 10;
		}
		
		// Check if the result equals the original number
		if (result == originalNumber) {
			System.out.println("It is an Armstrong number");
		} else {
			System.out.println("Not an Armstrong number");
		}
	}
}

