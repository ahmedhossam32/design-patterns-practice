
package abstractfactory;

public class HealthInsuranceFactory implements InsuranceClaimFactory {
    @Override
    public Submission createSubmission() {
        return new HealthSubmission();
    }

    @Override
    public Approval createApproval() {
        return new HealthApproval();
    }
}
