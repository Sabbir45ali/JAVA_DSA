package SearchingAndShorting;

public class MAX_MIN_Search {
    public static void main(String[] args) {
        int[] arr = {1,-2,52,26,894,6548,78};
        System.out.println(MIN(arr));
    }
    static int MAX(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int MIN(int[] arr) {
        int min = arr[0];
        for(int i = 1; i<arr.length;i++) {
            if(min>arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
