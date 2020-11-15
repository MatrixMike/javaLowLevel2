//import android.os.Build;
//import androidx.annotation.RequiresApi;
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

/*
 * CBnew1.java
 * 
 * Copyright 2020 Michael <mikeh@mikeh-K52N>
 * 
 */


public class CBnew1 {
	private static final int spacing = 250;	

public static void main (String[] args) {
	createflista();
	System.out.println("" + flista);
//	System.out.println("" + collect);
	}

//@RequiresApi(api = Build.VERSION_CODES.N)
//public class CBfreqUHF {

//	public static void main (String args[]) {
		Integer channelArg;
		Integer frequencyArg;
		CBnew1(Integer channel, Integer frequency){
			channelArg = channel;
			frequencyArg = frequency;
		};
	public static List<CBnew1> flista = new ArrayList<> ();
	public static List<CBnew1> createflista() {
		flista.add(
			new CBnew1 (1,4764250));
		return flista;
	}
//		int ch ;	//= 1;
	Predicate <Integer> badPrint = bp -> !((bp == 10) | (bp == 12) | (bp == 43)) ; // add 1,2,3
	Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2);
	Stream<Integer> infiniteStream2 = Stream.iterate(4764250, i -> i + spacing).limit (20);
	List<Integer> collect = infiniteStream
			.skip(3)
			.limit(5)
			.collect(Collectors.toList());
//	Stream.iterate(4764250, n -> n + spacing).limit(35);
/*        Stream.iterate(1, n -> n + 1)
			// .limit(35)
			//  .skip(2)
			//  .filter(multip5)
			.filter(badPrint)		//seems to filter in a.o.t. filter out SO negate predicate above
                .limit(160)
                .forEach(System.out::println);*/
/*	Stream<Integer> = Stream.iterate(4764250, n -> n + spacing)
			.limit(160)
		.forEach(System.out::println);*/


		Map<Integer, String> map = new HashMap<>();
//		for (int i = 4764250; i < 4774000+1; i=i+spacing) {
//		map.putIfAbsent(i, "M ch  F = " + i);
//		}

/*		int ch = 1;
		for (int i = 4764250; i < 4774000+1; i=i+(spacing)) {
			map.putIfAbsent(i, "M ch " + ch + " F = " + i );
			ch = ch + 1;
		}*/

/*		ch = 1;
		for (int i = 4764250; i < 4774000+1; i=i+(spacing)) {
			map.putIfAbsent(i, make1(ch,i) );
			ch = ch + 1;
		}*/
	 	//xxm  map.forEach((id1, val) -> System.out.println(val));
//	strCreate.make1(ch,x)	 	
	 	
/*		ch = 1;
		for (int x = 4764250; x < 4774000+1; x=x+spacing) {
//			System.out.println("M ch "+ ch + " F = " + x/10000 + "." + x%10000 +"MHz");
			System.out.println(make1(ch,x));    // 12-11-2020   was 			System.out.println(strCreate.make1(ch,x));
			ch = ch + 1;
		}*/
//	System.out.println("\n===");
			
/*		ch = 41;
		for (int x = 4764375; x < 4769125+1; x=x+spacing) {
//			System.out.println("M ch "+ ch + " F = " + x/10000 + "." + x%10000 +"MHz");
			System.out.println(make1(ch,x));
			ch = ch + 1;
		}*/
//	System.out.println("\n===");
/*			ch = 64;
		for (int x = 4770125; x < 4774125+1; x=x+spacing) {
//			System.out.println("M ch "+ ch + " F = " + x/10000 + "." + x%10000 +"MHz");
			System.out.println(make1(ch,x));
			ch = ch + 1;
		}
	}*/

	public 	static String make1 (int chn, int f ){
		String message1 = "";
		//int f = 156025;
		//return message1; // return sb1;   work done to create sb1
		return message1 + "M ch " +
				chn +
				" F = " +
				f / 10000 +
				"." +
				f % 10000 +
				"MHz\n";
	}
}



	
