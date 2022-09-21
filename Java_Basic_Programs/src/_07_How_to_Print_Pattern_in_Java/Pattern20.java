package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-20.
 */
public class Pattern20 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-20");
    
    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(rows, new Pattern20());
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  private static void pattern(int rows, Pattern20 obj) {
    obj.newRow();
    for (int i = 1; i < rows + 1; i++) {
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
  public void numbers1(int i, int rows, Pattern20 obj) {
    for (int j = i; j < rows + 1; ++j) {
      obj.printNumber(j);
    }
  }
  
  /**
   * 
   * @param i
   * @param obj
   */
  public void numbers2(int i, Pattern20 obj) {
    for (int k = 1; k < i; ++k) {
      obj.printNumber(k);
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
