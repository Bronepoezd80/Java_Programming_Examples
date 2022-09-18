package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-6.
 */
public class Pattern6 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-6");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(rows, new Pattern6());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void pattern(int rows, Pattern6 obj) {
    for (int i = rows; i >= 1; --i) {
      obj.numbers(i, rows, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param i
   * @param rows
   * @param obj
   */
  public void numbers(int i, int rows, Pattern6 obj) {
    for (int j = rows; j >= i; --j) {
      obj.printNumber(j);
    }
  }

  /**
   * 
   * @param n
   */
  public void printNumber(int n) {
    System.out.print(n + " ");
  }

  public void newRow() {
    System.out.println();
  }

}
