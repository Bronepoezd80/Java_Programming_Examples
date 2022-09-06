package _06_How_to_Generate_Random_Number_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Random Number Generation in Java 8.
 */
import java.util.Random;

public class RandomNumberExample5 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(6, "Random Number Generation in Java 8");
    randomInts(5);
    randomInts(9, 50, 90);
    // getStreamOfRandomInts(30, 50);
  }

  // method that generates a stream of integers having size 5
  /**
   * 
   * @param num
   */
  public static void randomInts(int num) {
    Random random = new Random();
    random.ints(num).forEach(System.out::println);
  }

  // method that generates a stream of 9 integers between 50 to 90
  /**
   * 
   * @param num
   * @param origin
   * @param bound
   */
  public static void randomInts(int num, int origin, int bound) {
    Random random1 = new Random();
    random1.ints(num, origin, bound).forEach(System.out::println);
  }

}
