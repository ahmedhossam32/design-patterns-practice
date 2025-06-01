package factorymethod;

public class HomeCleaning implements CleaningService
{
    @Override
    public void perfromCleaning()
    {
        System.out.println("Home Cleaning ");
    }
}
