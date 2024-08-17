// Write a function to swap two numbers without using a temporary variable, using bitwise operators.

/**
 * SwapTwoNumbers
 */
import java.util.*;

public class SwapTwoNumbers {

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int a, b;
    System.out.print("a = ");
    a = inp.nextInt();
    System.out.print("b = ");
    b = inp.nextInt();

    a = a^b;
    b = a^b;
    a = a^b;

    System.out.println("a = "+a);
    System.out.println("b = "+b);
  }
}