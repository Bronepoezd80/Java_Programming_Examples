package _04_Factorial_Program_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Factorial Program using loop in Java.
 */
public class FactorialExample {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(4, "Factorial Program using loop in Java");
    int i, fact = 1;
    int number = 5; // It is the number to calculate factorial
    for (i = 1; i <= number; i++) {
      fact = fact * i;
    }
    System.out.println("Factorial of " + number + " is: " + fact);
  }

}
