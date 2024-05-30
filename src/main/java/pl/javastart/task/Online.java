package pl.javastart.task;

public class Online extends Bilet {
    Online(String event, String address, double price) {
        super(event, address, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.95;
    }
}
