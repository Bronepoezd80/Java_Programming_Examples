package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-10.
 */
public class Pattern10 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-10");
    int n = 10;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = i; k <= n; k++) {
        System.out.print(k + " ");
      }
      System.out.println();
    }
    for (int i = n - 1; i >= 1; i--) {
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = i; k <= n; k++) {
        System.out.print(k + " ");
      }
      System.out.println();
    }
  }

}
