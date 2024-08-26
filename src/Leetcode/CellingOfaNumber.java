package Leetcode;

public class CellingOfaNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,13,15,16,17,18};
        int target = 6;
        int ans = Celling(arr,target);
        System.out.println(ans);
    }
    static int Celling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return mid;
            } else if(target < arr[mid]){
                end = mid-1;
            } else if(target > arr[mid]) {
                start = mid+1;
            }
        }
        return start;
    }
}
