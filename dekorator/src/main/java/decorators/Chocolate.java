package decorators;

import products.Drink;

// chocolate is a decorator
// Thanks to decorators and decorated objects are of the same type, we can pass as an argument object (in constructor) which is already decorated instead of original (not decorated) object
public class Chocolate extends Drink {

    private Drink drink;  // drink is an object which we will decorate (with chocolate in this case). This object can be already decorated as well (Also of a type Drink).

    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    public String description() {
        return drink.description() +  ", Chocolate";
    }

    public double getCost() {
        return drink.getCost() + 0.5; //adding behaviour after delegating of getting cost from decorated object
    }
}
