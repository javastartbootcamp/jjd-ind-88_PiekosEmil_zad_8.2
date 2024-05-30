package pl.javastart.task;

import java.util.Scanner;

public class Online extends Ticket {

    static Ticket createOnlineTicket() {
        Scanner scanner = new Scanner(System.in);

        Online online = new Online();
        System.out.println("Podaj nazwę wydarzenia: ");
        online.setEvent(scanner.nextLine());
        System.out.println("Podaj miejsze wydarzenia");
        online.setAddress(scanner.nextLine());
        System.out.println("Podaj cenę biletu: ");
        online.setPrice(scanner.nextDouble());
        return online;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.95;
    }
}
