package more;

public class FeetInchToCentimeter {
    
    public static double calcFeetInchToCentimeter(double feet, double inches) {
        
        if (feet < 0 
        || inches < 0 
        || inches > 12){return -1;}
        else{
            double cm = feet * 30.48 + inches * 2.54;
            return cm;
        }
    }
}
