package _05_Armstrong_Number_in_Java;

import java.lang.Math;

/**
 * 
 * @author Jakob Janzen <jakob.janzen80@gmail.com>
 *
 *         Armstrong Number Java Program.
 */
public class ArmstsrongNumberExample2 {

  /**
   * 
   * @brief function to check if the number is Armstrong or not
   * @param n
   * @return
   */
  static boolean isArmstrong(int n) {
    int temp = n, digits = 0, last = 0, sum = 0;
    while (temp > 0) {
      temp /= 10;
      digits++;
    }
    temp = n;
    while (temp > 0) {
      last = temp % 10;
      sum += (Math.pow(last, digits));
      temp /= 10;
    }
    if (n == sum) {
      return true;
    }
    return false;
  }

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    General.Description.print(5, "Armstrong Number Java Program");

    int num = General.UserEntry.requestInt("Enter the number : ");
    General.UserEntry.closeInput();

    if (isArmstrong(num)) {
      System.out.print("Armstrong ");
    } else {
      System.out.print("Not Armstrong ");
    }
  }

}
