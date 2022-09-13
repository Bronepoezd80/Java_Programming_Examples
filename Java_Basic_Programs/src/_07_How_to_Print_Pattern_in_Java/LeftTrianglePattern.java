package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Left Triangle Star Pattern.
 */
public class LeftTrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Left Triangle Star Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    leftTriangle(rows, new LeftTrianglePattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void leftTriangle(int rows, LeftTrianglePattern obj) {
    for (int i = 0; i < rows; ++i) {
      obj.spaces(2 * (rows - i - 1), obj);
      obj.columns(i, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void spaces(int rows, LeftTrianglePattern obj) {
    for (int j = rows; j > 0; --j) {
      obj.printSpace();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void columns(int rows, LeftTrianglePattern obj) {
    for (int j = 0; j <= rows; ++j) {
      obj.printStar();
    }
  }

  public void printStar() {
    System.out.print("* ");
  }

  public void printSpace() {
    System.out.print(" ");
  }

  public void newRow() {
    System.out.println();
  }

}
