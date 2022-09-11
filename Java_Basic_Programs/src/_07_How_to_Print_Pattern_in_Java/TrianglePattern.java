package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Triangle Star Pattern.
 */
public class TrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Triangle Star Pattern");
    int i, j, k, rows = 9;
    for (i = 1; i <= rows; i++) {
      for (j = i; j < rows; j++) {
        System.out.print(" ");
      }
      for (k = 1; k <= (2 * i - 1); k++) {
        if (k == 1 || i == rows || k == (2 * i - 1)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }

}
