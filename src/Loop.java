import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number - ");
    int Num = input.nextInt();

    for (int i = 0 ; i<= 10; i++ ) {
      System.out.println(Num+"*"+i +"="+ Num*i);
    }
  }
}
