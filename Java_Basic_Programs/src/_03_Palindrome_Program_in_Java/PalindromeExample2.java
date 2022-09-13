package _03_Palindrome_Program_in_Java;

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

    String original = General.UserEntry.requestStr("Enter a string/number to check if it is a palindrome : ");
    General.UserEntry.closeInput();

    isPalindrome(new String[] { original, getReverse(original) });
  }

  /**
   * 
   * @param original
   * @return
   */
  private static String getReverse(String original) {
    String reverse = "";
    for (int i = original.length() - 1; i >= 0; i--) {
      reverse += original.charAt(i);
    }
    return reverse;
  }

  /**
   * 
   * @param strings
   */
  private static void isPalindrome(String[] strings) {
    if (strings[0].equals(strings[1])) {
      System.out.println("Entered string/number is a palindrome.");
    } else {
      System.out.println("Entered string/number is not a palindrome.");
    }
  }

}
