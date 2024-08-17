// Given an array where every element appears twice except for one, find that single element.
//Solution : https://www.youtube.com/watch?v=C8o_CLCxohk

import java.util.*;

public class FindNon_RepeatingElement {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    int arr[] = { 1, 2, 6, 4, 6, 4, 1 };
    int res = arr[0];

    for (int i = 1; i < arr.length; i++) {
      res = res ^ arr[i];
    }
    System.out.println("The single element is : " + res);
  }
}
