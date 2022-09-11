package _04_Factorial_Program_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Factorial Program using loop in Java.
 */
public class FactorialExample {

  private static int number = 6; // It is the number to calculate factorial

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(4, "Factorial Program using loop in Java");
    int fact = 1;
    for (int i = 1; i <= number; ++i) {
      fact *= i;
    }
    System.out.println("Factorial of " + number + " is: " + fact);
  }

}
