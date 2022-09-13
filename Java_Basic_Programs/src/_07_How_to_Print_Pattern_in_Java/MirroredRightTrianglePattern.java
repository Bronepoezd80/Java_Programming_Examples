package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Mirrored Right Triangle Star Pattern.
 */
public class MirroredRightTrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Mirrored Right Triangle Star Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    mirroredRightTriangle(rows, new MirroredRightTrianglePattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void mirroredRightTriangle(int rows, MirroredRightTrianglePattern obj) {
    for (int i = 0; i < rows; i++) {
      obj.spaces(rows - i, obj);
      obj.columns(i, obj);
      obj.newRow();
    }
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  public void spaces(int rows, MirroredRightTrianglePattern obj) {
    for (int j = 1; j < rows; j++) {
      obj.printSpace();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void columns(int rows, MirroredRightTrianglePattern obj) {
    for (int k = 0; k <= rows; ++k) {
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
