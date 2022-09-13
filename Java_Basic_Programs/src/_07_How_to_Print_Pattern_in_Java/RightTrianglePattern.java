package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Right Triangle Star Pattern.
 */
public class RightTrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Right Triangle Star Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    rightTriangle(rows, new RightTrianglePattern());
  }

  /**
   * 
   * @param row
   * @param obj
   */
  private static void rightTriangle(int rows, RightTrianglePattern obj) {
    for (int i = 0; i < rows; ++i) {
      obj.columns(i, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param i
   * @param obj
   */
  public void columns(int i, RightTrianglePattern obj) {
    for (int j = 0; j <= i; ++j) {
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
