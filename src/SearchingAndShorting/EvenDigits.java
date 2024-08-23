package SearchingAndShorting;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int digCount = FindEven(arr);
        System.out.println(digCount);
    }
    static int FindEven(int[] arr) {
        int count=0,len=0;
        for(int i =0;i<arr.length;i++){
            while (arr[i]!=0) {
                arr[i]/=10;
                len++;
            }
            if(len%2 == 0) {
                count++;
            }
            len=0;
        }
        return count;
    }
}
