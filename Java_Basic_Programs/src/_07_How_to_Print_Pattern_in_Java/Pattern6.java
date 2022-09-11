package _07_How_to_Print_Pattern_in_Java;

import java.util.*;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-6.
 */
public class Pattern6 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-6");
    int i, j, rows;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows youy want to print: ");
    rows = sc.nextInt();
    for (i = rows; i >= 1; i--) {
      for (j = rows; j >= i; j--) {
        System.out.print(j + " ");
      }

      System.out.println();
    }
  }

}
