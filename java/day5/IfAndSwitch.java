package day5; 

public class IfandSwitch {

	public static void main(String[] args) {
		int month = 3;

		switch (month) {
			case 1: 
				System.out.println("January"); 
				break;
			case 2: 
				System.out.println("February"); 
				break;
			case 1 | 2: // compiles but how??? 
				System.out.println("March"); 
				break;
			default: 
				System.out.println("No such month");
		}

		// the 1|2 in this case evaluates to 3 somehow although if we would place || instead of | then it would not compile 
		

		short mainValue = 15; 

		final int small = 10;
		final int big = 1_000_000;

		switch(mainValue) {
			case 3*5: 
				System.out.println("Fine, it's small enough to fit in short type");
				break;
			case small: 
				System.out.println("It is also fine, because small int is automatically demoted to short");
				break;
//			case big: break; // DOES NOT COMPILE --> the big int has a too large value that requires an explicit cast

			case (short) big:
				System.out.println("An explicit cast allows big to be used here");
				break;
				

		}	
	}
}