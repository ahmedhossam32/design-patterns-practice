package abstractfactory;

public class VehicleSubmission implements Submission {
    @Override
    public void submitClaim() {
        System.out.println("Submitting a vehicle insurance claim.");
    }
}
