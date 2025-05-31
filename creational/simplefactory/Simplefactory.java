package simplefactory;

public class Simplefactory {

    public static void main(String[] args) {
        Notifications n1 = NotificationFactory.createNotification("email");
        if (n1 != null) n1.notifyUser();

        Notifications n2 = NotificationFactory.createNotification("sms");
        if (n2 != null) n2.notifyUser();

        Notifications n3 = NotificationFactory.createNotification("push");
        if (n3 != null) n3.notifyUser();

        Notifications n4 = NotificationFactory.createNotification("fax");
        if (n4 != null) n4.notifyUser();
    }
    }
    

