
package bridgepattern;


public class MobilePlatform extends Platform {
    public MobilePlatform(Authentication authentication) {
        super(authentication);
    }

    public void login() {
        authentication.authLogin();
        System.out.println("Logged in on Mobile Platform using " + authentication.getType());
    }
}

