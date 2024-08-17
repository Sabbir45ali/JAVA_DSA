package ArrayInJava;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = {10, 54, 78, 890, 73, 33};
        System.out.print("Before Swapping - ");
        System.out.println(Arrays.toString(arr));

        swap(arr,1,4);
        System.out.print("After swapping - ");
        System.out.print(Arrays.toString(arr));
    }
    static void swap(int[] arr, int indexA, int indexB) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;

    }
}
