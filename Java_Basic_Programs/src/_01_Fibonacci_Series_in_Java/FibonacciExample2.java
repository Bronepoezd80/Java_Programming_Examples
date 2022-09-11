package _01_Fibonacci_Series_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Fibonacci Series using recursion in Java.
 */
public class FibonacciExample2 {

  private static int n1 = 0, n2 = 1, count = 20;

  /**
   * 
   * @param count
   */
  static void printFibonacci(int count) {
    if (count >= 0) {
      System.out.print(" " + n2);
      n2 += n1;
      n1 = n2 - n1;
      printFibonacci(count - 1);
    }
  }

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(1, "Fibonacci Series using recursion in Java");

    printFibonacci(count - 1);
  }

}
