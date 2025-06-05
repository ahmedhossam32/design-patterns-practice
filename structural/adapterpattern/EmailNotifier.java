package adapterpattern;


public class EmailNotifier implements Notifier {
    @Override
    public void send(String to, String message) {
        System.out.println("Sending Email to " + to + ": " + message);
    }
}
