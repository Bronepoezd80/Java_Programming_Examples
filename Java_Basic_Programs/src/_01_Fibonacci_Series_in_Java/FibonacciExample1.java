package _01_Fibonacci_Series_in_Java;

import _03_Palindrome_Program_in_Java.Description;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Fibonacci Series in Java without using recursion.
 */

public class FibonacciExample1 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    Description.print();
    int n1 = 0, n2 = 1, n3, i, count = 20;
    System.out.print(n1 + " " + n2); // printing 0 and 1

    for (i = 2; i < count; ++i) { // loop starts from 2 because 0 and 1 are already printed
      n3 = n1 + n2;
      System.out.print(" " + n3);
      n1 = n2;
      n2 = n3;
    }

  }

}