public class Main {

    public static void main(String[] args) {
//        Exercise 73: Product
//        Create a class Product that represents a product sold in a webshop. A product has a price, amount and name.
//        A constructor public Product(String nameAtStart, double priceAtStart, int amountAtStart)
//        A method public void printProduct()
        Product Banana = new Product("Banana", 1.1, 13);
        Banana.printProduct();

//        Exercise 74: Multiplier
//        Implement the class Multiplier that has:
//        a constructor public Multiplier(int number).
//        a method public int multiply(int otherNumber) that returns otherNumber multiplied by number (i.e., the constructor parameter).
        Multiplier threeMultiplier = new Multiplier(3);
        System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));
        Multiplier fourMultiplier = new Multiplier(4);
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));
        System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
        System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));

//        Exercise 75.1: Implementing method decrease()
//        Implement the method decrease() so that when called, the object variable this.value is decreased by one.
//        When this is done, your program should work as the example above.
        DecreasingCounter counter = new DecreasingCounter(10);
        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.decrease();
        counter.printValue();

//        Exercise 75.2: Value remains positive
//        Change your implementation of the method decrease() so that the value of the counter will not drop below zero.
//        If the method is called when the value is zero, nothing should happen:
        DecreasingCounter below = new DecreasingCounter(2);
        below.printValue();
        below.decrease();
        below.printValue();
        below.decrease();
        below.printValue();
        below.decrease();
        below.printValue();

//        Exercise 75.3: Counter reset
//        Implement the method public void reset() that sets the value of the counter to zero.
        DecreasingCounter reserter = new DecreasingCounter(100);
        reserter.printValue();
        reserter.reset();
        reserter.printValue();
        reserter.decrease();
        reserter.printValue();

//        Exercise 75.4: Back to initial value
//        Implement the method public void setInitial(), which returns the counter to its initial value:
        DecreasingCounter init = new DecreasingCounter(100);
        init.printValue();
        init.decrease();
        init.printValue();
        init.decrease();
        init.printValue();
        init.reset();
        init.printValue();
        init.setInitial();
        init.printValue();

//        Exercise 76.1: Adding a meal to menu
//        Implement the method public void addMeal(String meal) that adds a new meal to the list this.meals of a Menu object.
//        If the meal is already in the list, it should not be added.
        Menu burgerKing = new Menu();
        burgerKing.addMeal("Fries");
        burgerKing.addMeal("Whopper");
        burgerKing.addMeal("Fries");
        burgerKing.addMeal("Shake");

//        Exercise 76.2: Printing the menu
//        Implement the method public void printMeals() that prints the meals in a menu.
        burgerKing.printMeals();

//        Exercise 76.3: Clearing a menu
//        Implement the method public void clearMenu() that clears a menu.
//        After calling this method, the menu should be empty.
        burgerKing.clearMenu();
        burgerKing.printMeals();
    }
}
