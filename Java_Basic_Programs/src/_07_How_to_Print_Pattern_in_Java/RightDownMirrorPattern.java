package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Right Down Mirror Star Pattern.
 */
public class RightDownMirrorPattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Right Down Mirror Star Pattern");
    int row = 7;
    for (int i = row; i >= 1; i--) {
      for (int j = row; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

}
