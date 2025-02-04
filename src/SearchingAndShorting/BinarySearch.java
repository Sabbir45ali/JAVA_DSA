package SearchingAndShorting;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,8,9,34,39,43,87};
        int target = 3;
        int ans = Search(arr,target);
        System.out.println(ans);
    }
    static int Search(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(arr[mid] > target) {
                end = mid-1;
            } else if(arr[mid] < target) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}