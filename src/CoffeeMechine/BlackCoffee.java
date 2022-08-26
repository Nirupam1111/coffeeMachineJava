package CoffeeMechine;


public class BlackCoffee extends Coffee {

    public BlackCoffee() {
        super();
        this.coffeePowder = 20;
        this.water = 100;
        this.sugar = 20;
        this.price = 25;
    }

    @Override
    public void makeCoffee(){
        Ingredients.coffeePowder -= this.coffeePowder;
        Ingredients.water -= this.water;
        Ingredients.sugar -= this.sugar;
    }

}
