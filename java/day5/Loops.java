package day5; 

public class Loops {
	public static void main(String[] args) {
		int x = 0;
		for (int y = 9; x < 10; x++, y--) System.out.println(x + "\t" + y);

		// to the previous for loop, if to change the initialization block to: int y = 9, x = 1; the code would not compile.

		for (String name : new String[]{"Abu", "Sally", "Keith"}) 
			System.out.print(name + ", ");
	}
}