package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Character Pattern: Right Triangle Alphabetic Pattern.
 */
public class RightAlphabaticPattern {

  private static int alphabet = 65;

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Character Pattern: Right Triangle Alphabetic Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    rightAlphabetic(rows, new RightAlphabaticPattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void rightAlphabetic(int rows, RightAlphabaticPattern obj) {
    for (int i = 0; i <= rows; i++) {
      obj.chars(i, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void chars(int rows, RightAlphabaticPattern obj) {
    for (int j = 0; j <= rows; j++) {
      obj.printChar(j);
    }
  }

  /**
   * 
   * @param rows
   */
  public void printChar(int rows) {
    System.out.print((char) (alphabet + rows) + " ");
  }

  public void newRow() {
    System.out.println();
  }

}
