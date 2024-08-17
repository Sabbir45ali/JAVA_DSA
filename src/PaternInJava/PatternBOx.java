import java.util.Scanner;

public class PatternBOx {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter how many stars you need in row - ");
    int col = inp.nextInt();

    System.out.print("Enter how many stars you need in column - ");
    int row = inp.nextInt();
    
    for (int i = 1 ; i<= col ; i++) {
      for(int j = 1 ; j<= row ; j++) {
        System.out.print("* ");
      }
      System.out.println(" ");
    }
  }
}
