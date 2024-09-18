import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Breite: ");
        int width = scan.nextInt() * 2;
        System.out.println("Höhe: ");
        int height = scan.nextInt();

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