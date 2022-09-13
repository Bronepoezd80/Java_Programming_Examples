package _04_Factorial_Program_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Factorial Program using recursion in Java.
 */
public class FactorialExample2 {

  private static int number = 4; // It is the number to calculate factorial

  /**
   * 
   * @param n
   * @return
   */
  private static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return (n * factorial(n - 1));
    }
  }

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(4, "Factorial Program using recursion in Java");
    int fact = 1;
    fact = factorial(number);
    System.out.println("Factorial of " + number + " is: " + fact);
  }

}
