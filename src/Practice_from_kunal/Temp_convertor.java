package Practice_from_kunal;

import java.util.Scanner;

public class Temp_convertor {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the temperature which you want to convert to(C/F): ");
        char unit = inp.next().charAt(0);
        float res = 0;
        if (unit == 'C') {
            System.out.println("Enter the celcuous vale - ");
            int c = inp.nextInt();
            res = ((c*9/5)+32);
        } else if (unit == 'F') {
            System.out.println("Enter the farenhite vale - ");
            int f = inp.nextInt();
            res = (32*f - 32)* 5/9;
        } else {
            System.out.println("Please enter C or F in capital letter");
        }
        System.out.println("The result of this conversion is - "+ res);
    }
}
