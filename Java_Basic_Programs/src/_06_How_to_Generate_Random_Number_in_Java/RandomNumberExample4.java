package _06_How_to_Generate_Random_Number_in_Java;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Using the ThreadLocalRandom Class.
 */
public class RandomNumberExample4 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(6, "Using the ThreadLocalRandom Class");

    // Print random integer values
    System.out.println("Randomly Generated Integer Values:");
    // Generate random integers between 0 to 999
    System.out.println(ThreadLocalRandom.current().nextInt());
    System.out.println(ThreadLocalRandom.current().nextInt());

    // Print random doubles
    System.out.println("Randomly Generated Double Values:");
    System.out.println(ThreadLocalRandom.current().nextDouble());
    System.out.println(ThreadLocalRandom.current().nextDouble());

    // Print random Booleans
    System.out.println("Randomly Generated Boolean Values:");
    System.out.println(ThreadLocalRandom.current().nextBoolean());
    System.out.println(ThreadLocalRandom.current().nextBoolean());
  }

}
