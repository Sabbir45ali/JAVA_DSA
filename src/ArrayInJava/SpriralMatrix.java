package ArrayInJava;
import java.util.*;

public class SpriralMatrix {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    int row = 3, col = 3;
    int top = 0, down = row - 1, left = 0, right = col - 1, dir = 0;
    int Matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    // Algorithum
    while (top <= down && left <= right) {
      // When dir == 0
      if (dir == 0) {
        for (int i = left; i <= right; i++) {
          System.out.print(Matrix[top][i] + " ");
        }
        top++;
      }

      // When dir == 1
      else if (dir == 1) {
        for (int i = top; i <= down; i++) {
          System.out.print(Matrix[i][right] + " ");
        }
        right--;
      }

      // When dir == 2
      else if (dir == 2) {
        for (int i = right; i >= left; i--) {
          System.out.print(Matrix[down][i] + " ");
        }
        down--;
      }

      // When dir == 3
      else if (dir == 3) {
        for (int i = down; i >= top; i--) {
          System.out.print(Matrix[i][left] + " ");
        }
        left++;
      }

      // Increment of dir
      dir = (dir + 1) % 4;
    }
  }
}