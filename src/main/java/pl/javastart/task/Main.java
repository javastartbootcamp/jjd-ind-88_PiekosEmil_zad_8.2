package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Bilet[][] bilets = new Bilet[2025][4];

        Online online = new Online();
        online.setEvent("SDM");
        online.setAddress("Warszawa");
        online.setPrice(100);

        Standard standard = new Standard();
        standard.setEvent("SDM");
        standard.setAddress("Warszawa");
        standard.setPrice(100);

        Gift gift = new Gift();
        gift.setEvent("SDM");
        gift.setAddress("Warszawa");
        gift.setPrice(100);

        bilets[2024][1] = online;
        bilets[2024][2] = standard;
        bilets[2024][3] = gift;

        System.out.println("Events bilets: " + "\n");

        for (int i = 2024; i <= bilets.length; i++) {
            for (int j = 1; j <= bilets[i].length; j++) {

                if (j >= bilets[i].length) {
                    return;
                }

                System.out.println("ID: " + i + "/" + j
                        + "\nEvent: " + bilets[i][j].getEvent()
                        + "\nAddress: " + bilets[i][j].getAddress()
                        + "\nPrice: " + bilets[i][j].getPrice()
                        + "\n~~~~~~~~~~~~~~~~");
            }
        }
    }
}
