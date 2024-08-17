// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.Scanner;

public class StringProb1 {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter the number of strings you want to input : ");
    int size = inp.nextInt();

    String array[] = new String[size];

    int total = 0;
    for (int i = 0; i < size; i++) {
      array[i] = inp.next();
      total = total + array[i].length();
    }
    System.out.print("The number of total string length is :- " + total);
  }
}