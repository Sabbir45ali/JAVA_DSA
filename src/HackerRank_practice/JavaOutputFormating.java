package HackerRank_practice;
import java.util.Scanner;

public class JavaOutputFormating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        while (scanner.hasNext()) {
            String inputString = scanner.next();
            int inputInteger = scanner.nextInt();
            System.out.printf("%-15s%03d%n", inputString, inputInteger);
        }
        System.out.println("================================");
        scanner.close();
    }
}