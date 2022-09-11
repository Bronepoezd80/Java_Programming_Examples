package _02_Prime_Number_Program_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Prime Number Program in Java.
 */
public class PrimeExample {

  private static int n = 71; // it is the number to be checked

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(2, "Prime Number Program in Java");

    if (n <= 1) {
      System.out.println(n + " is not prime number");
    } else {
      int flag = 0, m = n / 2;
      for (int i = 2; i <= m; ++i) {
        if (n % i == 0) {
          System.out.println(n + " is not prime number");
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        System.out.println(n + " is prime number");
      }
    }
  }

}
