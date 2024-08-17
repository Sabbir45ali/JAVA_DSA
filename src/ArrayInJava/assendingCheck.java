package ArrayInJava;

import java.util.Scanner;

public class assendingCheck {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.println("Enter the length of array :- ");
    int size = inp.nextInt();

    int arr[] = new int[size];
    for (int i = 0 ;i<size;i++) {
      System.out.print("Enter number :- ");
      arr[i] = inp.nextInt();
    }

    boolean isAssending = true;

    for (int i=0;i<arr.length-1;i++) {
      if (arr[i]>arr[i+1]) {
        isAssending = false;
      }
    }

    if (isAssending) {
      System.out.print("This array is sorted in a Assending order :)");
    } else {
      System.out.print("This array is not sorted in a Assending order :(");
    }
  }
}
