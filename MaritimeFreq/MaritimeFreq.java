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
    static Integer ShipTx;
    static Integer LandTx;
    static Integer Channel;	
    
        MaritimeFreq(Integer ShipTxArg,
               Integer LandTxArg,
               Integer ChannelArg) {
        ShipTx = ShipTxArg;
        LandTx = LandTxArg;
        Channel = ChannelArg;
    }
    public static List<MaritimeFreq> createGearRatios() {
		List<MaritimeFreq> FrequencyList = new ArrayList<>();
	return FrequencyList;	
	}
/*
Add channel 6X - spacing 50 kHz - start 156.025  	160.625       60
* mspacing = 50
	Stream.iterate(156025, n -> n + mspacing).limit(250)  // practical start 156025
	.forEach(System.out::println);

*/
	
	
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

