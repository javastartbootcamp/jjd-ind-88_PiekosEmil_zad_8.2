package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Bilet[][] bilets = new Bilet[2025][4];

        bilets[2024][1] = new Online("SDM", "Warszawa", 100);
        bilets[2024][2] = new Standard("StandUp", "Szczecin", 150);
        bilets[2024][3] = new Gift("Open'er", "Katowice", 200);

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
