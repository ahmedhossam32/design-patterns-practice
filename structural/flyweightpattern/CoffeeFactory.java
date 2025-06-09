package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CoffeeFactory {
    private static final Map<String, Coffee> coffeeMap = new HashMap<>();

    public static Coffee getCoffee(String name) {
        Coffee coffee = coffeeMap.get(name);
        if (coffee == null) {
            switch (name) {
                case "Espresso":
                    coffee = new Coffetype("Espresso", "Strong and rich coffee");
                case "Latte":
                    coffee = new Coffetype("Latte", "Smooth with steamed milk");
                    break;
                case "Cappuccino":
                    coffee = new Coffetype("Cappuccino", "Creamy espresso-based drink");
                    break;
                default:
                    throw new IllegalArgumentException("Unknown coffee type: " + name);
            }
            coffeeMap.put(name, coffee);
            System.out.println("Creating new " + name + " object");
        }
        return coffee;
    }
}
