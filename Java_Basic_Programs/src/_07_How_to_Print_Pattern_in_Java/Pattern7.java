package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-7.
 */
public class Pattern7 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-7");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(rows, new Pattern7());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void pattern(int rows, Pattern7 obj) {
    for (int i = 1; i <= rows; ++i) {
      obj.numbers(i, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param i
   * @param obj
   */
  public void numbers(int i, Pattern7 obj) {
    for (int j = i; j >= 1; --j) {
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
