package _03_Palindrome_Program_in_Java;

import java.util.*;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Palindrome Program in Java (Another way).
 */
public class PalindromeExample2 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(3, "Palindrome Program in Java (Another way)");
    String original, reverse = ""; // Objects of String class
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string/number to check if it is a palindrome");
    original = in.nextLine();
    int length = original.length();
    for (int i = length - 1; i >= 0; i--) {
      reverse = reverse + original.charAt(i);
    }
    if (original.equals(reverse)) {
      System.out.println("Entered string/number is a palindrome.");
    } else {
      System.out.println("Entered string/number isn not a palindrome.");
    }
    in.close();
  }

}
