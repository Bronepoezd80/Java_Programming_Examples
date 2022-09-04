package _03_Palindrome_Program_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Palindrome Program in Java.
 */
public class PalindromeExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int r, sum = 0, temp;
		int n = 454; // It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println(temp + " - palindrome number");
		else
			System.out.println(temp + " - not palindrome number");
	}

}
