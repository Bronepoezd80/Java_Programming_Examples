package _06_How_to_Generate_Random_Number_in_Java;

import java.lang.Math;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Using the Math.random() Method.
 */
public class RandomNumberExample2 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(6, "Using the Math.random() Method");
    int min = 200;
    int max = 400;
    // Generate random double value from 200 to 400
    System.out.println("Random value of type double between " + min + " to " + max + ":");
    double a = Math.random() * (max - min + 1) + min;
    System.out.println(a);
    // Generate random int value from 200 to 400
    System.out.println("Random value of type int between " + min + " to " + max + ":");
    int b = (int) (Math.random() * (max - min + 1) + min);
    System.out.println(b);
  }

}
