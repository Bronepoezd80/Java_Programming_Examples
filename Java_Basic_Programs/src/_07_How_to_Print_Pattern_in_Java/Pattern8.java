package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-8.
 */
public class Pattern8 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-8");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(rows, new Pattern8());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void pattern(int rows, Pattern8 obj) {
    for (int i = 1; i <= rows; i++) {
      int num = 0;
      obj.numbers(i, num, rows, obj);
      obj.newRow();
    }
  }
  
  /**
   * 
   * @param i
   * @param num
   * @param rows
   * @param obj
   */
  public void numbers(int i, int num, int rows, Pattern8 obj) {
    if (i % 2 == 0) {
      num = 0;
      obj.binaries(num, rows, obj);
    } else {
      num = 1;
      obj.binaries(num, rows, obj);
    }
  }
  
  /**
   * 
   * @param num
   * @param rows
   * @param obj
   */
  public void binaries(int num, int rows, Pattern8 obj) {
    for (int j = 1; j <= rows; ++j) {
      obj.printNumber(num);
      num = (num == 0) ? 1 : 0;
    }
  }

  /**
   * 
   * @param n
   */
  public void printNumber(int n) {
    System.out.print(n);
  }

  public void newRow() {
    System.out.println();
  }

}
