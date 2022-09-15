package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Diamond Shape Pattern.
 */
public class DiamondPattern {

  public static int space = 0;

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Diamond Shape Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    diamond(rows, new DiamondPattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void diamond(int rows, DiamondPattern obj) {
    obj.upperDiamond(rows, obj);
    obj.lowerDiamond(rows, obj);
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  public void upperDiamond(int rows, DiamondPattern obj) {
    space = rows - 1;
    for (int j = 1; j <= rows; ++j) {
      obj.spaces(space, obj);
      --space;
      obj.stars(2 * j - 1, obj);
      obj.newRow();
    }
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  public void lowerDiamond(int rows, DiamondPattern obj) {
    space = 1;
    for (int j = 1; j <= rows - 1; ++j) {
      obj.spaces(space, obj);
      ++space;
      obj.stars(2 * (rows - j) - 1, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void spaces(int rows, DiamondPattern obj) {
    for (int i = 1; i <= rows; ++i) {
      obj.printSpace();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void stars(int rows, DiamondPattern obj) {
    for (int i = 1; i <= rows; ++i) {
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
