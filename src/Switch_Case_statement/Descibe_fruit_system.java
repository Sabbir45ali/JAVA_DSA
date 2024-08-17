package Switch_Case_statement;

import java.util.Scanner;

public class Descibe_fruit_system {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter which fruit you wanna know");
        String fruit = inp.next();

        switch (fruit) {
            case "apple" :
                System.out.println("This is a sweet and red fruit");
                break;
            case "orange" :
                System.out.println("This is a tangy anf orange fruit");
                break;
            case "banana" :
                System.out.println("This is a yellow and soft fruit");
                break;
            case "grape" :
                System.out.println("This is a sweet and sour fruit");
                break;
            default:
                System.out.println("Invalid fruit");
        }
    }
}
