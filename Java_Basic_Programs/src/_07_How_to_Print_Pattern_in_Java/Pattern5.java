package _07_How_to_Print_Pattern_in_Java;

import java.util.*;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-5.
 */
public class Pattern5 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-5");
    int i, j, rows;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows you want to print: ");
    rows = sc.nextInt();
    for (i = 1; i <= rows; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    sc.close();
  }

}
