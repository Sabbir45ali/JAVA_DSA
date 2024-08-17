package FuntionInJava;
import java.util.*;

public class Concatination {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter you first name - ");
        String firstName = inp.nextLine();
        System.out.print("Enter your last name - ");
        String lastName = inp.nextLine();

        String fillName = Concatinate(firstName,lastName);
        System.out.println("Your full name is " + fillName);
    }

    static String Concatinate(String str1, String str2) {
        String res = (str1 + " " + str2);
        return res;
    }
}
