package ArrayInJava;
import java.util.*;

public class transposeOfMatrix {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int row, col;

    System.out.print("Enter row :- ");
    row = inp.nextInt();

    System.out.print("Enter col :- ");
    col = inp.nextInt();

    int Matrix[][] = new int[row][col];

    // Input
    for (int i = 0; i < row; i++) {
      for(int j=0;j<col ;j++) {
        Matrix[i][j] = inp.nextInt(); 
      }
    }

    System.out.println("The Transpose of the Matrix is :- ");
    for(int i =0 ;i<row;i++) {
      for(int j=0;j<col;j++) {
        System.out.print(Matrix[j][i]+" ");
      }
      System.out.println(" ");
    }
  }
}
