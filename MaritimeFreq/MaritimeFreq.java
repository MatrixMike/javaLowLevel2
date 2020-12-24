/*
 * MaritimeFreq.java
 * 
 * Copyright 2020 Mike <mike@tecra>
 * 
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Predicate;

public class MaritimeFreq {
	
	private static final int tspacing = 250;	
	private static final int mspacing = 25;
		
	public static void main (String[] args) {
		
		
/*
	Stream.iterate(4764250, n -> n + tspacing).limit(35)
	.forEach(System.out::println);

*/

// frequency numbers below are kHz 
	Stream.iterate(156000, n -> n + mspacing).limit(250)  // practical start 156025
	.forEach(System.out::println);	
	
	}
}

