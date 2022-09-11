package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Character Pattern: Right Triangle Alphabetic Pattern.
 */
public class RightAlphabaticPattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Character Pattern: Right Triangle Alphabetic Pattern");
    int alphabet = 65; // ASCII value of capital A is 65
    // inner loop for rows
    for (int i = 0; i <= 8; i++) {
      // outer loop for columns
      for (int j = 0; j <= i; j++) {
        // adds the value of j in the ASCII value of A and prints the corresponding
        // alphabet
        System.out.print((char) (alphabet + j) + " ");
      }
      System.out.println();
    }
  }

}
