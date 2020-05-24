package lab.assignment.beforerefactoring;

public class CapuccinoCoffee extends lab.assignment.beforerefactoring.CoffeeTemplate {
    @Override
    protected void finalTouch(){
        System.out.println("Top with milk foam");
    }

    @Override
    protected void addIngredients(){
        System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }
}
