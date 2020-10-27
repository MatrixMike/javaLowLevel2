// Creating a comparator class
import java.util.TreeSet;
import java.util.Comparator;
    public class CustomComparator implements Comparator<String> {

//        @Override
        public int compare(String animal1, String animal2) {
            int value =  animal1.compareTo(animal2);

            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
