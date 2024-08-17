// Given two integers left and right, write a function to find the bitwise AND of all numbers in the range [left, right].
// https://www.youtube.com/watch?v=ojCd7PqeCwM
import java.util.*;
public class Bitwise_AND_of_Numbers_Range {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    int m,n,i=0;
    System.out.println("Enter m : ");
    m = inp.nextInt();
    System.out.println("Enter n : ");
    n = inp.nextInt();

    while(m!=n) {
      m = m>>1;
      n = n>>1;
      i++;
    }
    int ans = n<<i;
    System.out.println("The AND operation is :- "+ans);
  }
}
