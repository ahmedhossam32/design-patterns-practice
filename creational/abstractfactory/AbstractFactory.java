package abstractfactory;

public class AbstractFactory {

    public static void main(String[] args) {
        
         InsuranceClaimFactory healthFactory = new HealthInsuranceFactory();
        ClaimProcessor healthProcessor = new ClaimProcessor(healthFactory);
        System.out.println("---- Health Insurance ----");
        healthProcessor.submitClaim();

        // Test Vehicle Insurance
        InsuranceClaimFactory vehicleFactory = new VehicleInsuranceFactory();
        ClaimProcessor vehicleProcessor = new ClaimProcessor(vehicleFactory);
        System.out.println("\n---- Vehicle Insurance ----");
        vehicleProcessor.submitClaim();
    }
    
    
}
