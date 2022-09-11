package _02_Prime_Number_Program_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Prime Number Program using Method in Java.
 */
public class PrimeExample2 {

  /**
   * 
   * @param n
   */
  static void checkPrime(int n) {
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

  /**
   * 
   * @param args
   */
  public static void main(String args[]) {
    General.Description.print(2, "Prime Number Program using Method in Java");

    int[] numbers = { 1, 3, 17, 20, 71, 108 };
    for (int i = 0; i < numbers.length; ++i) {
      checkPrime(numbers[i]);
    }
  }

}
