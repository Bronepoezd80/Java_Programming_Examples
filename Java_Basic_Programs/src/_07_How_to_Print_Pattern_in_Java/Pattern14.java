package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-14.
 */
public class Pattern14 {

  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-14");
    int rows = 7, i, j;
    for (i = rows; i >= 1; i--) {
      for (j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

}
