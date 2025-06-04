package bridgepattern;

public class EmailAuth implements Authentication {
    public void authLogin() {
        System.out.println("Authenticating using Email/Password...");
    }

    public String getType() {
        return "Email Authentication";
    }
}
