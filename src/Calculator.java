import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your 1st number : ");
    int val1 = input.nextInt();

    System.out.print("Enter your 2nd number : ");
    int val2 = input.nextInt();

    System.out.print("Enter Symbol - ");
    String Symbol = input.next();


    
    switch (Symbol) {
      case "*":
        System.out.println(val1 * val2);
        break;
      case "/":
        System.out.println(val1 / val2);
        break;
      case "+":
        System.out.println(val1 + val2);
        break;
      case "-":
        System.out.println(val1 - val2);
        break;
      default:
        System.out.println("Enter a valid case");
        break;
    }
  }
}