package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-2.
 */
public class Pattern2 {

  private static int k = 1;

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-2");

    int n = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(n, new Pattern2());
  }

  /**
   * 
   * @param n
   * @param obj
   */
  private static void pattern(int n, Pattern2 obj) {
    for (int i = 1; i <= n; i++) {
      obj.numbers(i + 1, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param n
   * @param obj
   */
  public void numbers(int n, Pattern2 obj) {
    for (int j = 1; j < n; ++j) {
      obj.printNumber(k++);
    }
  }

  /**
   * 
   * @param n
   */
  public void printNumber(int n) {
    System.out.printf("%-3d", n);
  }

  public void newRow() {
    System.out.println();
  }

}
