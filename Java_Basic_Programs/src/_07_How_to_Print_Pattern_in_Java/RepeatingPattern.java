package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Character Pattern: Repeating Alphabet Pattern.
 */
public class RepeatingPattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Character Pattern: Repeating Alphabet Pattern");
    int letter = 65; // ASCII value of capital A is 65
    // inner loop for rwos
    for (int i = 0; i <= 9; i++) {
      // outer loop for columns
      for (int j = 0; j <= i; j++) {
        // prints the character
        System.out.print((char) letter + " ");
      }
      letter++;
      System.out.println();
    }
  }

}
