/**
 * Q. Write a function to count the number of set bits (1s) in an integer.
 * it means the number of 1 in a number
 * Alogrithum : https://www.youtube.com/watch?v=L-p4-419U_Y
 */
import java.util.*;

public class Count_Set_Bit {
  public static int bitCount(int num) {
    int count = 0;
    while (num > 0) {
      num = num & (num - 1);
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter the number :- ");
    int num = inp.nextInt();

    int count = bitCount(num);
    System.out.println("The number of SET(1's)bit is :- " + count);
  }
}