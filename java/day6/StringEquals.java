package day6;

import java.util.*;

public class StringEquals {
	public static void main(String[] args) {
		String singleLine = "Hello World";
		String addedTwo = "Hello " + "World";
		String part = "Hello ";
		part += " World";

		System.out.println(singleLine == addedTwo); // true 
		System.out.println(singleLine == part); // false 

		int[] numbers = {1, 2, 3};

		int[] s1, s2; // both are arrays of type int[]
		s1 = new int[] {1,4};
		s2 = new int[5];
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
		
		int array[], number; // now only array[] is an array but a number is just an int
		number = 0;
		array = new int[] {10, 12};
		System.out.println(number);
		System.out.println(Arrays.toString(array));


		String[] strings = new String[3];
		Object[] objects = strings;
		String[] againStrings = (String[]) objects; 

//		againStrings[0] = new StringBuilder();	// DOES NOT COMPILE
		objects[0] = new StringBuilder(); 	// Careful!

 
	}
}