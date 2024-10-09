import java.util.Random;
import java.util.Scanner;

public class Verzweigungen_Loops {
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.print("Aufgabe (1-3): ");
        int input = scan.nextInt();

        switch (input)
        {
            case 1: Raten(); break;
            case 2: FooBar(); break;
            case 3: Primzahlen(); break;
        }
    }

    static void FooBar()
    {
        // Es gibt keine Zahlen die durch 3 und 5 teilbar sind?
        for (int i = 1; i < 101; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("foobar");
            else if (i % 3 == 0)
                System.out.println("foo");
            else if (i % 5 == 0)
                System.out.println("bar");
            else
                System.out.println(i);
        }
    }

    static void Primzahlen()
    {
        for (int i = 1; i < 101; i++)
        {
            if (IstPrimzahl(i))
                System.out.println(i);
        }
    }

    static boolean IstPrimzahl(double num)
    {
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static void Raten()
    {
        Random rd = new Random();

        int range = 100;

        while (true)
        {
            int rdNum = rd.nextInt(range) + 1;
            // System.out.println(rdNum);
            int lowest = 0;
            int highest = 100;
            int attempts = 0;

            // Lasse User raten bis er es richtig hat
            while (true)
            {
                System.out.print("Errate die Zahl: ");
                int input = scan.nextInt();
                attempts++;

                if (input > rdNum && input < highest)
                    highest = input;
                else if (input < rdNum && input > lowest)
                    lowest = input;
                else if (input == rdNum)
                {
                    System.out.println("Richtig, " + attempts + " Versuche. Nochmal? y/n");
                    String yesNo = scan.next();
                    if (yesNo.equals("y"))
                        break;
                    else
                        return;
                }

                System.out.println("Falsch. Zahl ist zwischen " + lowest + " und " + highest);
            }
        }
    }
}
