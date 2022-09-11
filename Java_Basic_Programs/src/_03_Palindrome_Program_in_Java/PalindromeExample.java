package _03_Palindrome_Program_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Palindrome Program in Java.
 */
public class PalindromeExample {

  private static int n = 45754; // It is the number variable to be checked for palindrome

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(3, "Palindrome Program in Java");

    int sum = 0, temp = n;
    while (n > 0) {
      sum = (sum * 10) + (n % 10);
      n /= 10;
    }
    if (temp == sum) {
      System.out.println(temp + " - palindrome number");
    } else {
      System.out.println(temp + " - not palindrome number");
    }
  }

}
