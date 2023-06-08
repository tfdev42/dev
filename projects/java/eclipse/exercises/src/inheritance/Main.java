package inheritance;

public class Main {
    public static void main(String[] args) {
        
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Golden Retreaver", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat(); // method from Super Class Animal
        dog.walk();
        dog.run();
        System.out.println();

        Fish fish = new Fish("Gold Fish", 2, 2, 2, 2, 5);
        fish.eat();
        fish.move(3);


    }
}
