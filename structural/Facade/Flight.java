package Facade;

public class Flight {

        private String departure;
        private String destination;
        private String date;
        private String airline;

        public Flight(String departure, String destination, String date, String airline) {
                this.departure = departure;
                this.destination = destination;
                this.date = date;
                this.airline = airline;
        }

        public void searchFlights() {
            System.out.println("Searching flights from " + departure + " to " + destination + " on " + date);
        }


        public String getAirline() {
            return airline;
        }

        public String getDeparture() {
        return departure;
        }

        public void setDeparture(String departure) {
        this.departure = departure;
        }

        public String getDestination() {
        return destination;
        }

        public void setDestination(String destination) {
        this.destination = destination;
        }

        public String getDate() {
        return date;
        }

        public void setDate(String date) {
        this.date = date;
        }

        public void setAirline(String airline) {
        this.airline = airline;
        }

        @Override
        public String toString() {
                return "Flight{" +
                        "departure='" + departure + '\'' +
                        ", destination='" + destination + '\'' +
                        ", date='" + date + '\'' +
                        ", airline='" + airline + '\'' +
                        '}';
        }
}


