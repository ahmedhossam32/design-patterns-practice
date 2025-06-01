package factorymethod;


public class DeepCleaningCreator extends CleaningServiceCreator
{
    @Override
     public  CleaningService createService()
     {
         return new DeepCleaning();
     }
    
}
