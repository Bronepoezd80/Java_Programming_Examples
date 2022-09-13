package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Character Pattern: Repeating Alphabet Pattern.
 */
public class RepeatingPattern {

  private static int alphabet = 65;

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Character Pattern: Repeating Alphabet Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    repeating(rows, new RepeatingPattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void repeating(int rows, RepeatingPattern obj) {
    for (int i = 0; i <= rows; i++) {
      obj.chars(i, rows, obj);
      ++alphabet;
      obj.newRow();
    }
  }

  /**
   * 
   * @param i
   * @param rows
   * @param obj
   */
  public void chars(int i, int rows, RepeatingPattern obj) {
    for (int k = 0; k <= i; ++k) {
      obj.printChar(rows);
    }
  }

  /**
   * 
   * @param rows
   */
  public void printChar(int rows) {
    System.out.print((char) (alphabet + rows) + " ");
  }

  public void newRow() {
    System.out.println();
  }

}
