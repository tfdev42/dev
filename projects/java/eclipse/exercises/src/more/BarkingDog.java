package more;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        
        if ((hourOfDay < 0) || (hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24)) return false;


    }
}
