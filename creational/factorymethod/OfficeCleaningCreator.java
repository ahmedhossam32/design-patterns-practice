package factorymethod;


public class OfficeCleaningCreator  extends CleaningServiceCreator
{
    @Override
     public  CleaningService createService()
     {
         return new OfficeCleaning();
     }
    
}
