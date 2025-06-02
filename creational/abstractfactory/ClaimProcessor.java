package abstractfactory;


public class ClaimProcessor 
{
    private InsuranceClaimFactory factory;
    
    public ClaimProcessor(InsuranceClaimFactory factory)
    {
        this.factory=factory;
    }
    
    public void submitClaim() {
        Submission submission = factory.createSubmission();
        submission.submitClaim();

        Approval approval = factory.createApproval();
        approval.approveClaim();
    }
}
