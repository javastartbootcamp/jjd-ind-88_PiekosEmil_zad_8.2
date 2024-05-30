package pl.javastart.task;

public class Bilet {
    String event; // Nazwa wydarzenia, na które ten bilet jest przeznaczony
    String address; // Miejsce, w którym się odbywa
    double price; // Cena podstawowa
    int discount; // Zniżka wyrażona jako wartość z przedziału 0-1

    public Bilet() {
    }

    Bilet(String event, String address, double price) {
        this.event = event;
        this.address = address;
        this.price = price;
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

    // Metoda, która stworzy tablicę i przyjmie stworzone bilety.
//    public Bilet[][] createBilet(String event, String address, double price) {
//        Bilet[][] bilets = new Bilet[][]{};
//        for (int i = 0; i < bilets.length; i++) {
//            for (int j = 0; j < ; j++) {
//
//            }
//        }
//        bilets[i][j] = new Bilet(getEvent(), getAddress(), getPrice());
//
//        return new Bilet[0][];
//    }
}

