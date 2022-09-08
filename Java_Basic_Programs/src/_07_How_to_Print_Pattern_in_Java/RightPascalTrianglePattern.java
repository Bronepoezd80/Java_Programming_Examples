package _07_How_to_Print_Pattern_in_Java;

import java.util.Scanner;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Right Pascal's Triangle.
 */
public class RightPascalTrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Right Pascal's Triangle");
    int i, j, rows;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows you want to print: ");
    rows = sc.nextInt();
    for (i = 0; i <= rows - 1; i++) {
      for (j = 0; j <= i; j++) {
        System.out.print("*" + " ");
      }
      System.out.println("");
    }
    for (i = rows - 1; i >= 0; i--) {
      for (j = 0; j <= i - 1; j++) {
        System.out.print("*" + " ");
      }
      System.out.println("");
    }
    sc.close();
  }

}
