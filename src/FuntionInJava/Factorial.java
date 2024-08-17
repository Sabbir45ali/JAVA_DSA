package FuntionInJava;

import java.util.Scanner;

/**
 * Factorial
 */
public class Factorial {
  public static int calculateFactorial(int a, int fact) {
    if (a == 0 || a == 1) {
      return 1;
    } else {
      for (int i = 2; i <= a; i++) {
        fact = fact * i;
      }
    }
    return fact;
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int a = inp.nextInt();

    int fact = 1;
    int res = calculateFactorial(a, fact);
    System.out.println("Factorial of " + a + " is - " + res);
  }
}
