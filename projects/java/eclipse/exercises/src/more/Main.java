package more;
// import more.PositiveNegativeZero;
//import more.PoNeZe;

public class Main {

	public static void main(String[] args) {
		/*OtherClass otherObject = new OtherClass();
        otherObject.someMethod();*/
		int num = 0;
		
		System.out.printf("The Number %d is ", num);
		PositiveNegativeZero.checkNumber(num); // can't integrate directly as String in Print because method is void
		// PositiveNegativeZero positiveNegativeZero = new PositiveNegativeZero();
		// positiveNegativeZero.checkNumber(num);
		// System.out.println("positiveNegativeZero: " + positiveNegativeZero);

		// String checkedNumber = "" + positiveNegativeZero;
		// System.out.println(checkedNumber);
		System.out.printf("The Number %d is " + (PoNeZe.checkNumber(num)) + "\n", num); // can integrate because method is String = OK
		
		

		// ***************************************************

		System.out.println("Speedconverter");
		System.out.println(SpeedConverter.toMilesPerHour(1.5));
		System.out.println(SpeedConverter.toMilesPerHour(10.25));
		System.out.println(SpeedConverter.toMilesPerHour(-5.6));
		System.out.println(SpeedConverter.toMilesPerHour(25.42));
		System.out.println(SpeedConverter.toMilesPerHour(75.114));
		System.out.println();
		SpeedConverter.printConversion(1.5);
		SpeedConverter.printConversion(10.25);
		SpeedConverter.printConversion(-5.6);
		SpeedConverter.printConversion(25.42);
		SpeedConverter.printConversion(75.114);
		System.out.println();



		// ***************************************************

		System.out.println("MegabytesConverter");
		MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
		MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
		MegaBytesConverter.printMegaBytesAndKiloBytes(5000);


	}

}
