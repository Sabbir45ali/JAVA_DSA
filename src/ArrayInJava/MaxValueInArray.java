package ArrayInJava;

public class MaxValueInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,399,65,7};

        int res = MaxVal(arr);
        System.out.println(res);
    }
    static int MaxVal(int[] arr) {
        int max = arr[0];
        for (int i = 0; i< arr.length -1 ; i++) {
            if (arr[0] < arr[i]) {
                arr[0] = arr[i];
            }
        }
        return arr[0];
    }
}
