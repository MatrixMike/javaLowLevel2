/*
 * Tester.java
 * 03.11.2020 23:34:07
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Tester {
   public static void main(String args[]) {
      String[] array = {"a", "b", "c", "d", "e"};

      //Method 1
      List<String> list3 = Arrays.asList(array);          
      System.out.println(list3);

      //Method 2
      List<String> list1 = new ArrayList<String>();
      Collections.addAll(list1, array);
      System.out.println(list1);

      //Method 3
      List<String> list2 = new ArrayList<String>();
      for(String text:array) {
         list2.add(text);
      }
      System.out.println(list2);
   }  
}

