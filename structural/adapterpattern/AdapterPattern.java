package adapterpattern;

public class AdapterPattern {

    public static void main(String[] args) 
    {
          Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("user@example.com", "Your order has been shipped.");

        Notifier smsNotifier = new SMSAdapter();
        smsNotifier.send("0123456789", "Your OTP code is 543210.");
        
    }
    
}
