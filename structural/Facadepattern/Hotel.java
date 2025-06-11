package Facade;

public class Hotel {

        private String hotelName;
        private String city;
        private int nights;


    public Hotel(String hotelName, String city, int nights) {
        this.hotelName = hotelName;
        this.city = city;
        this.nights = nights;
    }

    public void searchHotels() {
            System.out.println("Searching hotels in " + city + " for " + nights + " nights");
        }

        public void bookHotel(String hotelName) {
            this.hotelName = hotelName;
            System.out.println("Booking hotel: " + hotelName + " in " + city + " for " + nights + " nights");
        }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", city='" + city + '\'' +
                ", nights=" + nights +
                '}';
    }
}
