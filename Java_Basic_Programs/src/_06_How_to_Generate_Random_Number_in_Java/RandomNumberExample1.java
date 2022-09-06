package _06_How_to_Generate_Random_Number_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Using the Math.random() Method.
 */
import java.lang.Math;

public class RandomNumberExample1 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(6, "Using the Math.random() Method");
    System.out.println("1st Random Number: " + Math.random());
    System.out.println("2nd Random Number: " + Math.random());
    System.out.println("3rd Random Number: " + Math.random());
    System.out.println("4th Random Number: " + Math.random());
  }

}
