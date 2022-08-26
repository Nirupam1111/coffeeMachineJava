package CoffeeMechine;

public class MilkCoffee extends Coffee {

    public MilkCoffee() {
        super();
        this.coffeePowder = 10;
        this.water = 90;
        this.sugar = 25;
        this.milk = 30;
        this.price = 35;
    }

    @Override
    public void makeCoffee(){
        Ingredients.coffeePowder -= this.coffeePowder;
        Ingredients.water -= this.water;
        Ingredients.sugar -= this.sugar;
        Ingredients.milk -= this.milk;
    }

}
