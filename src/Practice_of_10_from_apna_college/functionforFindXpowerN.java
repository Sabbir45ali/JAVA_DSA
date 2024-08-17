package Practice_of_10_from_apna_college;
import java.util.Scanner;

public class functionforFindXpowerN {
  public static double xpowern(double x, double n) {
    double pow = Math.pow(x, n);
    return pow;
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter the value of x :");
    double x = inp.nextDouble();

    System.out.print("Enter the value of n :");
    double n = inp.nextDouble();

    double ans = xpowern(x, n);
    System.out.println("The value of x^n is : "+ans);
  }
}
