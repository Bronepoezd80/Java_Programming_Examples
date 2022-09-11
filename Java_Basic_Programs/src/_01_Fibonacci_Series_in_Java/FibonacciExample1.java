package _01_Fibonacci_Series_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Fibonacci Series in Java without using recursion.
 */
public class FibonacciExample1 {

  public static int count = 20;

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(1, "Fibonacci Series in Java without using recursion");

    for (int i = 0, n1 = 0, n2 = 1; i < count; ++i) {
      System.out.print(n2 + " ");
      n2 += n1;
      n1 = n2 - n1;
    }
    System.out.println();
  }

}
