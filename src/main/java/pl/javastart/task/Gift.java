package pl.javastart.task;

import java.util.Scanner;

public class Gift extends Ticket {

    static Ticket createGiftTicket() {
        Scanner s = new Scanner(System.in);
        Gift gift = new Gift();
        System.out.println("Podaj nazwę wydarzenia: ");
        gift.setEvent(s.nextLine());
        System.out.println("Podaj miejsce wydarzenia: ");
        gift.setAddress(s.nextLine());
        System.out.println("Podaj cenę biletu");
        gift.setPrice(s.nextDouble());
        return gift;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5 + (super.getPrice() * 0.05);
    }
}

