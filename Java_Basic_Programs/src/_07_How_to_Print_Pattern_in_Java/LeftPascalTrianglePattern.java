package _07_How_to_Print_Pattern_in_Java;

import java.util.Scanner;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Left Pascal's Triangle.
 */
public class LeftPascalTrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Left Pascal's Triangle");
    int i, j, k, rows;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows you want to print: ");
    rows = sc.nextInt();
    for (i = 1; i <= rows; i++) {
      for (j = i; j < rows; j++) {
        System.out.print(" ");
      }
      for (k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    for (i = rows; i >= 1; i--) {
      for (j = i; j <= rows; j++) {
        System.out.print(" ");
      }
      for (k = 1; k < i; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    sc.close();
  }

}
