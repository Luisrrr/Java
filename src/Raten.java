import java.util.Random;
import java.util.Scanner;

public class Raten {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
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
