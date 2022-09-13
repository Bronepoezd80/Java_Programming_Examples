package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Triangle Star Pattern.
 */
public class TrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Triangle Star Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    triangle(rows, new TrianglePattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void triangle(int rows, TrianglePattern obj) {
    for (int i = 1; i <= rows; i++) {
      obj.spaces(i, rows, obj);
      obj.stars(i, rows, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param i
   * @param rows
   * @param obj
   */
  public void spaces(int i, int rows, TrianglePattern obj) {
    for (int j = i; j < rows; j++) {
      obj.printSpace();
    }
  }

  /**
   * 
   * @param i
   * @param rows
   * @param obj
   */
  public void stars(int i, int rows, TrianglePattern obj) {
    int max = 2 * i - 1;
    for (int k = 1; k <= max; ++k) {
      obj.printStarSpace(k == 1 || i == rows || k == max, obj);
    }
  }

  /**
   * 
   * @param condition
   * @param obj
   */
  public void printStarSpace(boolean condition, TrianglePattern obj) {
    if (condition) {
      obj.printStar();
    } else {
      obj.printSpace();
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
