// Take an array of names as input from the user and print them on the screen
package ArrayInJava;
import java.util.Scanner;
/**
 * inputArray
 */
public class inputArray {

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter the size of Names you want :- ");
    int size = inp.nextInt();

    String name[] = new String[size];
    //Input
    for(int i=0;i<size;i++) {
      name[i] = inp.next();
    }

    //Output
    for(int i=0;i<name.length;i++){
      System.out.println("Name of "+(i+1)+" index is - "+name[i]);
    }
  }
}