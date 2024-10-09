import java.util.Scanner;

public class Loops {
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.print("Aufgabe (1-3): ");
        int input = scan.nextInt();

        switch (input)
        {
            case 1: Quadrat(); break;
            case 2: Multiplikationsreihe(); break;
            case 3: Summe(); break;
        }
    }

    static void Quadrat()
    {
        System.out.print("Größe: ");
        int size = scan.nextInt();

        System.out.println();
        for (int y = 0; y < size * 2; y++)
        {
            for (int x = 0; x < size; x++) // Breite mal 2, weil eine neue Zeile 2 character groß ist
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Multiplikationsreihe()
    {
        System.out.print("Multiplikationsreihe von: ");
        double num = scan.nextDouble();

        System.out.println();
        for (int i = 0; i < 10; i++)
        {
            System.out.print(num * (i + 1));
            if (i != 9)
                System.out.print(", ");
        }
    }

    static void Summe()
    {
        System.out.print("Gib eine Zahl ein: ");
        int num = scan.nextInt();
        int res = 0;

        for (int i = 0; i < num; i++)
        {
            res += i + 1;
            System.out.println(res);
        }
        System.out.println("Die Summe von 1 bis " + num + " ist " + res);
    }
}
