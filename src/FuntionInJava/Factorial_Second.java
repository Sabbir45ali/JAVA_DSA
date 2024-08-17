package FuntionInJava;

import java.util.Scanner;

public class Factorial_Second {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number you want to calculate the factorial");
        int num = inp.nextInt();
        int res = Factorial(num);
        System.out.println("The factorial of " + num + " is " + res);
    }

    static int Factorial(int n) {
        int res=1;
        if(n == 1|| n==0) {
            return 1;
        } else {
            for (int i = 1; i<=n ;i++) {
                res = i*res;
            }
            return res;
        }

    }
}
