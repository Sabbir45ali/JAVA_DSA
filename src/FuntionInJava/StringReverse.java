package FuntionInJava;

public class StringReverse {
    public static void main(String[] args) {
        String name = "sabbir";
        reverseString(name);
    }
    static void reverseString(String s) {
        for (int i = s.length()-1;i >= 0;i--) {
            System.out.print(s.charAt(i));
        }
    }
}
