package abstractfactory;

public class HealthApproval implements Approval {
    @Override
    public void approveClaim() {
        System.out.println("Approving a health insurance claim.");
    }
}
