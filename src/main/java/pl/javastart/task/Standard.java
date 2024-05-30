package pl.javastart.task;

public class Standard extends Bilet {
    Standard(String event, String address, double price) {
        super(event, address, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }
}
