package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Down Triangle Pattern.
 */
public class DownTrianglePattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Down Triangle Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    downTriangle(rows, new DownTrianglePattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void downTriangle(int rows, DownTrianglePattern obj) {
    obj.newLine();
    for (int i = rows; i >= 1; i--) {
      obj.spaces(i, rows, obj);
      obj.stars(i, rows, obj);
      obj.newLine();
    }
  }

  /**
   * 
   * @param i
   * @param rows
   * @param obj
   */
  public void spaces(int i, int rows, DownTrianglePattern obj) {
    for (int j = i; j < rows; ++j) {
      obj.printSpace();
    }
  }
  
  /**
   * 
   * @param i
   * @param rows
   * @param obj
   */
  public void stars(int i, int rows, DownTrianglePattern obj) {
    for (int k = 1; k <= (2 * i - 1); ++k) {
      obj.stars_or_spaces(i, k, rows, obj);
    }
  }
  
  /**
   * 
   * @param i
   * @param k
   * @param rows
   * @param obj
   */
  public void stars_or_spaces(int i, int k, int rows, DownTrianglePattern obj) {
    if (k == 1 || i == rows || k == (2 * i - 1)) {
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

  public void newLine() {
    System.out.println();
  }

}
