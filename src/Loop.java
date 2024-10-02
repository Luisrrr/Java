import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Breite: ");
        int width = scan.nextInt() * 2; // Breite mal 2, weil eine neue Zeile 2 character sind

        System.out.print("\nHöhe: ");
        int height = scan.nextInt();

        System.out.println();
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
