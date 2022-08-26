package CoffeeMechine;

public class MakeCoffee {

    public void makeCoffee(int num){
        if(num == 1) {
            new BlackCoffee().makeCoffee();
            System.out.println("Enjoy your Black Coffee ☕");
        }
        else if (num == 2) {
            new MilkCoffee().makeCoffee();
            System.out.println("Enjoy your Milk Coffee 🍵");
        }
        else {
            new ColdCoffee().makeCoffee();
            System.out.println("Enjoy your Cold Coffee 🧋");
        }

        System.out.println("\n");
        int returnPrice = CollectMoney.returnPrice;
        if(returnPrice > 0)
            System.out.println("Take your return " + returnPrice + " Rupees");
        System.out.println("\n");
    }

}
