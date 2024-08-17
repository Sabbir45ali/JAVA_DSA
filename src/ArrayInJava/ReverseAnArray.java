package ArrayInJava;
import java.util.Arrays;
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,53,4,5,9};
        ReverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void ReverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            SwapArray(arr,start,end);
            start++;
            end--;
        }
    }
    static void SwapArray(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}