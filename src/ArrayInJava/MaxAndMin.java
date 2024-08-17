package ArrayInJava;
import java.util.Scanner;

/**
 * MaxAndMin
 */
public class MaxAndMin {

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter how many number you want to add in array :- ");
    int size = inp.nextInt();

    int arr[] = new int[size];
    for (int i=0;i<size ;i++) {
      System.out.print("Enter number - ");
      arr[i] = inp.nextInt();
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i=0;i<arr.length;i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    System.out.println("The maximum number is :- "+max);
    System.out.println("The minimum number is :- "+min);
  }
}