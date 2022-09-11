package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Character Pattern: K-shape Alphabet Pattern.
 */
public class KshapePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Character Pattern: K-shape Alphabet Pattern");
    for (int i = 8; i >= 0; i--) {
      int alphabet = 65;
      for (int j = 0; j <= i; j++) {
        System.out.print((char) (alphabet + j) + " ");
      }
      System.out.println();
    }
    for (int i = 0; i <= 8; i++) {
      int alphabet = 65;
      for (int j = 0; j <= i; j++) {
        System.out.print((char) (alphabet + j) + " ");
      }
      System.out.println();
    }
  }

}
