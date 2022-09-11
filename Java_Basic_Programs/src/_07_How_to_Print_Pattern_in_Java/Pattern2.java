package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-2.
 */
public class Pattern2 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-2");
    int i, j, k = 1;
    // inner loop
    for (i = 1; i <= 7; i++) {
      // outer loop
      for (j = 1; j < i + 1; j++) {
        // prints the value of k
        System.out.print(k++ + " ");
      }
      // throws the cursor at the next line
      System.out.println();
    }

  }

}
