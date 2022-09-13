package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Reverse Pyramid Star Pattern.
 */
public class ReversePyramidPattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Reverse Pyramid Star Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    reversePyramid(rows, new ReversePyramidPattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void reversePyramid(int rows, ReversePyramidPattern obj) {
    for (int i = 0; i <= rows - 1; ++i) {
      obj.spaces(i, obj);
      obj.columns(rows - 1 - i, obj);
      obj.newLine();
    }
  }

  /**
   * 
   * @param max_rows
   * @param obj
   */
  public void columns(int max_rows, ReversePyramidPattern obj) {
    for (int k = 0; k <= max_rows; ++k) {
      obj.printStar();
    }
  }

  /**
   * 
   * @param i
   * @param obj
   */
  public void spaces(int i, ReversePyramidPattern obj) {
    for (int j = 0; j <= i; ++j) {
      obj.printSpace();
    }
  }

  public void printStar() {
    System.out.print("* ");
  }

  public void printSpace() {
    System.out.print(" ");
  }

  public void newLine() {
    System.out.println();
  }

}
