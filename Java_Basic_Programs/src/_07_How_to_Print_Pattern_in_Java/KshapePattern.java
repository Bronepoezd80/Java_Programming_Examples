package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Character Pattern: K-shape Alphabet Pattern.
 */
public class KshapePattern {

  private static int alphabet = 65;

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Character Pattern: K-shape Alphabet Pattern");

    int rows = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    kShape(rows, new KshapePattern());
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  private static void kShape(int rows, KshapePattern obj) {
    obj.upperKShape(rows, obj);
    obj.lowerKShape(rows, obj);
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void upperKShape(int rows, KshapePattern obj) {
    for (int i = rows; i >= 0; --i) {
      obj.chars(i, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void lowerKShape(int rows, KshapePattern obj) {
    for (int i = 0; i <= rows; ++i) {
      obj.chars(i, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param rows
   * @param obj
   */
  public void chars(int rows, KshapePattern obj) {
    for (int j = 0; j <= rows; ++j) {
      obj.printChar(j);
    }
  }

  public void printChar(int rows) {
    System.out.print((char) (alphabet + rows) + " ");
  }

  public void newRow() {
    System.out.println();
  }

}
