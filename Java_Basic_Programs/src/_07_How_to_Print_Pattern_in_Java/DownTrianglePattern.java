package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Down Triangle Pattern.
 */
public class DownTrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Down Triangle Pattern");
    int i, j, k, rows = 9;
    for (i = rows; i >= 1; i--) {
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
