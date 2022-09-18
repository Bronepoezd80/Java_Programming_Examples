package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-3.
 */
public class Pattern3 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-3");

    int n = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(n, new Pattern3());
  }

  /**
   * 
   * @param n
   * @param obj
   */
  private static void pattern(int n, Pattern3 obj) {
    for (int i = 0; i < n; i++) {
      int number = 1;
      obj.printNumber(String.format("%" + (n - i) * 2 + "s", ""));
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
  public void numbers(int i, int number, Pattern3 obj) {
    for (int j = 0; j <= i; j++) {
      obj.printNumber(String.format("%4d", number));
      number = number * (i - j) / (j + 1);
    }
  }

  public void printNumber(String n) {
    System.out.print(n);
  }

  public void newRow() {
    System.out.println();
  }

}
