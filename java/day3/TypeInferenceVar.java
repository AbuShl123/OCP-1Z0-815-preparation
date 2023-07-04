package day3; 

public class TypeInferenceVar {
	public static void main(String[] args) {
		var number = 9; // from this ilne number is defined as int primitive type
		number = 7;
//		number = "Hello"; // DOES NOT COMPILE

//		var someObj = null; // DOES NOT COMPILE 
		// cannot assign var to 'null' because compiler cannot determine the type of someObj variable
		
		var stringObject = (String) null; // but we can do like this... 

		var n = 12; 
//		n = null; // DOES NOT COMPILE 
		// since the type of 'n' is primitive int it cannot point to null

		var numWrapper = (Integer) 12; 
		numWrapper = null; // however here it compiles 

		
//		var a = 2, b = 4; // DOES NOT COMPILE
		// it is not allowed to declare several variables inline with 'var' type
		// error message: 'var' is not allowed in a compound declaration

		int a = 2, b = 4; // this is works 

//		var question; // DOES NOT COMPILE --> the value of var should be initialized right away
		
	}


//	public void someMethod(var a, var b) {} // DOES NOT COMPILE --> remember 'var' is only allowed for local variables - not method or constructor parameters
}


// the following code compiles though!
class Var {
	public void var() {
		var var = "var";
 	}

 	public void Var() {
 		Var var = new Var();
 	}

	public static void main(String[] args) {

	}
 } 





