package _07_How_to_Print_Pattern_in_Java;

import java.util.Scanner;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Sandglass Star Pattern.
 */
public class SandglassPattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Sandglass Star Pattern");
    int i, j, k, n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows you want to print: ");
    n = sc.nextInt();
    for (i = 0; i <= n - 1; i++) {
      for (j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (k = i; k <= n - 1; k++) {
        System.out.print("*" + " ");
      }
      System.out.println("");
    }
    for (i = n - 1; i >= 0; i--) {
      for (j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (k = i; k <= n - 1; k++) {
        System.out.print("*" + " ");
      }
      System.out.println("");
    }
    sc.close();
  }

}
