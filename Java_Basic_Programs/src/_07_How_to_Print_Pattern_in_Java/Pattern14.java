package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-14.
 */
public class Pattern14 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-14");
    
    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();
    
    pattern(rows, new Pattern14());
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  private static void pattern(int rows, Pattern14 obj) {
    obj.newRow();
    for (int i = rows; i >= 1; --i) {
      obj.numbers(i, obj);
      obj.newRow();
    }
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  public void numbers(int rows, Pattern14 obj) {
    for (int j = rows; j >= 1; --j) {
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
