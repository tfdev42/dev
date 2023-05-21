package more;
// import more.PositiveNegativeZero;
//import more.PoNeZe;

public class Main {

	public static void main(String[] args) {
		/*OtherClass otherObject = new OtherClass();
        otherObject.someMethod();*/
		
		//PositiveNegativeZero positiveNegativeZero = new PositiveNegativeZero();
		
		
		
		int num = 0;
		
		System.out.printf("The Number %d is ", num);
		PositiveNegativeZero.checkNumber(num); // can't integrate directly as String in Print because method is void


		// PositiveNegativeZero positiveNegativeZero = new PositiveNegativeZero();
		// positiveNegativeZero.checkNumber(num);
		// System.out.println("positiveNegativeZero: " + positiveNegativeZero);

		// String checkedNumber = "" + positiveNegativeZero;
		// System.out.println(checkedNumber);



		
		System.out.printf("The Number %d is " + (PoNeZe.checkNumber(num)) + "\n", num); // can integrate because method is String = OK
		
		

	}

}
