import java.sql.SQLOutput;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true)
        {
            System.out.print("Breite: ");
            int width = scan.nextInt() * 2; // Breite mal 2, weil eine neue Zeile 2 character groß ist

            System.out.print("\nHöhe: ");
            int height = scan.nextInt();

            System.out.println();
            for (int y = 0; y < height; y++)
            {
                for (int x = 0; x < width; x++)
                {
                    if ((x + y) % 2 == 0) // Ist x + y eine gerade Zahl?
                        System.out.print("#");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }

            System.out.print("Nochmal? (y/n) ");
            String input = scan.next();
            if (!input.equals("y"))
                break;
        }
    }
}
