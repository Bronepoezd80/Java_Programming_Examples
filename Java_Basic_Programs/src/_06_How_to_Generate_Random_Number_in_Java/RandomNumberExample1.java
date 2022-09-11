package _06_How_to_Generate_Random_Number_in_Java;

import java.lang.Math;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Using the Math.random() Method.
 */
public class RandomNumberExample1 {

  private static int maxrand = 100;

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(6, "Using the Math.random() Method");

    for (int i = 1; i <= maxrand; ++i) {
      System.out.println(i + ".\tRandom Number:\t" + Math.random());
    }
  }

}
