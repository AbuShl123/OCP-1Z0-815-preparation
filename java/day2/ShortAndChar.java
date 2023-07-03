package day2; 

public class ShortAndChar {
	public static void main(String[] args) {
		short number = 'd'; 
		char letter = (short) 100;

		System.out.println(number); // prints 100
		System.out.println(letter); // prints 'd'

		// 'd' = 100
		// 100 = 'd' 

		char ex2 = (short) 83; 
		System.out.println(ex2); // this prints 'S' because 83 is a unicode of character 'S' in ASCII table 


		// however the following does not compile: 
		// short reptile = 65535; 
		// char fish = (short)-1;

		char ex3 = 65535; // this line compiles though 
		// because since the char does not contain negative values its range of positive values is much higher than the range of positive values that 'short' type comprises
		System.out.println(ex3); 

		short negativeNum = -5; 
		System.out.println(negativeNum);
	}
}