package inheritance;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    

    public Animal() {
    }

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public void eat(){
        System.out.println("Animal.eat() called");

    }

    public void move(int speed) {
        System.out.printf("Animal.move() called. Animal is moving at %d speed%n", speed);
    }

    public void showInfo(){
        System.out.println();
        System.out.println("Name is " + getName());
        System.out.println("Brain is " + getBrain());
        System.out.println("Body is " + getBody());
        System.out.println("Size is " + getSize());
        System.out.println("Weight is " + getWeight());
    }
    

    
    

    
}
