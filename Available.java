import java.util.*;
import java.text.*;
import java.util.Locale;

public class Available {
    static public void main(String[] args) {
		int mLevel = 19;
        Locale list[] = DateFormat.getAvailableLocales();
        for (Locale aLocale : list) {
            System.out.println(aLocale.toString());
        }
        
        System.out.println(String.format( Locale.getDefault(), "Level %d", ++mLevel));
        System.out.println(String.format( Locale.getDefault(), "Math.pi %f", 3.14));
    }
}
