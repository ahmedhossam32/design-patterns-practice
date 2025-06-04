
package bridgepattern;

public abstract class Platform {
    protected Authentication authentication;

    public Platform(Authentication authentication) {
        this.authentication = authentication;
    }

    public abstract void login();
}
