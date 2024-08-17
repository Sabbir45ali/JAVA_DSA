package Loop_condition;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number - ");

        int user_number, rem;
        user_number = inp.nextInt();

        while (user_number != 0) {
            rem = user_number%10;
            System.out.print(rem);
            user_number = user_number /10;
        }
    }
}
