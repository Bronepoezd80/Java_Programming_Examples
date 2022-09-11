package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-15.
 */
public class Pattern15 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-15");
    int i, j, rows = 9;
    for (i = 1; i <= rows; i++) {
      // Prints first half of the row
      for (j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      // Prints second half of the row
      for (j = i - 1; j >= 1; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

}
