package decorators;

import products.Drink;

public class Milk extends Drink {

    private Drink drink;

    public Milk(Drink drink) {
        this.drink = drink;
    }

    public String description() {
        return drink.description() + ", Soy milk";
    }

    public double getCost() {
        return drink.getCost() + 0.3;
    }
}
