/*
 * Friday13.java
 *
 * Copyright 2015 Michael Hewitt <mikeh@electroteach.com>
 * 11 November 2015
 * Obviously did not get changed to reflect the title, see Friday13.java
 * Some code here that does not work correctly over year boundaries
 */
 /*
 DAY_OF_WEEK was 3 = Tuesday ; 5 =Thursday
 */
// package Friday13;   removed to make compile and run
import java.util.stream.LongStream;
import java.text.SimpleDateFormat;
import java.util.*;
import static java.lang.System.out;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_YEAR;
import java.util.EnumSet;
//import static java.time.DayOfWeek;
//import static java.time.DayOfWeek;
//import static final DayOfWeek FRIDAY;

public class ChristmasDaysTo {

//public class xmas {
    public  static ArrayList<String> xmas2() {
		ArrayList<String> dateList = new ArrayList<String>();
//		String x = valueOf("FRIDAY");
        Calendar cldr = Calendar.getInstance ();  // change 'M' - MM -> 2 digits; MMM -> 3 letters
        Integer cnt =1;
        Calendar cldr_now;
        cldr.add (DAY_OF_YEAR, -100);
        SimpleDateFormat dateformatter = new SimpleDateFormat ("dd-MMM-yyyy");  // ("dd-MM-yyyy E 'at' hh:mm:ss a zzz");
        String testStr;
        long next13th = 99;
//	testStr = "fred";
        int daysAhead = 2500;
        out.println ("Next Friday the thirteenth is on");
        // change to boolean
        int first_time_through = 0;
        for (long n = -cldr.get (DAY_OF_MONTH); n < daysAhead; n = n + 1) {  // n was int now long
            // find current first of month
            // F13 -> 13, 6
            // Monday 9 -> 9, 2
            if ((cldr.get (DAY_OF_MONTH) == 13) &&
                    (cldr.get (Calendar.DAY_OF_WEEK) == 6)) { // was == 6 , want to use FRIDAY
                testStr = dateformatter.format (cldr.getTime ());
                out.print (cnt);
                out.print (" ");
                out.print (testStr);
                out.print (" p1 ");
                dateList.add(testStr);
                cnt++;
                if (first_time_through == 0) {
                    cldr_now = Calendar.getInstance ();
                    int dateDiff = (cldr.get (DAY_OF_YEAR) - cldr_now.get (DAY_OF_YEAR));
                    out.print (" which is in " + dateDiff + " days. ");
                    first_time_through++;
                    // save n and calculate difference between n and today -> i.e. n
                    // display as a
                    next13th = n;
                    out.println (" next 13 is " + next13th + " DOM " + cldr.get (DAY_OF_MONTH));
                }
                out.println ();
            }
            cldr.add (DAY_OF_YEAR, +1);

        }
//	 System.out.println("Number of dates found is "+first_time_through);  // wrong - bug
//	System.out.println(factorialStreamsMJH(16));
//	System.out.println(EventsWithStreams(300));
//		out.print(dateList);
		            return dateList;
    }

    public  static long factorialStreamsMJH(long n){
	//	StringBuilder sb = new StringBuilder;
        return LongStream.rangeClosed(1, n)   //  was (1,31)

	//	.filter( w -> (w % 2) ==1  )  // filter out those numbers from the modulus
		.filter( w -> (w % 3) ==0  )  // pass through  Fizz 3
		.filter( w -> (w % 5) ==0  )  // pass through  Buzz 5  thus together finds FizzBuzz
//		.collect(Collector.toList());
        //.skip(3)
        .reduce(0, (long a, long b) -> a + b);
      //  System.out.print( "number " + n);
    }

    public  static long EventsWithStreams(long n){

	//	StringBuilder sb = new StringBuilder;
        return LongStream.rangeClosed(1, n)   //  was (1,31)

	//	.filter( w -> (w % 2) ==1  )  // filter out those numbers from the modulus
		.filter( w -> (w % 3) ==0  )  // pass through  Fizz 3
		.filter( w -> (w % 5) ==0  )  // pass through  Buzz 5  thus together finds FizzBuzz
//		.collect(Collector.toList());
        //.skip(3)
        .reduce(0, (long a, long b) -> a + b);
      //  System.out.print( "number " + n);
    }

	public static void main(String[] args){
		ArrayList <String> main1 = xmas2();
		out.println(main1);
		out.println();
		out.println(factorialStreamsMJH(30));

		out.println();
		out.println(EventsWithStreams(30));
	}
//}
}
