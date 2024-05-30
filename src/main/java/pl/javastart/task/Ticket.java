package pl.javastart.task;

public class Ticket {
    private String event; // Nazwa wydarzenia, na które ten bilet jest przeznaczony
    private String address; // Miejsce, w którym się odbywa
    private double price; // Cena podstawowa
    private int discount; // Zniżka wyrażona jako wartość z przedziału 0-1

    public Ticket() {
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

}

