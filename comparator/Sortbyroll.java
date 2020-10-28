
import java.util.*; 
//import java.lang.*; 
//import java.io.*;

class Sortbyroll implements Comparator<Student> 
{ 
	// Used for sorting in ascending order of 
	// roll number 
	public int compare(Student a, Student b) 
	{ 
		return a.rollno - b.rollno; 
	} 
}

/*
 * class Sortbyheight implements Comparator<Student> 
{ 
	// Used for sorting in ascending order of 
	// roll number 
	public double compare(Student a, Student b) 
	{ 
		return a.height - b.height; 
	} 
}
*/
