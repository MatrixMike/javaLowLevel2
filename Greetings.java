import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {

        Scanner newscanner = new Scanner(System.in);

        String ask = getString(newscanner, "Please enter your first name: ");

        // String ask2 = getString(newscanner, "Please enter your last name: ");

        // String ask3 = getString(newscanner, "Please enter your year of birth:
        // ");

    }

    public static String getString(Scanner newscanner, String ask) {

        System.out.print(ask);

        String first = newscanner.next();

        String firstletter = first.substring(0, 1).toUpperCase();

        return firstletter;

    }

}
