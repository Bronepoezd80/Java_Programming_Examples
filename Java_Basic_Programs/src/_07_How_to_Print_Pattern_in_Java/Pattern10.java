package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-10.
 */
public class Pattern10 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-10");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(rows, new Pattern10());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void pattern(int rows, Pattern10 obj) {
    obj.newRow();
    obj.upperPattern(rows, obj);
    obj.lowerPattern(rows, obj);
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void upperPattern(int rows, Pattern10 obj) {
    for (int i = 1; i <= rows; ++i) {
      obj.spaces(i, obj);
      obj.numbers(i, rows, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void lowerPattern(int rows, Pattern10 obj) {
    for (int i = rows - 1; i >= 1; --i) {
      obj.spaces(i, obj);
      obj.numbers(i, rows, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param i
   * @param obj
   */
  public void spaces(int i, Pattern10 obj) {
    for (int j = 1; j < i; ++j) {
      obj.printSpace();
    }
  }

  /**
   * 
   * @param i
   * @param rows
   * @param obj
   */
  public void numbers(int i, int rows, Pattern10 obj) {
    for (int k = i; k <= rows; ++k) {
      obj.printNumber(k);
    }
  }

  /**
   * 
   * @param n
   */
  public void printNumber(int n) {
    System.out.print(n + " ");
  }

  public void printSpace() {
    System.out.print(" ");
  }

  public void newRow() {
    System.out.println();
  }

}
