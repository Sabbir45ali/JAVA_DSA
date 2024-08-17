package ArrayInJava;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArray {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int row,col;
    System.out.println("Enter the number of rows: ");
    row = inp.nextInt();
    System.out.println("Enter the number of column : ");
    col = inp.nextInt();
    int[][] arr = new int[row][col];
    for (int r = 0; r<arr.length ; r++) {
      for (int c = 0; c<arr[r].length; c++) {
        arr[r][c] = inp.nextInt();
      }
    }

    for (int i = 0; i<arr.length; i++) {
      System.out.print(Arrays.toString(arr[i]));
      System.out.println();
    }
  }
}
