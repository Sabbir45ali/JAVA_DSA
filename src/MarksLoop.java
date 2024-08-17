import java.util.Scanner;

public class MarksLoop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int Option;

    do {
      System.out.println("You have 2 options");
      System.out.println("1. Enter 1 for continue");
      System.out.println("0. Enter 0 for exit ");

      System.out.print("Enetr your Choice - ");
      Option = input.nextInt();
      switch (Option) {
        case 1:
          System.out.println("Enter your marks");
          int marks = input.nextInt();
          if (marks >= 90) {
            System.out.println("This is Good");
          } else if (marks >= 60 && marks <= 89) {
            System.out.println("This is also Good");
          } else if (marks >= 0 && marks <= 59) {
            System.out.println("This is good as well");
            System.out.println("Because marks don't matter but our effort does");
          }
          break;
        case 0:
          System.out.println("Programm was end");
          break;
        default:
          System.out.println("Chose a valid number  :(");
          break;
      }

    } while (Option != 0);

  }
}