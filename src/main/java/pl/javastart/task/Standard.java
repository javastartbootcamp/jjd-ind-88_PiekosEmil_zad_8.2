package pl.javastart.task;

public class Standard extends Bilet {

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }
}
