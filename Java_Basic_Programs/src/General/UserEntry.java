package General;

import java.util.Scanner;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         User enter request.
 */
public class UserEntry {

  private static Scanner input = new Scanner(System.in);

  /**
   * 
   */
  public static void closeInput() {
    input.close();
  }

  /**
   * 
   * @param question
   * @return
   */
  public static int requestInt(String question) {
    System.out.print(question);
    int n = 0;
    if (input.hasNextLine()) {
      n = Integer.parseInt(input.nextLine());
    }
    return n;
  }

  /**
   * 
   * @param question
   * @return
   */
  public static String requestStr(String question) {
    System.out.print(question);
    String s = "";
    if (input.hasNextLine()) {
      s = input.nextLine(); //Integer.parseInt(input.nextLine());
    }
    return s;
  }
}
