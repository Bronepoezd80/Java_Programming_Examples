package _06_How_to_Generate_Random_Number_in_Java;

import java.util.Random;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Using the Random Class.
 */
public class RandomNumberExample3 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(6, "Using the Random Class");

    // creating an object of Random class
    Random random = new Random();

    // Prints random integer values
    System.out.println("Randomly Generated Integers Values");
    // Generates random integers 0 to 49
    System.out.println(random.nextInt(50));
    // Generates random integers 0 to 999
    System.out.println(random.nextInt(1000));

    // Prints random double values
    System.out.println("Randomly Generated Double Values");
    System.out.println(random.nextDouble());
    System.out.println(random.nextDouble());

    // Prints random float values
    System.out.println("Randomly Generated Float Values");
    System.out.println(random.nextFloat());
    System.out.println(random.nextFloat());

    // Prints random long values
    System.out.println("Randomly Generated Long Values");
    System.out.println(random.nextLong());
    System.out.println(random.nextLong());

    // Prints random boolean values
    System.out.println("Randomly Generated Boolean Values");
    System.out.println(random.nextBoolean());
    System.out.println(random.nextBoolean());
  }
}
