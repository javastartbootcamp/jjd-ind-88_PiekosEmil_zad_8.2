package pl.javastart.task;

public class Standard extends Ticket {

    static Ticket createStandardTicket(String event, String address, double price) {
        Standard standard = new Standard();
        standard.setEvent(event);
        standard.setAddress(address);
        standard.setPrice(price);
        return standard;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }
}
