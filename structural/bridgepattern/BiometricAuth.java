package bridgepattern;

public class BiometricAuth implements Authentication {
    public void authLogin() {
        System.out.println("Authenticating using Biometrics (FaceID/Fingerprint)...");
    }

    public String getType() {
        return "Biometric Authentication";
    }
}
