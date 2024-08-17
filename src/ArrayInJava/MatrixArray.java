package ArrayInJava;
import java.util.Scanner;

public class MatrixArray {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter row number - ");
    int row = inp.nextInt();

    System.out.print("Enter column number - ");
    int col = inp.nextInt();
    int[][] Matrix = new int[row][col];
    // Input
    System.out.print("Enter the Matrix :");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        Matrix[i][j] = inp.nextInt();
      }
    }

    // Output
    System.out.println("The matrx is : ");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(Matrix[i][j]+" ");
      }
      System.out.println();
    }
  }
}
