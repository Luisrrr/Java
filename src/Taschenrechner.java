import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("Was möchtest du rechnen?");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraktion");
            System.out.println("3 - Multiplikation");
            System.out.println("4 - Division");
            System.out.println("5 - PKW Verbrauch");

            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();

            double x, y;
            switch (input) {
                case 1 -> {
                    System.out.println("x + y");
                    System.out.print("x: ");
                    x = scan.nextDouble();
                    System.out.print("y: ");
                    y = scan.nextDouble();
                    System.out.println(x + " + " + y + " = " + (x + y));
                }
                case 2 -> {
                    System.out.println("x - y");
                    System.out.print("x: ");
                    x = scan.nextDouble();
                    System.out.print("y: ");
                    y = scan.nextDouble();
                    System.out.println(x + " - " + y + " = " + (x - y));
                }
                case 3 -> {
                    System.out.println("x * y");
                    System.out.print("x: ");
                    x = scan.nextDouble();
                    System.out.print("y: ");
                    y = scan.nextDouble();
                    System.out.println(x + " * " + y + " = " + (x * y));
                }
                case 4 -> {
                    System.out.println("x ÷ y");
                    System.out.print("x: ");
                    x = scan.nextDouble();
                    System.out.print("y: ");
                    y = scan.nextDouble();
                    System.out.println(x + " ÷ " + y + " = " + (x / y));
                }
                case 5 -> {
                    System.out.print("Gefahrene Kilometer: ");
                    x = scan.nextDouble();
                    System.out.print("Verbrauchte Kraftstoffmenge: ");
                    y = scan.nextDouble();
                    System.out.println("Durchschnittsverbrauch auf 100 km: " + (y / (x / 100)));
                }
            }

            System.out.print("Möchtest du noch was rechnen? (y/n) ");
            String yesNo = scan.next();
            if (!yesNo.equals("y"))
                break;
        }
    }
}
