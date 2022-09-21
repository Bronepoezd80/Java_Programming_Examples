package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-21.
 */
public class Pattern21 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-21");

    int n = General.UserEntry.requestInt("Enter the value of n : ");
    General.UserEntry.closeInput();

    pattern(n, new Pattern21());
  }

  /**
   * 
   * @param n
   * @param obj
   */
  private static void pattern(int n, Pattern21 obj) {
    obj.newRow();
    int min; // n is the number up to you want to print
    // loop for upper left part
    for (int i = 1; i <= n; ++i) {
      for (int j = 1; j <= n; ++j) {
        min = i < j ? i : j;
        obj.printNumber(n - min + 1);
      }
      // loop for upper right part
      for (int j = n - 1; j >= 1; --j) {
        min = i < j ? i : j;
        obj.printNumber(n - min + 1);
      }
      obj.newRow();
    }
    // loop for lower left part
    for (int i = n - 1; i >= 1; --i) {
      for (int j = 1; j <= n; ++j) {
        min = i < j ? i : j;
        obj.printNumber(n - min + 1);
      }
      // loop for lower right part
      for (int j = n - 1; j >= 1; --j) {
        min = i < j ? i : j;
        obj.printNumber(n - min + 1);
      }
      obj.newRow();
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
