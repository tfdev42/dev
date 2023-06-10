package inheritance.covariantReturnType;

public class Main {
    
}

class Burger {
    // fields + methods
}

class HealthyBurger extends Burger {
    // fields + methods
}

class BurgerFactory{

    public Burger createBurger() {
        return new Burger();
    }
}

class HealthyBurgerFactory extends BurgerFactory {

    @Override
    public HealthyBurger createBurger() {
        return new HealthyBurger();
    }
}
