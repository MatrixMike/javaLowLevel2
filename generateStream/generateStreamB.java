/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package generatestream;
/**
 * @version 1.1
 * @author Mike Hewitt
 */
/**
 * @param args the command line arguments
 */
/* public static void main(String[] args) {
 System.out.println("test");
 // TODO code application logic here
 }
 */
/*
 * generateStream.java
 * 24.08.2015 22:40:01
 * 16.06.2016   moved in from geany to Netbeans on Win7
compiled, execute and source/format (pretty print)
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Locale;
import java.util.stream.Stream;
import java.util.function.Predicate;
import java.util.function.LongPredicate;
/*
import java.util.stream.Collectors.*;
*/
//	private static class 4parms(int a, int b,int c,int d) {
//	}


 public class generateStreamB {  // was NOT a public class
/**
 * print from stream and lambda
 */
 	private static final int spacing = 250;
public static void Istream_from_function() {
			Predicate <Integer> badPrint = bp -> !((bp == 10) | (bp == 12) | (bp == 43)) ; // add 1,2,3
			// add 62,78,83,139,145,146,153
      Locale[] array = Locale.getAvailableLocales();
        Stream.iterate(1, n -> n + 1)
               // .limit(35)
              //  .skip(2)
              //  .filter(multip5)
                .filter(badPrint)		//seems to filter in a.o.t. filter out SO negate predicate above
                .limit(160)
                .forEach(System.out::println);  // change to print w/o a new line but a space between integers
                // array[i].getDisplayLanguage()
                // println or print 
               // .forEach(System.out::print(" ")); 
    }
    
public static void Cstream_from_function() {
			Predicate <String> badPrint = bp -> !((bp == "I") | (bp == "J") | (bp == "Q")) ; // add 1,2,3
			// add 62,78,83,139,145,146,153
      Locale[] array = Locale.getAvailableLocales();
        Stream.iterate("cd", c -> c + 1)  // want to generate characters from a to z
               // .limit(35)
              //  .skip(2)
              //  .filter(multip5)
                .filter(badPrint)		//seems to filter in a.o.t. filter out SO negate predicate above
                .limit(26)
                .forEach(System.out::println);  // change to print w/o a new line but a space between integers
                // array[i].getDisplayLanguage()
                // println or print 
               // .forEach(System.out::print(" ")); 
    }    
 public static void Dstream_from_function() {   
//	Predicate <String> badPrint = bp -> !((bp == "I") | (bp == "J") | (bp == "Q")) ; // add 1,2,3
    Predicate <Integer> CBchanRange1 = cb1 -> (cb1 < 4774000+1 );
    
/*    Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2);
	List<Integer> collect = infiniteStream
			.skip(3)
			.limit(5)
			.collect(Collectors.toList());
			System.out.println(collect);
*/			
			Stream<Integer> infiniteStream2 = Stream.iterate(4764250, i -> i + spacing)
			//			.filter(CBchanRange1)
						.limit (20);
			List<Integer> collect2 = infiniteStream2
		//	.skip(3)
		//	.limit(5)
			.filter(CBchanRange1)
			.collect(Collectors.toList());
			System.out.println(collect2);
			Collections.reverse(collect2);
			System.out.println(collect2);
		}
/**
 * 
 * @param args info from command line
 * 
 */
public static void main(String args[]) {
 //       Istream_from_function();
 //       Cstream_from_function();
        Dstream_from_function();
    }
}
