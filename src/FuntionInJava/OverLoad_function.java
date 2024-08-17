package FuntionInJava;

import java.util.Scanner;

public class OverLoad_function {
    static int multiply(int a,int b) {
        return a*b;
    }
    static double multiply(double a,double b) {
        return a*b;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        double a  = inp.nextInt();
        System.out.println("Enter the value of b : ");
        double b = inp.nextInt();
        double res = multiply(a,b);
        System.out.println(res);
    }
}
