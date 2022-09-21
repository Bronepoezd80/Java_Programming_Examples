package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-15.
 */
public class Pattern15 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-15");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(rows, new Pattern15());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void pattern(int rows, Pattern15 obj) {
    obj.newRow();
    for (int i = 1; i <= rows; i++) {
      obj.firstHalf(i, obj);
      obj.secondHalf(i, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param i
   * @param obj
   */
  public void firstHalf(int i, Pattern15 obj) {
    for (int j = 1; j <= i; ++j) {
      obj.printNumber(j);
    }
  }

  /**
   * 
   * @param i
   * @param obj
   */
  public void secondHalf(int i, Pattern15 obj) {
    for (int j = i - 1; j >= 1; --j) {
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
