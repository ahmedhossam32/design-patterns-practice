package singletonpattern;

public class Singletonpattern {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("App started");

        Logger logger2 = Logger.getInstance();
        logger2.log("App running");
           
        if (logger1 == logger2) {
            System.out.println("✅ logger1 and logger2 are the SAME instance.");
        } else {
            System.out.println("❌ logger1 and logger2 are DIFFERENT instances.");
        }
    }
}
