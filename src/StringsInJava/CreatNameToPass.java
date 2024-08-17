import java.util.Scanner;

public class CreatNameToPass {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter the Email : ");
    String Mail = inp.next();
    String res = "";

    for (int i = 0;i<Mail.length();i++) {
      if (Mail.charAt(i) == '@') {
        break;
      } else {
        res = res+Mail.charAt(i);
      }
    }
    System.out.print(res);
  }
}
