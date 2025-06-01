package factorymethod;


public class DeepCleaning  implements CleaningService
{
    @Override
    public void perfromCleaning()
    {
        System.out.println("Performing Deep cleaning !!");
    }
    
}
