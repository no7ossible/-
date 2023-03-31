public class Main {
    public static void main(String[] args) {
int countAdults = 9;
int countPensioners=5;
int countChild = 11;

        double price = 70;
        double discount = 50;
        var childTicket = new Ticket(discount, 50, price, 70);
        var adultsTicket = new Ticket(discount, 1,price , 70);
        var pensioniersTicket = new Ticket(price, 30, discount, 70);
        final double result;
        result = (childTicket * countChild) + (pensioniersTicket * countPensioners) + (countAdults * adultsTicket);


        System.out.println("общая стоимость"+result+"монет");



    }
}