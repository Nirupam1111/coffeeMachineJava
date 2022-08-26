package CoffeeMechine;

public abstract class Coffee {
    protected int coffeePowder;
    protected int water;
    protected int sugar;
    protected int milk;
    protected int ice;
    protected int price;

    public Coffee(){
        this.coffeePowder = 0;
        this.water = 0;
        this.sugar = 0;
        this.milk = 0;
        this.ice = 0;
        this.price = 0;
    }

    public void makeCoffee(){};
}
