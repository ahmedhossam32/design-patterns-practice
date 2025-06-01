package factorymethod;

public class OfficeCleaning implements CleaningService
{
    @Override
    public void perfromCleaning()
    {
        System.out.println("Office cleaning ");
    }
}
