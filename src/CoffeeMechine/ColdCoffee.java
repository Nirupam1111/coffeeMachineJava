package CoffeeMechine;

public class ColdCoffee extends Coffee {

    public ColdCoffee() {
        super();
        this.coffeePowder = 15;
        this.water = 100;
        this.sugar = 35;
        this.milk = 30;
        this.ice = 20;
        this.price = 40;
    }

    @Override
    public void makeCoffee(){
        Ingredients.coffeePowder -= this.coffeePowder;
        Ingredients.water -= this.water;
        Ingredients.sugar -= this.sugar;
        Ingredients.milk -= this.milk;
        Ingredients.ice -= this.ice;
    }

}
