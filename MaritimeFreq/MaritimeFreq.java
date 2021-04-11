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

    public static void Add60range() {
/*
    public static List<GearRatios> createGearRatios() {
        List<GearRatios> RatiosList = new ArrayList<>();


*/

        System.out.println("6X range start");
        Stream.iterate(156025, n -> n + m7spacing).limit(9)  // setup for range for 6X
                .forEach(System.out::println);
        System.out.println("6X range end");
    }

    public static void Add70range() {
        System.out.println("7X range start");
        Stream.iterate(156525, n -> n + m7spacing).limit(10)  // setup for range for 7X
                .forEach(System.out::println);
        System.out.println("7X range end");
    }

    public static void Add80range() {
        System.out.println("8X range start");
        Stream.iterate(157025, n -> n + m7spacing).limit(9)  // setup for range for 7X
                .forEach(System.out::println);
        System.out.println("8X range end");
    }

    public static void Add00range() {
        System.out.println("0X range start");
        Stream.iterate(156050, n -> n + m7spacing).limit(19)  // setup for range for 7X
                .forEach(System.out::println);
        System.out.println("0X range end");
    }

    public static void Repeaters_range() {
        System.out.println("Repeaters start");
        Stream.iterate(157025, n -> n + mspacing).limit(5)  // setup for range for 7X
                .forEach(System.out::println);
        System.out.println("Repeaters end");
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
    private static final int m7spacing = 50;

    public static void main(String[] args) {
        Add00range();
        Add80range();
        Repeaters_range();
        Add70range();
        Add60range();
/*
    Stream.iterate(4764250, n -> n + tspacing).limit(35)
	.forEach(System.out::println);

*/

// frequency numbers below are kHz 
/*
	Stream.iterate(156000, n -> n + mspacing).limit(250)  // practical start 156025
	.forEach(System.out::println);	


*/


    }


}

