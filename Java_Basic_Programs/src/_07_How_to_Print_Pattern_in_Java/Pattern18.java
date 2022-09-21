package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-18.
 */
public class Pattern18 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-18");
    
    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(rows, new Pattern18());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void pattern(int rows, Pattern18 obj) {
    obj.newRow();
    for (int i = 1; i <= rows; ++i) {
      obj.numbers1(i, rows, obj);
      obj.numbers2(i, obj);
      obj.newRow();
    }
  }
  
  /**
   * 
   * @param i
   * @param rows
   * @param obj
   */
  public void numbers1(int i, int rows, Pattern18 obj) {
    for (int j = 1; j <= rows - i; ++j) {
      obj.printNumber(1);
    }
  }
  
  /**
   * 
   * @param i
   * @param obj
   */
  public void numbers2(int i, Pattern18 obj) {
    for (int j = 1; j <= i; ++j) {
      obj.printNumber(i);
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
