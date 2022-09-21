package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-9.
 */
public class Pattern9 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-9");
    
    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();
    
    pattern(rows, new Pattern9());
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  private static void pattern(int rows, Pattern9 obj) {
    obj.newRow();
    for (int i = 1; i <= rows; i++) {
      obj.numbers(i, obj);
      obj.newRow();
    }
  }
  
  /**
   * 
   * @param i
   * @param obj
   */
  public void numbers(int i, Pattern9 obj) {
    for (int j = 1; j <= i; ++j) {
      if (j % 2 == 0) {
        obj.printZero();
      } else {
        obj.printOne();
      }
    }
  }
  
  public void printZero() {
    System.out.print(0);
  }
  
  public void printOne() {
    System.out.print(1);
  }

  public void newRow() {
    System.out.println();
  }

}
