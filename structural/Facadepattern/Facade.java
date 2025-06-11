package Facade;

public class Facade
{
    private Flight flight;
    private Hotel hotel;
    private CarRental carRental;

    public Facade()
    {
        this.flight=null;
        this.hotel=null;
        this.carRental=null;
    }

    public void DecemberPackageRome(String departure,String airline,String HotelName,int nights , String carType , int rentalDays)
    {
        System.out.println("Booking Roma Package ");
        String city="Roma";String date="December";
        this.flight=new Flight(departure,city,date,airline);
        this.hotel=new Hotel(HotelName,city,nights);
        this.carRental=new CarRental(city,carType,rentalDays);

        printPackage();
    }

    public void BarcelonaSummerPackage(String departure, String airline, String hotelName, int nights, String carType, int rentalDays) {
        System.out.println("Booking Barcelona Summer Package");
        String city = "Barcelona";
        String date = "July";
        this.flight = new Flight(departure, city, date, airline);
        this.hotel = new Hotel(hotelName, city, nights);
        this.carRental = new CarRental(city, carType, rentalDays);
        printPackage();
    }
    public void printPackage() {
        System.out.println("\n============================================");
        System.out.println("🎁 YOUR BOOKING PACKAGE SUMMARY");
        System.out.println("============================================\n");

        System.out.println("✈️  Flight Details:");
        System.out.println(flight);

        System.out.println("\n🏨 Hotel Details:");
        System.out.println(hotel);

        System.out.println("\n🚗 Car Rental Details:");
        System.out.println(carRental);

        System.out.println("\n============================================");
        System.out.println("✅ Booking Complete! Have a great trip!");
        System.out.println("============================================\n");
    }

}
