
package bridgepattern;


public class DesktopPlatform extends Platform {
    public DesktopPlatform(Authentication authentication) {
        super(authentication);
    }

    public void login() {
        authentication.authLogin();
        System.out.println("Logged in on Desktop Platform using " + authentication.getType());
    }
}
