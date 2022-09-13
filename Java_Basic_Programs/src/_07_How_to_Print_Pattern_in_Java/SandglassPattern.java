package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Sandglass Star Pattern.
 */
public class SandglassPattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Sandglass Star Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    sandglass(rows, new SandglassPattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void sandglass(int rows, SandglassPattern obj) {
    obj.newRow();
    obj.upperTriangle(rows, obj);
    obj.lowerTriangle(rows, obj);
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void upperTriangle(int rows, SandglassPattern obj) {
    for (int i = 0; i <= rows - 1; ++i) {
      obj.spaces1(rows, obj);
      obj.spaces2(i, obj);
      obj.stars(i, rows, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void lowerTriangle(int rows, SandglassPattern obj) {
    for (int i = rows - 1; i >= 0; --i) {
      obj.spaces1(rows, obj);
      obj.spaces2(i, obj);
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
  public void stars(int i, int rows, SandglassPattern obj) {
    for (int k = i; k <= rows - 1; ++k) {
      obj.printStar();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void spaces1(int rows, SandglassPattern obj) {
    for (int j = 0; j < rows; j++) {
      obj.printSpace();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void spaces2(int rows, SandglassPattern obj) {
    for (int j = 0; j < rows; ++j) {
      obj.printSpace();
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
