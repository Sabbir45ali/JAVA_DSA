package ArrayInJava;
import java.lang.reflect.Array;
import java.util.*;
import java.util.*;

public class ArrayInput {
    public static void main(String[] args) {
        int []arr = new int[10];
        Scanner inp = new Scanner(System.in);
        inp.close();
        System.out.println("Enter 10 numbers - ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = inp.nextInt();
        }

//        for(int num : arr) {
//            System.out.print(num+" ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}
