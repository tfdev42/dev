package more;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        // 1 mile per hour is 1.609 kilometers per hour
        
        if (kilometersPerHour < 0){
            return -1; //TODO: this should actually return "Invalid Value" and not -1 as value...
        }

        double calc = kilometersPerHour / 1.609;

        return (long)Math.round(calc);

    }

    public static void printConversion(double kilometersPerHour) {
        System.out.printf(kilometersPerHour + " km/h = %d mi/h\n", SpeedConverter.toMilesPerHour(kilometersPerHour));
    }
    // public static void printConversion(double kilometersPerHour) {
    //     System.out.println(kilometersPerHour + "");
    // }


}
