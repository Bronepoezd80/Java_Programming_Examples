package _07_How_to_Print_Pattern_in_Java;

import java.util.Scanner;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-7.
 */
public class Pattern7 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-7");
    int i, j, n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows you want to print: ");
    n = sc.nextInt();
    for (i = 1; i <= n; i++) {
      for (j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

}
