// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
package Practice_of_10_from_apna_college;
import java.util.Scanner;

public class ganfarFirst {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("For Exit you can type 0 :- ");
    int num;
    int positiveNum = 0;
    int negativeNum = 0;
    int zeros = 0;
    do {
      System.out.print("Enter number : ");
      num = inp.nextInt();

      if (num>0) {
        positiveNum++;
      } else if (num<0) {
        negativeNum++;
      } else {
        zeros++;
      }
    } while (num!=0) ;

    System.out.println("Now you are exit form code and outputs are -> ");
    System.out.println("The count of positive numbers are : "+positiveNum);
    System.out.println("The count of negativer number are : "+negativeNum);
    System.out.println("The count of Zeros are : "+zeros);//it will not grater than 1
  }
}
