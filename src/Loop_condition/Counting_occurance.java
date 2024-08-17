package Loop_condition;
import java.util.*;

public class Counting_occurance {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int user_number,find_number,rem,count=0;
        System.out.print("Enter a number - ");
        user_number = inp.nextInt();
        System.out.print("Enter the number which you want to find - ");
        find_number = inp.nextInt();

        while (user_number > 0) {
            rem = user_number%10;
            if (rem == find_number) {
                count++;
            }
            user_number = user_number/10;
        }
        System.out.println("There is " + count + " times " + find_number);
    }
}
