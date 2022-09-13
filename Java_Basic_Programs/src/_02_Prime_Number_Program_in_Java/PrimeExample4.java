package _02_Prime_Number_Program_in_Java;

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

    int start = General.UserEntry.requestInt("Enter the first number : ");
    int end = General.UserEntry.requestInt("Enter the second number : ");
    General.UserEntry.closeInput();

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
