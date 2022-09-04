package _02_Prime_Number_Program_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Prime Number Program in Java (Another way).
 */

import java.util.Scanner;

import _03_Palindrome_Program_in_Java.Description;

public class PrimeExample3 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
    Description.print();
		Scanner s = new Scanner(System.in); // must be closed at the end
		System.out.print("Enter a number : ");
		int n = s.nextInt();
		if (isPrime(n)) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
		s.close(); // closed
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}