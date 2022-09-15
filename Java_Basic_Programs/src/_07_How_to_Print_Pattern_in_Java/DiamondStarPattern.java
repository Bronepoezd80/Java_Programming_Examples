package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Diamond Star Pattern.
 */
public class DiamondStarPattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(1, "Star Pattern: Diamond Star Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    diamondStar(rows, new DiamondStarPattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void diamondStar(int rows, DiamondStarPattern obj) {
    obj.newLine();
    obj.upperDiamond(rows, obj);
    obj.lowerDiamond(rows, obj);
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  public void upperDiamond(int rows, DiamondStarPattern obj) {
    for (int i = 1; i <= rows; i++) {
      obj.spaces1(i, rows, obj);
      obj.printStar();
      obj.spaces2(2 * (i - 1), obj);
      obj.newLines(i, obj);
    }
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  public void lowerDiamond(int rows, DiamondStarPattern obj) {
    for (int i = rows - 1; i >= 1; i--) {
      obj.spaces1(i, rows, obj);
      obj.printStar();
      obj.spaces2(2 * (i - 1), obj);
      obj.newLines(i, obj);
    }
  }

  /**
   * 
   * @param i
   * @param rows
   * @param obj
   */
  public void spaces1(int i, int rows, DiamondStarPattern obj) {
    for (int j = rows; j > i; --j) {
      obj.printSpace();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void spaces2(int rows, DiamondStarPattern obj) {
    for (int k = 1; k < rows; ++k) {
      obj.printSpace();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void newLines(int rows, DiamondStarPattern obj) {
    if (rows == 1) {
      obj.newLine();
      return;
    }
    obj.printStar();
    obj.newLine();
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
