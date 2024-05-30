package pl.javastart.task;

public class Gift extends Ticket {

    static Ticket createGiftTicket(String event, String address, double price) {
        Gift gift = new Gift();
        gift.setEvent(event);
        gift.setAddress(address);
        gift.setPrice(price);
        return gift;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5 + (super.getPrice() * 0.05);
    }
}

