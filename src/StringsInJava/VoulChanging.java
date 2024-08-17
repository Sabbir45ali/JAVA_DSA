
// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”
import java.util.*;

public class VoulChanging {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter the string : ");
    String word = inp.next();
    String result = "";
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == 'e') {
        result += 'i';
      } else {
        result += word.charAt(i);
      }
    }
    System.out.println(result);
  }
}
