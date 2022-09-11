package _02_Prime_Number_Program_in_Java;

import java.util.Scanner;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Find prime numbers between two numbers.
 */
public class PrimeExample4 {

  private static int colmax = 4;

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(2, "Find prime numbers between two numbers");

    Scanner s = new Scanner(System.in); // must be closed at the end
    System.out.print("Enter the first number : ");
    int start = s.nextInt();
    System.out.print("Enter the second number : ");
    int end = s.nextInt();
    s.close(); // closed

    System.out.println("List of prime numbers between " + start + " and " + end);
    for (int i = start, col = 0; i <= end; i++) {
      if (isPrime(i)) {
        if (col == colmax) {
          System.out.println();
          col = 0;
        }
        col++;
        System.out.print(i + "\t");
      }
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
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
