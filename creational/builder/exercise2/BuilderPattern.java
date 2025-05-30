package builderpattern;

public class BuilderPattern {

    public static void main(String[] args) {
       TravelPackage trip = new TravelPackage.Builder()
                .setDestination("Paris")
                .setNumberOfDays(7)
                .setHotelClass(5)
                .setFlightClass("business")
                .setAirportTransfer(true)
                .setMealPlan("full-board")
                .addExcursion("Eiffel Tower Tour")
                .addExcursion("Seine River Cruise")
                .setTravelInsurance(true)
                .setLocalGuide(true)
                .build();

        System.out.println(trip);


    }
    
}
