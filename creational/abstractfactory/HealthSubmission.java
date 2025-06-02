package abstractfactory;

public class HealthSubmission implements Submission {
    @Override
    public void submitClaim() {
        System.out.println("Submitting a health insurance claim.");
    }
}
