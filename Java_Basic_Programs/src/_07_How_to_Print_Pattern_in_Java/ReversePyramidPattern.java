package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Reverse Pyramid Star Pattern.
 */
public class ReversePyramidPattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Reverse Pyramid Star Pattern");
    int rows = 8;
    for (int i = 0; i <= rows - 1; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= rows - 1 - i; k++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
  }

}
