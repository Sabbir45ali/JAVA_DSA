public class rightHalfPiramid {
  public static void main(String[] args) {
    for (int i = 1; i <= 4; i++) {
      // For spaces
      for (int j = 1; j <= 4 - i; j++) {
        System.out.print(" ");
      }
      // For Stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}
