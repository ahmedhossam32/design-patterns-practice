package flyweight;

public class Coffetype implements Coffee
{

        private final String name;            // intrinsic
        private final String description;     // intrinsic

        public Coffetype(String name, String description) {
            this.name = name;
            this.description = description;
        }

        @Override
        public void serve(String customerName, int tableNumber, String size) {
            System.out.println("Serving " + size + " " + name + " to " + customerName +
                    " at table " + tableNumber + ". Description: " + description);
        }
}


