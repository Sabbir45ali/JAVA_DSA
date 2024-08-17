package FuntionInJava;

import java.util.Scanner;

public class CheckEven {
  public static void evenOrNot(int a) {
    if (a%2 == 0) {
      System.out.println("Even number");
    } else {
      System.out.println("Odd number");
    }                                                        
  }
  public static void main(String[] args) {
    Scanner inp = new Scanner (System.in);
    
    System.out.print("Enter a Number - ");
    int n = inp.nextInt();

    evenOrNot(n);
  }
}
