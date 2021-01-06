package decorators;

import products.Drink;

public class WhippedCream extends Drink {

    private Drink drink;

    public WhippedCream(Drink drink) {
        this.drink = drink;
    }

    public String description() {
        return drink.description() + ", Whipped Cream";
    }

    public double getCost() {
        return drink.getCost() + 0.1;
    }
}
