package SearchingAndShorting;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {87, 43, 39, 34, 9, 8, 5, 4, 3, 2};
        int target = 34;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int arr[], int target) {
        int start = 0; // Start index
        int end = arr.length - 1; // End index
        // Determine if the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];
        // Perform binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid; // Return the index if the target is found
            }
            if (isAsc) { // Ascending order
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Descending order
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Return -1 if the target is not found
    }
}