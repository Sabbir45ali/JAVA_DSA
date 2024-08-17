public class butterFlyPattern {
  public static void main(String[] args) {
    int n = 4;
    // Upper Part
    for (int i = 1; i <= n; i++) {
      //Left part
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      int space = 2 * (n - i);
      //Spcae
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }
      //Right Part
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // Lowerpart
    for (int i = n; i >= 1; i--) {
      //Left part
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      int space = 2 * (n - i);
      //Space
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }
      //Right Part
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
