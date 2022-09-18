package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-5.
 */
public class Pattern5 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-5");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(rows, new Pattern5());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void pattern(int rows, Pattern5 obj) {
    for (int i = 1; i <= rows; ++i) {
      obj.numbers(i, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void numbers(int rows, Pattern5 obj) {
    for (int j = 1; j <= rows; ++j) {
      obj.printNumber(rows);
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
