package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern.
 */
public class RightTrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern");
    // i for rows and j for columns
    // row denotes the number of rows you want to print
    int i, j, row = 6;
    // outer loop for rows
    for (i = 0; i < row; i++) {
      // inner loop for columns
      for (j = 0; j <= i; j++) {
        // prints stars
        System.out.print("* ");
      }
      // throws the cursor in a new line after printing each line
      System.out.println();
    }
  }

}
