package lab.assignment.beforerefactoring;

public class NewCoffee extends CoffeeTemplate {
    @Override
    protected void finalTouch(){
        System.out.println("Add sugar and cream");
    }

    @Override
    protected void addIngredients(){
        System.out.println("Add more hot water");
    }
}
