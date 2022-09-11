package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Character Pattern: Triangle Character Pattern.
 */
public class TriangleCharacterPattern {

  public static void main(String[] args) {
    General.Description.print(7, "Character Pattern: Triangle Character Pattern");
    for (int i = 0; i <= 8; i++) {
      int alphabet = 65;
      for (int j = 8; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print((char) (alphabet + k) + " ");
      }
      System.out.println();
    }
  }

}
