package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Ticket[][] tickets = new Ticket[2025][4];

        Ticket online = Online.createOnlineTicket("SDM", "Szczecin", 100);
        Ticket standard = Standard.createStandardTicket("Open'er", "Warszawa", 200);
        Ticket gift = Gift.createGiftTicket("StandUP", "Katowice", 150);

        tickets[2024][1] = online;
        tickets[2024][2] = standard;
        tickets[2024][3] = gift;

        System.out.println("Events bilets: " + "\n");

        for (int i = 2024; i <= tickets.length; i++) {
            for (int j = 1; j <= tickets[i].length; j++) {

                if (j >= tickets[i].length) {
                    return;
                }

                System.out.println("ID: " + i + "/" + j
                        + "\nEvent: " + tickets[i][j].getEvent()
                        + "\nAddress: " + tickets[i][j].getAddress()
                        + "\nPrice: " + tickets[i][j].getPrice()
                        + "\n~~~~~~~~~~~~~~~~");
            }
        }
    }
}
