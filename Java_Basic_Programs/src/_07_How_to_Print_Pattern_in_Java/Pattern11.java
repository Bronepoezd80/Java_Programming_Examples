package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-11.
 */
public class Pattern11 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-11");
    
    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();
    
    pattern(rows, new Pattern11());
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  private static void pattern(int rows, Pattern11 obj) {
    obj.newRow();
    obj.upperHalf(rows, obj);
    obj.lowerHalf(rows, obj);
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  public void upperHalf(int rows, Pattern11 obj) {
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
  public void lowerHalf(int rows, Pattern11 obj) {
    for (int i = rows - 1; i >= 1; --i) {
      obj.numbers(i, obj);
      obj.newRow();
    }
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  public void numbers(int rows, Pattern11 obj) {
    for (int j = 1; j <= rows; ++j) {
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
