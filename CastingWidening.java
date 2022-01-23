package mypackage;
//Widening casting is done automatically when passing a smaller size type to a larger size type:

public class CastingWidening {
	public static void main(String[] args) {
	    int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);
	    System.out.println(myDouble);
	  }
}
