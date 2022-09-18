package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-4.
 */
public class Pattern4 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-4");

    int n = General.UserEntry.requestInt("Enter the number of rows you want to print : ");
    General.UserEntry.closeInput();

    pattern(n, new int[] { 1, 2, 3, 4 }, new Pattern4());
  }

  /**
   * 
   * @param n
   * @param x
   * @param obj
   */
  private static void pattern(int n, int[] x, Pattern4 obj) {
    obj.upperPart(n, x, obj);
    obj.lowerPart(n, x, obj);
  }

  /**
   * 
   * @param n
   * @param x
   * @param obj
   */
  public void upperPart(int n, int[] x, Pattern4 obj) {
    for (int i = x[0]; i <= x[3]; ++i) {
      int nx = n;
      obj.spaces(x[0], nx - i, obj);
      obj.numbers(i, x, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param n
   * @param x
   * @param obj
   */
  public void lowerPart(int n, int[] x, Pattern4 obj) {
    for (int i = x[2]; i >= x[0]; --i) {
      int ny = n - x[0];
      obj.spaces(0, ny - i, obj);
      obj.numbers(i, x, obj);
      obj.newRow();
    }
  }

  /**
   * 
   * @param x
   * @param nz
   * @param obj
   */
  public void spaces(int x, int nz, Pattern4 obj) {
    for (int j = x; j <= nz; ++j) {
      obj.printSpace();
    }
  }

  /**
   * 
   * @param i
   * @param x
   * @param obj
   */
  public void numbers(int i, int[] x, Pattern4 obj) {
    obj.numbers1(i, x, obj);
    obj.numbers2(i, x, obj);
  }
  
  /**
   * 
   * @param i
   * @param x
   * @param obj
   */
  public void numbers1(int i, int[] x, Pattern4 obj) {
    for (int k = i; k >= x[0]; --k) {
      obj.printNumber(k);
    }
  }

  /**
   * 
   * @param i
   * @param x
   * @param obj
   */
  public void numbers2(int i, int[] x, Pattern4 obj) {
    for (int l = x[1]; l <= i; ++l) {
      obj.printNumber(l);
    }
  }

  /**
   * 
   * @param n
   */
  public void printNumber(int n) {
    System.out.print(n);
  }

  public void printSpace() {
    System.out.print(" ");
  }

  public void newRow() {
    System.out.println();
  }

}
