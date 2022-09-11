package _02_Prime_Number_Program_in_Java;

import java.util.Scanner;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Prime Number Program in Java (Another way).
 */
public class PrimeExample3 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(2, "Prime Number Program in Java (Another way)");

    Scanner s = new Scanner(System.in); // must be closed at the end
    System.out.print("Enter a number : ");
    int n = s.nextInt();
    s.close(); // closed

    if (isPrime(n)) {
      System.out.println(n + " is a prime number");
    } else {
      System.out.println(n + " is not a prime number");
    }
  }

  /**
   * 
   * @param n
   * @return
   */
  private static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); ++i) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
