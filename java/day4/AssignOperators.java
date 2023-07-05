package day4; 

public class AssignOperators {
	public static void main(String[] args) {
		long goat = 5;
		int sheep = 4;
//		sheep = sheep * goat; // DOES NOT COMPILE
		sheep *= goat; // compiles!

		short a = 2;
		short b = 10;
		b += a+4; // compiles
		b = 0;
		b += 2.5 * 2;

		System.out.println(b);

		short c;

		System.out.println("Applying all variables to one value at a single line");
		a = b = c = 10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		boolean isInGoodMood = false;
		
		if (isInGoodMood = true) // tricky one , it compiles
			System.out.println("Good one, good");
		
		System.out.println(isInGoodMood);
	}
}