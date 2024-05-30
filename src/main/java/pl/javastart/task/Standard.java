package pl.javastart.task;

import java.util.Scanner;

public class Standard extends Ticket {

    static Ticket createStandardTicket() {
        Scanner s = new Scanner(System.in);
        Standard standard = new Standard();
        System.out.println("Podaj nazwę wydarzenia: ");
        standard.setEvent(s.nextLine());
        System.out.println("Podaj miejsce wydarzenia: ");
        standard.setAddress(s.nextLine());
        System.out.println("Podaj cenę biletu: ");
        standard.setPrice(s.nextDouble());
        return standard;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }
}
