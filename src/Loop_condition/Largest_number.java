package Loop_condition;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter A - ");
        int a = inp.nextInt();
        System.out.print("Enter B -");
        int b = inp.nextInt();

        if (a > b) {
            System.out.println("A is greater than B");
        } else if (a == b) {
            System.out.println("A and B is same");
        } else {
            System.out.println("B is greater than A");
        }
    }
}
