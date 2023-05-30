package more;

public class FeetInchToCentimeter {
    
    public static double calcFeetInchToCentimeter(double feet, double inches) {
        double cm;
        
        if (feet <= 0 
        || inches <= 0 
        || inches >= 12) return -1;
        else{
            cm = feet * 30.48 + inches * 2.54;
        }
        return cm;
    }

    public static double calcFeetInchToCentimeter(double inches) {
        int feet;
        double newInches;
        
        if ( inches <= 0 ) return -1;
        else{
            feet = (int) inches / 12;
            newInches = inches % 12;
            double cm = calcFeetInchToCentimeter(feet, newInches);
            return cm;
        }
        

    }
}
