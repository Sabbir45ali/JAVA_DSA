// Write a function to print the sum of all odd numbers from 1 to n.
package Practice_of_10_from_apna_college;
import java.util.Scanner;

public class functionAvgOdd {
  public static int avgOddNum(int n) {
    int avG = 0;
    for (int i = 1; i <= n; i+=2) {
      avG+=i;
    }
    return avG;
  }
  
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter the value of n - ");
    int n = inp.nextInt();

    int ans = avgOddNum(n);
    System.out.println("Avarage of all odd numbers in " + n + " is - " + ans);
  }
}
