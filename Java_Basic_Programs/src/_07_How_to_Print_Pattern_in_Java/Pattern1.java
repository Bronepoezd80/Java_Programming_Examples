package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-1.
 */
public class Pattern1 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-1");

    int n = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(n, new Pattern1());
  }

  /**
   * 
   * @param n
   * @param obj
   */
  private static void pattern(int n, Pattern1 obj) {
    obj.newRow();
    obj.rows(n, obj);
  }
  
  /**
   * 
   * @param n
   * @param obj
   */
  public void rows(int n, Pattern1 obj) {
    for (int i = 0; i < n; ++i) {
      int number = 1;
      obj.numbers(i, number, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param i
   * @param number
   * @param obj
   */
  public void numbers(int i, int number, Pattern1 obj) {
    for (int j = 0; j <= i; ++j) {
      obj.printNumber(number++);
    }
  }

  public void printNumber(int n) {
    System.out.print(n + " ");
  }

  public void newRow() {
    System.out.println();
  }

}
