package FuntionInJava;
import java.util.Scanner;

public class FunctionInJava {
  public static int sumOfTwoNum(int a ,int b) {
    return a+b;
}
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int a,b;

    System.out.print("Enter 1st Num - ");
    a = inp.nextInt();
    
    System.out.print("Enter 2nd Num - ");
    b = inp.nextInt();

    int sum = sumOfTwoNum(a, b);
    System.out.println("Sum of 2 numbers is - "+sum);
  }
}
