package factorymethod;

public abstract class CleaningServiceCreator 
{
    public void startService()
    {
        CleaningService service = createService();
        service.perfromCleaning();
        
    }
    public abstract CleaningService createService();
    
}
