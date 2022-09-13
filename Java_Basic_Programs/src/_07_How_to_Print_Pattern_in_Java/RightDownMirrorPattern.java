package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Right Down Mirror Star Pattern.
 */
public class RightDownMirrorPattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Right Down Mirror Star Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    rightDownMirror(rows, new RightDownMirrorPattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void rightDownMirror(int rows, RightDownMirrorPattern obj) {
    for (int i = rows; i >= 1; --i) {
      obj.spaces(i, rows, obj);
      obj.stars(i, obj);
      obj.newRow();
    }
  }
  
  /**
   * 
   * @param i
   * @param rows
   * @param obj
   */
  public void spaces(int i, int rows, RightDownMirrorPattern obj) {
    for (int j = rows; j > i; --j) {
      obj.printSpace();
    }
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  public void stars(int rows, RightDownMirrorPattern obj) {
    for (int k = 1; k <= rows; ++k) {
      obj.printStar();
    }
  }

  public void printStar() {
    System.out.print("*");
  }

  public void printSpace() {
    System.out.print(" ");
  }

  public void newRow() {
    System.out.println();
  }

}
