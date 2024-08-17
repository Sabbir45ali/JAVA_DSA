package Practice_of_10_from_apna_college;
import java.util.Scanner;

public class funxtionOfCheckGrater {
  public static int graterCheck(int a,int b) {
    int ans = a>b?a:b;
    return ans;
  }
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter the value of a - ");
    int a = inp.nextInt();

    System.out.print("Enter the value of b -");
    int b = inp.nextInt();

    int ans = graterCheck(a, b);
    System.out.println("Grater among a and b is - "+ans);
  }
}
