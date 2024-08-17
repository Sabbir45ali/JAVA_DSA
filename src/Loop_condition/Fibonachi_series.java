package Loop_condition;

import java.util.Scanner;

public class Fibonachi_series {
    static void fib(int n, int n1, int n2) {
        if (n<3) {
            return ;
        }
        int fn = n1 + n2;
        n2 = n1;
        n1 = fn;
        System.out.print(fn + " ");
        fib(n-1, n1,n2);
    }
    static void fibPrint(int n) {
        if (n < 1) {
            System.out.println("Invalid inout");
        } else if (n == 1) {
            System.out.println(0);
        } else if (n == 2) {
            System.out.println("0 1 ");
        } else {
            System.out.print("0 ");
            fib(n, 1, 0);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number ho many you want series - ");
        int n = inp.nextInt();
        fibPrint(n);
    }
}
