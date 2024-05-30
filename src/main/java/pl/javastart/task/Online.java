package pl.javastart.task;

public class Online extends Bilet {

    @Override
    public double getPrice() {
        return super.getPrice() * 0.95;
    }
}
