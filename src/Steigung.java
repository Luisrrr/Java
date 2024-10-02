import java.util.Scanner;

class Punkt
{
    public double x;
    public double y;

    public Punkt(double _x, double _y)
    {
        x = _x;
        y = _y;
    }

    public double SteigungZu(Punkt punkt)
    {
        return (punkt.y - y) / (punkt.x - x);
    }
}

public class Steigung
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        while (true)
        {
            System.out.print("Punkt 1 (x, y): ");
            String[] input = scan.nextLine().split(", ");
            Punkt punkt1 = new Punkt(Double.parseDouble(input[0]), Double.parseDouble(input[1]));

            System.out.println();

            System.out.print("Punkt 2 (x, y): ");
            input = scan.nextLine().split(", ");
            Punkt punkt2 = new Punkt(Double.parseDouble(input[0]), Double.parseDouble(input[1]));

            System.out.println("Steigung von Punkt 1 zu Punkt 2: " + punkt1.SteigungZu(punkt2));

            System.out.print("Noch eine Steigung berechnen? (y/n) ");
            String yesNo = scan.nextLine();
            if (!yesNo.equals("y"))
                break;
        }
    }
}
