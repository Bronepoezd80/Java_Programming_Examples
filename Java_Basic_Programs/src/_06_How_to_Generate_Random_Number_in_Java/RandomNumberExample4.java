package _06_How_to_Generate_Random_Number_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Using the ThreadLocalRandom Class.
 */
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberExample4 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(6);
    // Generate random integers between 0 to 999
    int a = ThreadLocalRandom.current().nextInt();
    int b = ThreadLocalRandom.current().nextInt();
    // Print random integer values
    System.out.println("Randomly Generated Integer Values:");
    System.out.println(a);
    System.out.println(b);
    // Generate Random double values
    double c = ThreadLocalRandom.current().nextDouble();
    double d = ThreadLocalRandom.current().nextDouble();
    // Print random doubles
    System.out.println("Randomly Generated Double Values:");
    System.out.println(c);
    System.out.println(d);
    // Generate random boolean values
    boolean e = ThreadLocalRandom.current().nextBoolean();
    boolean f = ThreadLocalRandom.current().nextBoolean();
    // Print random Booleans
    System.out.println("Randomly Generated Boolean Values:");
    System.out.println(e);
    System.out.println(f);
  }

}
