package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-12.
 */
public class Pattern12 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-12");
    int rows = 9;
    for (int i = 1; i <= rows; i++) {
      for (int j = rows; j >= i; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

}
