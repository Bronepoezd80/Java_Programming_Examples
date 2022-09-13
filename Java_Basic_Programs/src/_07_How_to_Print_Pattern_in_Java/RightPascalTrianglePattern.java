package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Right Pascal's Triangle.
 */
public class RightPascalTrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Right Pascal's Triangle");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    rightPascalTriangle(rows, new RightPascalTrianglePattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void rightPascalTriangle(int rows, RightPascalTrianglePattern obj) {
    obj.upperTriangle(rows - 1, obj);
    obj.lowerTriangle(rows - 1, obj);
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void upperTriangle(int rows, RightPascalTrianglePattern obj) {
    for (int i = 0; i <= rows; ++i) {
      obj.stars(i, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void lowerTriangle(int rows, RightPascalTrianglePattern obj) {
    for (int i = rows; i >= 0; --i) {
      obj.stars(i - 1, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void stars(int rows, RightPascalTrianglePattern obj) {
    for (int j = 0; j <= rows; ++j) {
      obj.printStar();
    }
  }

  public void printStar() {
    System.out.print("* ");
  }

  public void newRow() {
    System.out.println();
  }

}
