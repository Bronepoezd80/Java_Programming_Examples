package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Downward Triangle Star Pattern.
 */
public class DownwardTrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Downward Triangle Star Pattern");
    int rows = 7;
    // inner loop
    for (int i = rows - 1; i >= 0; i--) {
      // outer loop
      for (int j = 0; j <= i; j++) {
        // prints star and space
        System.out.print("*" + " ");
      }
      // throws the cursor in the next line after printing each line
      System.out.println();
    }
  }

}
