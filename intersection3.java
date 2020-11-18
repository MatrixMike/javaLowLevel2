/*
 * intersection3.java
 * https://www.baeldung.com/java-lists-intersection
 * Copyright 2020 Mike <mikeh@mikeh-OptiPlex-745>
 * 
 * 
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;
import java.util.*;
import java.util.stream.*;

public class intersection3 {
	
	public static void main (String[] args) {
		List<String> list = 		Arrays.asList("red", "blue", "blue", "green", "red");
		List<String> otherList = 	Arrays.asList("red", "green", "green", "yellow");


Set<String> result = list.stream()
  .distinct()
  .filter(otherList::contains)
  .collect(Collectors.toSet());
 
// Set<String> commonElements = new HashSet(Arrays.asList("red", "green"));
 
// Assert.assertEquals(commonElements, result);
	System.out.println("result = " + result);
	}
}
// output ; result = [red, green]

