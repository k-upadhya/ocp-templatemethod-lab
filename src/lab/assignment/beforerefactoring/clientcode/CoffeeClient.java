package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.CoffeeTemplate;
import lab.assignment.beforerefactoring.MochaCoffee;
import lab.assignment.beforerefactoring.CapuccinoCoffee;
import lab.assignment.beforerefactoring.NewCoffee;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeTemplate coffeeType = new MochaCoffee();
        coffeeType.prepareCoffee();

        System.out.println("********************");

        coffeeType = new CapuccinoCoffee();
        coffeeType.prepareCoffee();

        System.out.println("********************");

        coffeeType = new NewCoffee();
        coffeeType.prepareCoffee();

    }

}
