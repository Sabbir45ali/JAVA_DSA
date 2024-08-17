package FuntionInJava;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = inp.nextInt();
        boolean res = isEven(num);
        System.out.println(res);
    }
    static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
