import java.util.Scanner;

public class Kalkulation {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Einkaufspreis: ");
        double preis = scan.nextDouble();

        preis *= 1.4;
        System.out.println("Selbstkosenpreis: " + preis);

        preis *= 1.05;
        System.out.println("Nettoverkaufpreis: " + preis);

        preis *= 1.19;
        System.out.println("Bruttoverkaufspreis: " + preis);
    }
}
