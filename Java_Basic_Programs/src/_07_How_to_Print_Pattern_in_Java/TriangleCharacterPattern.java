package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Character Pattern: Triangle Character Pattern.
 */
public class TriangleCharacterPattern {

  private static int alphabet = 65;
  
  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Character Pattern: Triangle Character Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    triangleCharacter(rows, new TriangleCharacterPattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void triangleCharacter(int rows, TriangleCharacterPattern obj) {
    for (int i = 0; i < rows; ++i) {
      obj.spaces(i, rows, obj);
      obj.chars(i, rows, obj);
      obj.newRow();
    }
  }
  
  /**
   * 
   * @param i
   * @param rows
   * @param obj
   */
  public void spaces(int i, int rows, TriangleCharacterPattern obj) {
    for (int j = rows; j > i; --j) {
      obj.printSpace();
    }
  }
  
  /**
   * 
   * @param i
   * @param rows
   * @param obj
   */
  public void chars(int i, int rows, TriangleCharacterPattern obj) {
    for (int k = 0; k <= i; ++k) {
      obj.printChar(k);
    }
  }

  public void printChar(int k) {
    System.out.print((char) (alphabet + k) + " ");
  }

  public void printSpace() {
    System.out.print(" ");
  }

  public void newRow() {
    System.out.println();
  }

}
