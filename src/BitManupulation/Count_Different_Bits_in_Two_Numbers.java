//Write a function that counts the number of bits needed to convert integer A to integer B.
//Solution : https://youtube.com/watch?v=WVgYaucD1S4
public class Count_Different_Bits_in_Two_Numbers {
  public static int CountFlip(int a, int b) {
    int XorResult = a ^ b;
    int count = 0;
    while (XorResult != 0) {
      count += (XorResult & 1);
      XorResult = XorResult >> 1;
    }
    return count;
  }

  public static void main(String[] args) {
    int a = 443224, b = 523423;
    int ans = CountFlip(a, b);

    System.out.print("The counts the number of bits needed to convert integer A to integer B is : " + ans);
  }
}
