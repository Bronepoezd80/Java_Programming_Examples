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
  public static void print(int chapter, String example) {
    switch (chapter) {
      case 1:
        text(chapter, "Fibonacci Series in Java", example);
        break;
      case 2:
        text(chapter, "Prime Number Program in Java", example);
        break;
      case 3:
        text(chapter, "Palindrome Program in Java", example);
        break;
      case 4:
        text(chapter, "How to Print ASCII Value in Java", example);
        break;
      case 5:
        text(chapter, "Armstrong Number in Java", example);
        break;
      case 6:
        text(chapter, "How to Generate Random Number in Java", example);
        break;
      case 7:
        text(chapter, "How to Print ASCII Value in Java", example);
        break;
      case 8:
        text(chapter, "How to Compare Two Objects in Java", example);
        break;
      case 9:
        text(chapter, "How to Create Object in Java", example);
        break;
      case 10:
        text(chapter, "How to Print ASCII Value in Java", example);
        break;
      default:
    }
  }
  
  /**
   * 
   * @param number
   * @param description
   */
  private static void text(int number, String description, String example) {
    System.out.print("""
        %s) %s
            example: %s

        """.formatted(number, description, example));
  }

}
