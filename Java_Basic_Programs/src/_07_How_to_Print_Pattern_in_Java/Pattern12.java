package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-12.
 */
public class Pattern12 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-12");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(rows, new Pattern12());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void pattern(int rows, Pattern12 obj) {
    obj.newRow();
    for (int i = 1; i <= rows; ++i) {
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
  public void numbers(int i, int rows, Pattern12 obj) {
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
