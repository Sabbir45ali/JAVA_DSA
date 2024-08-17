import java.util.Scanner;

/**
 * LengthcalculateSB
 */
public class LengthcalculateSB {

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    
    System.out.print("Enter the size of string you want");
    int size = inp.nextInt();
    StringBuilder names = new StringBuilder();
    int toLenght = 0;
    
    for (int i =0 ;i <size ;i++) {
      String newNames = inp.next();
      names.append(newNames);
      toLenght += newNames.length();
    }
    System.out.println(toLenght);
  }
}