package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Alphabet Star Pattern.
 */
public class AlphabetPattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Alphabet Star Pattern");
    
    // Outer for loop for number of lines
    for (int i = 0, n = 8; i <= n; ++i) {
      // Inner for loop for logic execution
      for (int j = 0; j <= n / 2; ++j) {
        // prints two vertical lines
        if ((j == 0 || j == n / 2) && i != 0 ||
            // print first line of alphabet
            i == 0 && j != n / 2 ||
            // prints middle line
            i == n / 2) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

}
