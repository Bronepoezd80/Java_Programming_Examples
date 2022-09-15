package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Downward Triangle Star Pattern.
 */
public class DownwardTrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Downward Triangle Star Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    downwardTriangle(rows, new DownwardTrianglePattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void downwardTriangle(int rows, DownwardTrianglePattern obj) {
    obj.newRow();
    for (int i = rows - 1; i >= 0; i--) {
      obj.stars(i, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param i
   * @param obj
   */
  public void stars(int i, DownwardTrianglePattern obj) {
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
