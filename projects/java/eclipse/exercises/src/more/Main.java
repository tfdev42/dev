package more;
import more.PositiveNegativeZero;
import more.PoNeZe;

public class Main {

	public static void main(String[] args) {
		/*OtherClass otherObject = new OtherClass();
        otherObject.someMethod();*/
		
		//PositiveNegativeZero positiveNegativeZero = new PositiveNegativeZero();
		
		
		
		int number = 0;
		
		
		PositiveNegativeZero.checkNumber(number); // can't integrate as String because method is void
		
		System.out.printf("The Number %d is " + (PoNeZe.checkNumber(number)) + "\n", number); // can integrate because method is String = OK
		
		

	}

}
