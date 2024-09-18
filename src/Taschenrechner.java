import java.util.Scanner;

public class Taschenrechner {
    public static void Main(String[] args)
    {
        System.out.println("Was möchtest du rechnen?");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraktion");
        System.out.println("3 - Multiplikation");
        System.out.println("4 - Division");
        System.out.println("5 - PKW Verbrauch");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        switch (input)
        {
            case 1:
                System.out.println("x + y");
                System.out.println();
                System.out.print("x: ");
                double x = scan.nextDouble();
                System.out.println();
                System.out.print("y: ");
                double y = scan.nextDouble();
                System.out.print(x + " + " + y + " = " + (x + y));
                break;
        }
    }
}
