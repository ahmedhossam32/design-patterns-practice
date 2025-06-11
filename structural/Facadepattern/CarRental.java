package Facade;

public class CarRental
{
        private String city;
        private String carType;
        private int rentalDays;

    public CarRental(String city, String carType, int rentalDays) {
        this.city = city;
        this.carType = carType;
        this.rentalDays = rentalDays;
    }

    public void searchCars() {
            System.out.println("Searching available cars in " + city + " for " + rentalDays + " days");
        }

        public void bookCar(String carType) {
            this.carType = carType;
            System.out.println("Booking a " + carType + " in " + city + " for " + rentalDays + " days");
        }

        public String getCity() {
        return city;
        }

        public void setCity(String city) {
        this.city = city;
        }

        public String getCarType() {
        return carType;
        }

        public void setCarType(String carType) {
        this.carType = carType;
        }

        public int getRentalDays() {
        return rentalDays;
        }
        public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
        }

    @Override
    public String toString() {
        return "CarRental{" +
                "city='" + city + '\'' +
                ", carType='" + carType + '\'' +
                ", rentalDays=" + rentalDays +
                '}';
    }
}
