package pl.javastart.task;

public class Online extends Ticket {

    static Ticket createOnlineTicket(String event, String address, double price) {
        Online online = new Online();
        online.setEvent(event);
        online.setAddress(address);
        online.setPrice(price);
        return online;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.95;
    }
}
