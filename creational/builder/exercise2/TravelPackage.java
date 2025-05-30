package builderpattern;
import java.util.ArrayList;
import java.util.List;

public class TravelPackage {

    private String destination;
    private int numberOfDays;
    private int hotelClass;
    private String flightClass;
    private boolean airportTransfer;
    private String mealPlan;
    private List<String> excursions;
    private boolean travelInsurance;
    private boolean localGuide;
    private double totalCost;

    private TravelPackage(Builder builder) {
        this.destination = builder.destination;
        this.numberOfDays = builder.numberOfDays;
        this.hotelClass = builder.hotelClass;
        this.flightClass = builder.flightClass;
        this.airportTransfer = builder.airportTransfer;
        this.mealPlan = builder.mealPlan;
        this.excursions = builder.excursions != null ? builder.excursions : new ArrayList<>();
        this.travelInsurance = builder.travelInsurance;
        this.localGuide = builder.localGuide;
        this.totalCost = builder.totalCost > 0 ? builder.totalCost : estimateCost(); // optional auto-calc
    }

    private double estimateCost() {
        double cost = 1000; // base
        cost += numberOfDays * 100;
        cost += hotelClass * 50;

        if ("business".equalsIgnoreCase(flightClass)) cost += 800;
        if ("first".equalsIgnoreCase(flightClass)) cost += 1500;

        if (airportTransfer) cost += 100;

        if ("half-board".equalsIgnoreCase(mealPlan)) cost += 100;
        if ("full-board".equalsIgnoreCase(mealPlan)) cost += 200;

        if (excursions != null) cost += excursions.size() * 75;
        if (travelInsurance) cost += 150;
        if (localGuide) cost += 120;

        return cost;
    }

    @Override
    public String toString() {
        return "TravelPackage {" +
                "\n  Destination: '" + destination + '\'' +
                "\n  Days: " + numberOfDays +
                "\n  Hotel: " + hotelClass + "-star" +
                "\n  Flight: " + flightClass +
                "\n  Airport Transfer: " + airportTransfer +
                "\n  Meal Plan: " + mealPlan +
                "\n  Excursions: " + excursions +
                "\n  Insurance: " + travelInsurance +
                "\n  Local Guide: " + localGuide +
                "\n  Total Cost: $" + totalCost +
                "\n}";
    }

    public static class Builder {
        private String destination;
        private int numberOfDays;
        private int hotelClass;
        private String flightClass;
        private boolean airportTransfer;
        private String mealPlan;
        private List<String> excursions = new ArrayList<>();
        private boolean travelInsurance;
        private boolean localGuide;
        private double totalCost;

        public Builder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setNumberOfDays(int days) {
            this.numberOfDays = days;
            return this;
        }

        public Builder setHotelClass(int stars) {
            this.hotelClass = stars;
            return this;
        }

        public Builder setFlightClass(String flightClass) {
            this.flightClass = flightClass;
            return this;
        }

        public Builder setAirportTransfer(boolean airportTransfer) {
            this.airportTransfer = airportTransfer;
            return this;
        }

        public Builder setMealPlan(String mealPlan) {
            this.mealPlan = mealPlan;
            return this;
        }

        public Builder addExcursion(String excursion) {
            this.excursions.add(excursion);
            return this;
        }

        public Builder setTravelInsurance(boolean travelInsurance) {
            this.travelInsurance = travelInsurance;
            return this;
        }

        public Builder setLocalGuide(boolean localGuide) {
            this.localGuide = localGuide;
            return this;
        }

        public Builder setTotalCost(double totalCost) {
            this.totalCost = totalCost;
            return this;
        }

        public TravelPackage build() {
            return new TravelPackage(this);
        }
    }
}

