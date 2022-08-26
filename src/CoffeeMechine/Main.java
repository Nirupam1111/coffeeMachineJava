package CoffeeMechine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Ingredients ingredients = new Ingredients();
    public static CollectMoney collectMoney = new CollectMoney();
    public static MakeCoffee makeCoffee = new MakeCoffee();

    public static void main(String[] args) {
        boolean isOn = true;
        System.out.println("Welcome in our Coffee Machine!!!");

        while (isOn){
            printInstruction();
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    makeOurCoffee(1);
                    break;
                case 2:
                    makeOurCoffee(2);
                    break;
                case 3:
                    makeOurCoffee(3);
                    break;
                case 4:
                    isOn = false;
                    break;
                case 8:
                    System.out.println(new Ingredients().remainingIngredients());
                    System.out.println("\n");
                    break;
                case 9:
                    System.out.println("Total money Collection " + new CollectMoney().totalMoney() + " Rupees");
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Wrong Choice...");
                    System.out.println("\n");
                    break;
            }
        }
    }

    public static void printInstruction(){
        System.out.println("\t Black Coffee 25 Rupees");
        System.out.println("\t Milk Coffee 35 Rupees");
        System.out.println("\t Cold Coffee 40 Rupees");
        System.out.println("Enter your choice");
        System.out.println("\t Press 1 => For Black Coffee");
        System.out.println("\t Press 2 => For Milk Coffee");
        System.out.println("\t Press 3 => For Cold Coffee");
        System.out.println("\t Press 4 => For Close");
    }

    public static void makeOurCoffee(int num){
        int rupees;
        if(num == 1)
            rupees = 25;
        else if(num == 2)
            rupees = 35;
        else
            rupees = 40;
        boolean isSufficientIngredients = ingredients.isSufficientIngredients(num);

        if(isSufficientIngredients){
            System.out.println("Enter " + rupees + " Rupees");
            try{
                int price = (int) scanner.nextFloat();
                boolean isSufficientMoney = collectMoney.isSufficientMoney(num, price);
                if(isSufficientMoney){
                    makeCoffee.makeCoffee(num);
                }else{
                    System.out.println("PLEASE ENTER SUFFICIENT MONEY!!!");
                    System.out.println("\n");
                }
            }catch (InputMismatchException notNumber){
                System.out.println("please ENTER A NUMBER !");
                System.out.println("\n");
            }
        }else{
            System.out.println("Sorry our ingredients are limited.Try another type of Coffee");
            System.out.println("\n");
        }
    }

}
