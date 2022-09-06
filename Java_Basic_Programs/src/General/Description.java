package General;
/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Description of Tutorial Chapter.
 */

public class Description {

  /**
   * 
   * @param chapter
   */
  public static void print(int chapter) {
    switch (chapter) {
      case 1:
        text(chapter, "Fibonacci Series in Java");
        break;
      case 2:
        text(chapter, "Prime Number Program in Java");
        break;
      case 3:
        text(chapter, "Palindrome Program in Java");
        break;
      case 4:
        text(chapter, "How to Print ASCII Value in Java");
        break;
      case 5:
        text(chapter, "Armstrong Number in Java");
        break;
      case 6:
        text(chapter, "How to Generate Random Number in Java");
        break;
      case 7:
        text(chapter, "How to Print ASCII Value in Java");
        break;
      case 8:
        text(chapter, "How to Compare Two Objects in Java");
        break;
      case 9:
        text(chapter, "How to Create Object in Java");
        break;
      case 10:
        text(chapter, "How to Print ASCII Value in Java");
        break;
      default:
    }
  }
  
  /**
   * 
   * @param number
   * @param description
   */
  private static void text(int number, String description) {
    System.out.print("""
        %s) %s

        """.formatted(number, description));
  }

}
