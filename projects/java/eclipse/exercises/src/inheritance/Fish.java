package inheritance;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles() {
        System.out.println("Fish.moveMuscles() called");
        
    }

    private void moveBackFin() {
        System.out.println("Fish.moveBackFin() called");
        
    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        System.out.printf("Fish.swim () called. Swims at %d speed%n", speed);
        super.move(speed);    
    }

    @Override
    public void move(int speed) {
        swim(speed);
    }

    

    
    
}
