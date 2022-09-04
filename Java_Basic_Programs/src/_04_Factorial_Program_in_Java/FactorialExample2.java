package _04_Factorial_Program_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Factorial Program using recursion in Java.
 */

public class FactorialExample2 {

	/**
	 * 
	 * @param n
	 * @return
	 */
	static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int fact = 1;
		int number = 4;// It is the number to calculate factorial
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
	}

}
