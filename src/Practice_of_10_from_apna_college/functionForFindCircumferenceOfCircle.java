package Practice_of_10_from_apna_college;
import java.util.Scanner;
/**
 * functionForFindCircumferenceOfCircle
 */
public class functionForFindCircumferenceOfCircle {

  public static float circumfacesOfCircle(float radius) {
    float Circumfance = 2*3.14f*radius;
    return Circumfance;
  }
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter the radius of a circle - ");
    float radius = inp.nextFloat();

    float Circumfance = circumfacesOfCircle(radius);
    System.out.println("The circumfances of this circle is - "+Circumfance);
  }
}