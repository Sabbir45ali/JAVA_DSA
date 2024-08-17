//Enter 3 numbers from the user & make a function to print their average.
package Practice_of_10_from_apna_college;
import java.util.Scanner;

/**
 * 1
 */
public class avgOfThreeNum {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter 1st Num - ");
    int a = inp.nextInt();
    System.out.print("Enter 2nd Num - ");
    int b = inp.nextInt();
    System.out.print("Enter 3rd Num - ");
    int c = inp.nextInt();

    int avG = (a+b+c)/3;

    System.out.println("Avarage of "+a+" , "+b+" , "+c+" is - "+avG);
  }
}