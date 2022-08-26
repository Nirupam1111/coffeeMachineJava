package CoffeeMechine;

public class CollectMoney {
    public static int returnPrice = 0;
    public static int totalMoney = 0;

    public boolean isSufficientMoney(int num, int price){
        if(num == 1) {
            if(price > new BlackCoffee().price) {
                returnPrice = price - new BlackCoffee().price;
            }
            if(price >= new BlackCoffee().price) {
                totalMoney += new BlackCoffee().price;
            }
            return price >= new BlackCoffee().price;
        }
        else if (num == 2) {
            if(price > new MilkCoffee().price) {
                returnPrice = price - new MilkCoffee().price;
            }
            if(price >= new MilkCoffee().price) {
                totalMoney += new MilkCoffee().price;
            }
            return price >= new MilkCoffee().price;
        }
        else {
            if(price > new ColdCoffee().price) {
                returnPrice = price - new ColdCoffee().price;
            }
            if(price >= new ColdCoffee().price) {
                totalMoney += new ColdCoffee().price;
            }
            return price >= new ColdCoffee().price;
        }
    }

    public int totalMoney(){
        return totalMoney;
    }

}
