package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-19.
 */
public class Pattern19 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-19");
    int rows = 9;
    for (int i = 1; i <= rows; i++) {
      int num = i;
      for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num = num + rows - j;
      }
      System.out.println();
    }
  }

}
