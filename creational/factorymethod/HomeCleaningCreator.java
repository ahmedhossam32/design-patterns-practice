package factorymethod;


public class HomeCleaningCreator extends CleaningServiceCreator
{
    @Override
     public  CleaningService createService()
     {
         return new HomeCleaning();
     }
    
    
}
