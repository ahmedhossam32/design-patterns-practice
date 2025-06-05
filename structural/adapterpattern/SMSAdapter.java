package adapterpattern;

public class SMSAdapter implements Notifier {
    private LegacySMS legacySMS;

    public SMSAdapter() {
        this.legacySMS = new LegacySMS();
    }

    @Override
    public void send(String to, String message) {
        legacySMS.configureConnection(to);
        legacySMS.push(message);
    }
}
