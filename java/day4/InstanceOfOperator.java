package day4;

public class InstanceOfOperator {
	public static void main(String... args) {
		Object nullObject = null;
		System.out.println(nullObject instanceof Object); // false
//		System.out.println(null instanceof null); // DOES NOT COMPILE
		System.out.println(null instanceof Number); // false

		// applying instanceof with null will always return false no matter what

		Animal animal = new Animal();

		Bird bird = new Bird();
	
		Owl owl = new Owl();

		Fish fish = new Fish();

		Plant plant = new Plant();

		Tree tree = new Tree();

		System.out.println("bird instanceof Animal = " + (bird instanceof Animal));
		System.out.println("fish instanceof Animal = " + (fish instanceof Animal));
		System.out.println("fish instanceof Fish = " + (fish instanceof Fish));
		System.out.println("bird instanceof Bird = " + (bird instanceof Bird));
		
//		System.out.println(bird instanceof Fish); // DOES NOT COMPILE
//		System.out.println(fish instanceof Bird); // DOES NOT COMPILE

		System.out.println("bird instanceof Flyable = " + (bird instanceof Flyable)); // true
		System.out.println("fish instanceof Flyable = " + (fish instanceof Flyable)); // false
		System.out.println("owl instanceof Flyable = " + (owl instanceof Flyable)); // true
		System.out.println("tree instanceof Flyable = " + (tree instanceof Flyable)); // false
 		System.out.println("plant instanceof Flyable = " + (plant instanceof Flyable)); // false
		// with interface it compiles though

		System.out.println("animal instanceof Bird = " + (animal instanceof Bird)); // false
		System.out.println("owl instanceof Bird = " + (owl instanceof Bird)); // true
		System.out.println("bird instanceof Owl = " + (bird instanceof Owl)); // false
		
		System.out.println("tree instanceof Plant = " + (tree instanceof Plant)); // true

	}
}

interface Flyable {}

class Animal {}

class Bird extends Animal implements Flyable{}

class Owl extends Bird {}

class Fish extends Animal {}

class Plant {}

class Tree extends Plant {}