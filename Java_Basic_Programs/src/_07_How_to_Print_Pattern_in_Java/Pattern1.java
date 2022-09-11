package _07_How_to_Print_Pattern_in_Java;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Number Pattern: Pattern-1.
 */
public class Pattern1 {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(7, "Number Pattern: Pattern-1");
    // i for rows and j for columns
    int i, j, number, n = 7;
    // loop for rows
    for (i = 0; i < n; i++) {
      number = 1;
      // loop for columns
      for (j = 0; j <= i; j++) {
        // prints num
        System.out.print(number + " ");
        // incrementing the value of number
        number++;
      }
      // throws the cursor at the next line after printing each row
      System.out.println();
    }
  }

}
