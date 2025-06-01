package factorymethod;

public class FactoryMethod {

    public static void main(String[] args) {
        CleaningServiceCreator homeCreator = new HomeCleaningCreator();
        homeCreator.startService();  // Output: Home Cleaning

        CleaningServiceCreator officeCreator = new OfficeCleaningCreator();
        officeCreator.startService();  // Output: Office cleaning

        CleaningServiceCreator deepCreator = new DeepCleaningCreator();
        deepCreator.startService();  // Output: Performing Deep cleaning !!
    }
    
    
}
