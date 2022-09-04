package _01_Fibonacci_Series_in_Java;

import _03_Palindrome_Program_in_Java.Description;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Fibonacci Series using recursion in Java.
 */

public class FibonacciExample2 {

  static int n1 = 0, n2 = 1, n3 = 0;

  /**
   * 
   * @param count
   */
  static void printFibonacci(int count) {
    if (count > 0) {
      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;
      System.out.print(" " + n3);
      printFibonacci(count - 1);
    }
  }

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    Description.print();
    int count = 20;
    System.out.print(n1 + " " + n2); // printing 0 and 1
    printFibonacci(count - 2); // n-2 because 2 numbers are already printed
  }

}
