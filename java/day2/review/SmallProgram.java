package day2.review; 

public class SmallProgram {
	public static void main(String[] args) {
		int i = 2;
		int j = 1;
		System.out.println("Multiplication Table");
		for (; i < 10;  i++) {
			for (; j <= 10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}
}