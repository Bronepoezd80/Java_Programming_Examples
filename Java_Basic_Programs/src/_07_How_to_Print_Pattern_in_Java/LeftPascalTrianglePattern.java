package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Left Pascal's Triangle.
 */
public class LeftPascalTrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Left Pascal's Triangle");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    leftPascalTriangle(rows, new LeftPascalTrianglePattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void leftPascalTriangle(int rows, LeftPascalTrianglePattern obj) {
    obj.newRow();
    obj.upperTriangle(rows, obj);
    obj.lowerTriangle(rows, obj);
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void upperTriangle(int rows, LeftPascalTrianglePattern obj) {
    for (int i = 1; i <= rows; ++i) {
      obj.spaces(i, rows, obj);
      obj.stars(i + 1, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void lowerTriangle(int rows, LeftPascalTrianglePattern obj) {
    for (int i = rows; i >= 1; --i) {
      obj.spaces(i, rows + 1, obj);
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
  public void spaces(int i, int rows, LeftPascalTrianglePattern obj) {
    for (int j = i; j < rows; j++) {
      obj.printSpace();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void stars(int rows, LeftPascalTrianglePattern obj) {
    for (int k = 1; k < rows; ++k) {
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
