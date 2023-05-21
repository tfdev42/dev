package more;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

            // 1 mile per hour is 1.609 kilometers per hour
            
            if (kilometersPerHour < 0){
                return -1;
            }

            double calc = (long) kilometersPerHour / 1.609;

            return Math.round(calc);


        }
}
