package abstractfactory;

public class VehicleApproval implements Approval {
    @Override
    public void approveClaim() {
        System.out.println("Approving a vehicle insurance claim.");
    }
}
