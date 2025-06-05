package adapterpattern;


public class LegacySMS {
    public void configureConnection(String phoneNumber) {
        System.out.println("Configuring SMS connection for: " + phoneNumber);
    }

    public void push(String messageText) {
        System.out.println("Sending SMS: " + messageText);
    }
}
