/*
 * intersection2.java
 * 27.10.2020 14:34:00
 * https://www.programiz.com/java-programming/treeset
 */
import java.util.TreeSet;

public class intersection2 {
    public static void main(String[] args) {
		// Creating a tree set with customized comparator
        TreeSet<String> evenNumbers = new TreeSet<>(new CustomComparator());

        evenNumbers.add("Peach");        
        evenNumbers.add("Orange");
        evenNumbers.add("Apple");
        System.out.println("TreeSet1:a " + evenNumbers);
        System.out.println("TreeSet1:b " + evenNumbers.last());
        
        
        TreeSet<String> numbers = new TreeSet<>();
        numbers.add("Peach");
        numbers.add("Avocado");
        numbers.add("Strawberry");
        System.out.println("TreeSet2: " + numbers);

        // Intersection of two sets
        numbers.retainAll(evenNumbers);
        System.out.println("Intersection is: " + numbers);
    }
}


