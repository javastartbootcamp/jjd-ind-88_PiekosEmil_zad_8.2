package pl.javastart.task;

public class Gift extends Bilet {
    Gift(String event, String address, double price) {
        super(event, address, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5 + (super.getPrice() * 0.05);
    }
}

