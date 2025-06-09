package flyweight;

public class Main {

    private static void placeOrder (String type, String customer,int table, String size){
        Coffee coffee = CoffeeFactory.getCoffee(type); // shared object
        coffee.serve(customer, table, size);           // extrinsic state
    }
    public static void main(String[] args) {

        placeOrder("Espresso", "Ahmed", 1, "Small");
        placeOrder("Latte", "Sara", 2, "Large");
        placeOrder("Espresso", "Omar", 4, "Medium");
        placeOrder("Latte", "Noor", 3, "Small");
        placeOrder("Cappuccino", "Ali", 5, "Large");
        placeOrder("Espresso", "Layla", 6, "Small");


    }
}