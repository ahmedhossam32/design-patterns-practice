
package bridgepattern;


public class WebPlatform extends Platform {
    public WebPlatform(Authentication authentication) {
        super(authentication);
    }

    public void login() {
        authentication.authLogin();
        System.out.println("Logged in on Web Platform using " + authentication.getType());
    }
}
