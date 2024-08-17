package Loop_condition;
import java.util.Scanner;
public class Alphabet_case_check {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a character: ");

        char ch = inp.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase alphabet");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase alphabet");
        } else {
            System.out.println("Not an alphabet");
        }
    }
}