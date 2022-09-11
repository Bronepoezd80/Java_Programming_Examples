package _06_How_to_Generate_Random_Number_in_Java;

import java.lang.Math;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Using the Math.random() Method.
 */
public class RandomNumberExample2 {

  private static int min = 200, max = 400;

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(6, "Using the Math.random() Method");

    // Generate random double value from 200 to 400
    System.out.println("Random value of type double between " + min + " to " + max + ":");
    System.out.println(calculateRandom(Math.random(), min, max));

    // Generate random int value from 200 to 400
    System.out.println("Random value of type int between " + min + " to " + max + ":");
    System.out.println((int) calculateRandom(Math.random(), min, max));
  }

  /**
   * 
   * @param random
   * @param minVal
   * @param maxVal
   * @return
   */
  private static double calculateRandom(double random, int minVal, int maxVal) {
    return (double) (Math.random() * (maxVal - minVal + 1) + minVal);
  }

}
