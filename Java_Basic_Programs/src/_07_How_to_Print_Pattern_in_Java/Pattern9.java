package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-9.
 */
public class Pattern9 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-9");
    int i, j, rows = 9;
    for (i = 1; i <= rows; i++) {
      for (j = 1; j <= i; j++) {
        if (j % 2 == 0) {
          System.out.print(0);
        } else {
          System.out.print(1);
        }
      }
      System.out.println();
    }
  }

}
