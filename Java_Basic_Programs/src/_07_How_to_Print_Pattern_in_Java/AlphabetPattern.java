package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Star Pattern: Alphabet Star Pattern.
 */
public class AlphabetPattern {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Star Pattern: Alphabet Star Pattern");

    int size = General.UserEntry.requestInt("Enter the size you want to print : ");
    General.UserEntry.closeInput();

    alphabet(size, new AlphabetPattern());
  }

  /**
   * 
   * @param n
   * @param obj
   */
  public static void alphabet(int n, AlphabetPattern obj) {
    for (int i = 0; i <= n; ++i) {
      obj.innerLoop(i, n / 2, obj);
      obj.newLine();
    }
  }

  /**
   * 
   * @param i
   * @param n
   * @param obj
   */
  public void innerLoop(int i, int n_half, AlphabetPattern obj) {
    for (int j = 0; j <= n_half; ++j) {
      obj.printLines(i, j, n_half, obj);
    }
  }

  /**
   * 
   * @param i
   * @param j
   * @param n
   * @param obj
   */
  public void printLines(int i, int j, int n_half, AlphabetPattern obj) {
    boolean is_middle_line = (j == 0 || j == n_half) && i != 0;
    boolean is_top_line = i == 0 && j != n_half;
    boolean is_vertical_line = i == n_half;

    if (is_middle_line) {
      obj.printStar();
    } else if (is_top_line) {
      obj.printStar();
    } else if (is_vertical_line) {
      obj.printStar();
    } else {
      obj.printSpace();
    }
  }

  public void printStar() {
    System.out.print("*");
  }

  public void printSpace() {
    System.out.print(" ");
  }

  public void newLine() {
    System.out.println();
  }
}
