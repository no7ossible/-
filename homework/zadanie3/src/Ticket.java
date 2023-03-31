public class Ticket {

    String departurePoint;
    String arrivalPoint;
    String departureDate;
    String arrivalDate;
    String travelTime;
    int distance;
    public double price;
    public double discount;

    public Ticket(double v, int i, double discount, double price) {
        this.price = price;
    }

    public Ticket(double price, double discount) {
        this.price = price;
        this.discount = discount;

    }
}




