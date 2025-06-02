package abstractfactory;

public class VehicleInsuranceFactory implements InsuranceClaimFactory {
    @Override
    public Submission createSubmission() {
        return new VehicleSubmission();
    }

    @Override
    public Approval createApproval() {
        return new VehicleApproval();
    }
}
