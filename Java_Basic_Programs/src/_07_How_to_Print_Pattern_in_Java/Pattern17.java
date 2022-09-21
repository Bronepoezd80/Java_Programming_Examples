package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-17.
 */
public class Pattern17 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-17");
    
    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(rows, new Pattern17());
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  private static void pattern(int rows, Pattern17 obj) {
    obj.newRow();
    obj.upperHalf(rows, obj);
    obj.lowerHalf(rows, obj);
  }
  
  /**
   * 
   * @param rows
   * @param obj
   */
  public void upperHalf(int rows, Pattern17 obj) {
    for (int i = 1; i <= rows; ++i) {
      obj.spaces(i, obj);
      obj.numbers(i, rows, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void lowerHalf(int rows, Pattern17 obj) {
    for (int i = rows - 1; i >= 1; --i) {
      obj.spaces(i, obj);
      obj.numbers(i, rows, obj);
      obj.newRow();
    }
  }
  
  /**
   * 
   * @param i
   * @param obj
   */
  public void spaces(int i, Pattern17 obj) {
    for (int j = 1; j < i; j++) {
      obj.printSpace();
    }
  }
  
  /**
   * 
   * @param i
   * @param rows
   * @param obj
   */
  public void numbers(int i, int rows, Pattern17 obj) {
    for (int j = i; j <= rows; ++j) {
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
  
  public void printSpace() {
    System.out.print(" ");
  }

  public void newRow() {
    System.out.println();
  }

}
