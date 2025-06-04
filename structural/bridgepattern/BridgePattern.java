package bridgepattern;

public class BridgePattern {

    public static void main(String[] args) {
        
        Authentication email = new EmailAuth();
        Platform web = new WebPlatform(email);
        web.login();

        System.out.println("-----");

        Authentication oauth = new OAuthAuth();
        Platform mobile = new MobilePlatform(oauth);
        mobile.login();

        System.out.println("-----");

        Authentication biometric = new BiometricAuth();
        Platform desktop = new DesktopPlatform(biometric);
        desktop.login();
    

    }
    
}
