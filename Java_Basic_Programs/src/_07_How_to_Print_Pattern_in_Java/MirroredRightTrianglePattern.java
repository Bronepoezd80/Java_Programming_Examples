package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Mirrored Right Triangle Star Pattern.
 */
public class MirroredRightTrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Mirrored Right Triangle Star Pattern");
    int n = 7;
    // inner loop
    for (int i = 0; i <= n; i++) {
      // outer loop
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

}
