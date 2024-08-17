package SearchingAndShorting;

public class LinearSearchUsingForEach {
  public static void main(String[] args) {
    int[] arr = { 1, 25, 458, 45, 254, 78, 35, 5 };
    int target = 45;
    boolean ans = Search(arr, target);
    if (ans) {
      System.out.println("Item found");
    } else {
      System.out.println("Item not found");
    }
  }

  static boolean Search(int[] arr, int target) {
    if (arr.length == 0) {
      return false;
    }
    for (int element : arr) {
      if (element == target) {
        return true;
      }
    }
    return false;
  }
}
