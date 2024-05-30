package pl.javastart.task;

public class Gift extends Bilet {

    @Override
    public double getPrice() {
        return super.getPrice() + 5 + (super.getPrice() * 0.05);
    }
}

