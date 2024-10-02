import java.util.Random;
import java.util.Scanner;

public class SummeRechnen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();

        // Maximale Zahl die vorkommen kann abfragen
        System.out.print("Maximalzahl: ");
        int max = scan.nextInt();

        // Zwei zufällige integer von 1 bis 10
        int x = rd.nextInt(max) + 1;
        int y = rd.nextInt(max) + 1;

        System.out.println();
        System.out.print(x + " + " + y + " = ");
        int input = scan.nextInt();

        if (input == x + y) {
            System.out.println("Richtig.");
            if (input >= 100)
                System.out.println("Die Zahl ist größer als 100.");
        }
        else
            System.out.println("Falsch.");
    }
}
