package HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int price = 50;

        System.out.println("Hello, it's burger constructor.");
        System.out.println("Burger price is 50 uah, do u wanna add some ingredients?: ");

        listIngredients();
        int ingredient = inputMethod();
       price = priceBurger(ingredient, price);
        getCheck(price);

    }

    public static void listIngredients() {
        for (Burger burger : Burger.values()) {
            System.out.println("Number " + burger.number + " " + burger + " - " + burger.price + " uah");
        }
        System.out.println("Enter number 1,2 or 3 ");
    }

    public static int inputMethod() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    public static void getCheck(int price) {
        System.out.println("do u wanna add some ingredients, yes/no");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String s1 = "yes";
        String s2 = "no";

        if (str.equalsIgnoreCase(s1)) {
            listIngredients();
            int ingredient = inputMethod();
            price = priceBurger(ingredient, price);
            getCheck(price);
        } else if (str.equalsIgnoreCase(s2)) {
            System.out.println("Your burger price: " + price + " uah");
        } else {
            System.out.println("incorrect answer");
            System.out.println("Your burger price with additional ingredients : " + price + " uah");
        }
    }

    public static int priceBurger(int ingredient, int price) {
        switch (ingredient) {
            case 1:
                price += 10;
                break;
            case 2:
                price += 20;
                break;
            case 3:
                price += 30;
                break;
            default:
                System.out.println("Something wrong");
        }
        return price;
    }
}

