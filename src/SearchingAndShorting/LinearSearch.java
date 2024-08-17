package SearchingAndShorting;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,5,6,7,8,9,10};
        int targer = 9;
        int ans = search(arr,targer);
        System.out.print(ans);
    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}




