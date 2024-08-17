package FuntionInJava;

import java.util.Scanner;

public class FactorialRecurtion {
  public static int Factorial(int n) {
    if (n >= 1) {
      return n * Factorial(n - 1);
    } else {
      return 1;
    }
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter a number - ");
    int a = inp.nextInt();

    int res = Factorial(a);

    System.out.println("Factorial of " + a + " is - " + res);
  }
}
