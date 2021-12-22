package HomeWork;

public enum Burger {
    Souce(10, 1),
    Cheese(20,2),
    Meatball(30,3);


    int price;
    int number;

    Burger(int price, int number) {
        this.number = number;
        this.price = price;
    }
}

