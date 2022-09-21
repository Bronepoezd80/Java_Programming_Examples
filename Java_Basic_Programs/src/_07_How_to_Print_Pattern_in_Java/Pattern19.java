package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-19.
 */
public class Pattern19 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-19");
    
    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(rows, new Pattern19());
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  private static void pattern(int rows, Pattern19 obj) {
    obj.newRow();
    for (int i = 1; i <= rows; i++) {
      int num = i;
      for (int j = 1; j <= i; j++) {
        obj.printNumber(num);
        num = num + rows - j;
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
