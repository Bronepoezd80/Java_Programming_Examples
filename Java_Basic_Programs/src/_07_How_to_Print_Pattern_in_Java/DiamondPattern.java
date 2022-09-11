package _07_How_to_Print_Pattern_in_Java;

import java.util.Scanner;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Diamond Shape Pattern.
 */
public class DiamondPattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Diamond Shape Pattern");
    int row, i, j, space = 1;
    System.out.print("Enter the number of rows you want to print: ");
    Scanner sc = new Scanner(System.in);
    row = sc.nextInt();
    space = row - 1;
    for (j = 1; j <= row; j++) {
      for (i = 1; i <= space; i++) {
        System.out.print(" ");
      }
      space--;
      for (i = 1; i <= 2 * j - 1; i++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    space = 1;
    for (j = 1; j <= row - 1; j++) {
      for (i = 1; i <= space; i++) {
        System.out.print(" ");
      }
      space++;
      for (i = 1; i <= 2 * (row - j) - 1; i++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    sc.close();
  }

}
