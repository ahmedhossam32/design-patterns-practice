package abstractfactory;

public interface InsuranceClaimFactory {
    Submission createSubmission();
    Approval createApproval();
}
