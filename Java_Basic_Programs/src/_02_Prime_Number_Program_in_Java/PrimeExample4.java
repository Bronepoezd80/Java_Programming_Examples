package _02_Prime_Number_Program_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Find prime numbers between two numbers.
 */

import java.util.Scanner;

import _03_Palindrome_Program_in_Java.Description;

public class PrimeExample4 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    Description.print();
    Scanner s = new Scanner(System.in); // must be closed at the end
    System.out.print("Enter the first number : ");
    int start = s.nextInt();
    System.out.print("Enter the second number : ");
    int end = s.nextInt();
    System.out.println("List of prime numbers between " + start + " and " + end);
    for (int i = start; i <= end; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
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
