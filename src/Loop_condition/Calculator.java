package Loop_condition;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N1, N2, res = 0;
        char Op ;
        System.out.print("Enter the first number: ");
        N1 = inp.nextInt();
        System.out.print("Enter the second number: ");
        N2 = inp.nextInt();
        System.out.print("Enter the operation you want to perform: ");
        Op = inp.next().charAt(0);
        if(Op == '+') {
            res = N1+N2;
        } else if (Op == '-') {
            res = N1-N2;
        } else if (Op == '*') {
            res = N1*N2;
        } else if (Op == '/') {
            res = N1/N2;
        } else {
            System.out.println("This is not a valid operation.");
        }
        System.out.print("The result is: ");
        System.out.print(res);
    }
}