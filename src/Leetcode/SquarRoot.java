package Leetcode;
import java.util.*;

public class SquarRoot {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int ans = mySqrt(x);
        System.out.println(ans);
    }
    public static int mySqrt(int x) {
        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (mid > x / mid)
                end = mid - 1;
            else if (mid < x / mid)
                start = mid + 1;
            else
                return mid;
        }
        return end;
    }
}
