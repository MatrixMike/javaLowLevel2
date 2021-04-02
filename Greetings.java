import java.util.Scanner;
import java.util.*;
public class Greetings {

    public static void main(String[] args) {

        Scanner newscanner = new Scanner(System.in);

        String ask = getString(newscanner, "Please enter your first name: ");
// Order %d: %.2f %s sent
        // String ask2 = getString(newscanner, "Please enter your last name: ");

        // String ask3 = getString(newscanner, "Please enter your year of birth:
        // ");
        System.out.println("ask is " + ask);
  //      System.out.format("Order %d: %.2f  sent " , ask , 2.3 );
 // TODO        String.format(Locale.US,
  String.format(Locale.US,"Order %d: %.2f %s sent ", 19 , 3.2 , ask ) ;
  System.out.println(String.format(Locale.US,"Order %d: %.2f %s sent ", 19 , 3.2 , ask ) );
    }

    public static String getString(Scanner newscanner, String ask) {

        System.out.print(ask);

        String first = newscanner.next();

        String firstletter = first.substring(0, 1).toUpperCase();

        return firstletter;

    }

}
