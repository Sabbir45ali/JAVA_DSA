package SearchingAndShorting;
//https://leetcode.com/problems/richest-customer-wealth/description/
public class WealthChecker {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3}, {1,9,5}};
        int max = maximumWealth(accounts);
        System.out.println(max);
    }
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] account : accounts){
            int sum = 0;
            for(int i = 0; i < account.length; i++){
                sum += account[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}

