package _01_Fibonacci_Series_in_Java;

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
    General.Description.print(1, "Fibonacci Series in Java without using recursion");
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
