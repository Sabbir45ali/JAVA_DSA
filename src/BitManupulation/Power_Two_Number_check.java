/*
Q. Write a function to determine whether a given integer is a power of two

--->  In Java, you can determine whether an integer is a power of two using bit manipulation. Specifically, if an integer is a power of two, it will have only one bit set to 1 in its binary representation. For example, the binary representations of the powers of two are as follows:

. 1: 0001
. 2: 0010
. 4: 0100
. 8: 1000
and so on.

To check if an integer is a power of two, you can use the fact that subtracting 1 from a power of two results in a binary number with all bits to the right of the rightmost set bit flipped. For example:

. (8 - 1): 0111
. (16 - 1): 1111
So, if you bitwise AND the original number with (number - 1) and get 0, it means there is only one bit set to 1 in the original number, and thus it is a power of two.
*/

import java.util.*;

public class Power_Two_Number_check {
  public static boolean TwoPowerCheck(int num) {
    return num > 0 && (num & (num - 1)) == 0;
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter number which you want to check for Power of Two :- ");

    int num = inp.nextInt();

    boolean ans = TwoPowerCheck(num);

    System.out.println("The given number is a Power of Two :- " + ans);
  }

}
