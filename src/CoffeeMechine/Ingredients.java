package CoffeeMechine;

public class Ingredients {
    public static int coffeePowder = 200;
    public static int water = 1000;
    public static int sugar = 500;
    public static int milk = 500;
    public static int ice = 500;

    public boolean isSufficientIngredients(int num){
        String coffee;
        if(num == 1)
            return coffeePowder >= new BlackCoffee().coffeePowder && water >= new BlackCoffee().water && sugar >= new BlackCoffee().sugar;
        else if (num == 2)
            return coffeePowder >= new MilkCoffee().coffeePowder && water >= new MilkCoffee().water && sugar >= new MilkCoffee().sugar && milk >= new MilkCoffee().milk;
        else
            return coffeePowder >= new ColdCoffee().coffeePowder && water >= new ColdCoffee().water && sugar >= new ColdCoffee().sugar && milk >= new ColdCoffee().milk && ice >= new ColdCoffee().ice;
    }

    public String remainingIngredients(){
        return "Remaining coffee powder: " + Ingredients.coffeePowder +
                "\n Remaining water: " + Ingredients.water +
                "\n Remaining sugar: " + Ingredients.sugar +
                "\n Remaining milk: " + Ingredients.milk +
                "\n Remaining ice: " + Ingredients.ice;
    }

}
