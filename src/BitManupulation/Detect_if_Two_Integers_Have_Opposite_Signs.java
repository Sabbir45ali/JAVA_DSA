// Write a function that returns true if two given integers have opposite signs, and false otherwise.
// Solution : https://www.youtube.com/watch?v=EmxGwW7Jwl8

import java.util.*;

public class Detect_if_Two_Integers_Have_Opposite_Signs {

  public static boolean CheckOppositSign(int a, int b) {
    return ((a ^ b) < 0);
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter a = ");
    int a = inp.nextInt();

    System.out.print("Enter b = ");
    int b = inp.nextInt();

    if (CheckOppositSign(a, b)) {
      System.out.println("There is a negative sign");
    } else {
      System.out.println("There is a no negative sign");
    }

  }
}
