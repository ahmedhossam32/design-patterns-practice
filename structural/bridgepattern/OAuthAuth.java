
package bridgepattern;

public class OAuthAuth implements Authentication {
    public void authLogin() {
        System.out.println("Authenticating using OAuth (e.g., Google/Facebook)...");
    }

    public String getType() {
        return "OAuth Authentication";
    }
}
