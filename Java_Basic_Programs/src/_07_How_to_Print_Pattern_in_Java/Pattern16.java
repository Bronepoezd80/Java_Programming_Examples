package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-16.
 */
public class Pattern16 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-16");
    int i, j, rows = 9;
    // Prints upper half pattern
    for (i = rows; i >= 1; i--) {
      for (j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    // Prints lower half pattern
    for (i = 2; i <= rows; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

}
