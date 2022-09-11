package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-20.
 */
public class Pattern20 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-20");
    int i, j, k, rows = 9;
    for (i = 1; i < rows + 1; i++) {
      for (j = i; j < rows + 1; j++) {
        System.out.print(j + " ");
      }
      for (k = 1; k < i; k++) {
        System.out.print(k + " ");
      }
      System.out.println();
    }
  }

}
