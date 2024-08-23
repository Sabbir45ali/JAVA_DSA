package SearchingAndShorting;

import java.sql.SQLOutput;

public class SearchInString {
    public static void main(String[] args) {
        char[] data = {'S','a','b','b','i','r'};
        String str = new String(data);
        char target = 'i';
        System.out.println(Search(data,target));
    }
    static int Search(char[] data, char target) {
        for (int i = 1; i<data.length;i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
