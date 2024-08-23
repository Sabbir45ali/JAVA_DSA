package SearchingAndShorting;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, -4, 1},
                {18, 12, 3, 9},
                {78, 99, 345, 56},
                {18, 12}
        };
        int target = 99;
        int[] ans = Search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Max(arr));
        System.out.println(Min(arr));
    }
    static int[] Search(int[][] arr, int target) {
        for (int i = 0 ;i<arr.length;i++) {
            for(int j = 0;j<arr[i].length;j++) {
                if (arr[i][j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    static int Max(int[][] arr) {
        int max = arr[0][0];
        for(int i =0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    static int Min(int[][] arr) {
        int min = arr[0][0];
        for(int i =0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
