//Q. Reverse the bits of an unsigned integer.
//Solution : https://www.youtube.com/watch?v=LJiMk8lPJNc

import java.util.*;

public class Reverse_Bits {

    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int lsb = n & 1;
            result = (result << 1) | lsb;
            n = n >>> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter which number you want to reverse bits: ");
        int n = inp.nextInt();
        int ans = reverseBits(n);

        System.out.println("The reverse is: " + ans);
    }
}
