import decorators.Chocolate;
import decorators.Milk;
import decorators.WhippedCream;
import products.CafeSpecial;
import products.Drink;
import products.Espresso;

public class Main {

    public static void main(String[] argv) {

        Drink espressoWithChocolateAndMilk = new Chocolate(new Milk(new Espresso()));

        System.out.println("espressoWithChocolateAndMilk description: " + espressoWithChocolateAndMilk.description());
        System.out.println("espressoWithChocolateAndMilk cost: " + espressoWithChocolateAndMilk.getCost());

        Drink cafeSpecialWithDoubleChocolateAndWhippedCream = new Chocolate(new Chocolate(new WhippedCream(new CafeSpecial())));

        System.out.println("cafeSpecialWithDoubleChocolateAndWhippedCream description: " + cafeSpecialWithDoubleChocolateAndWhippedCream.description());
        System.out.println("cafeSpecialWithDoubleChocolateAndWhippedCream cost: " + cafeSpecialWithDoubleChocolateAndWhippedCream.getCost());
    }
}
