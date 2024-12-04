import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

class Slot
{
    Random rd = new Random();
    int[] nums;
    int maxNum = 6;
    public int size = 2;
    public double value;

    public Slot()
    {
        nums = new int[size * 2];
        Reroll();
    }

    public Slot(Slot preset)
    {
        size = preset.size;
        maxNum = preset.maxNum;
        nums = new int[preset.nums.length];
        for (int c = 0; c < preset.nums.length; c++)
        {
            nums[c] = preset.nums[c];
        }
    }

    public void Overwrite(int[] newNums)
    {
        nums = newNums;
    }

    public void Reroll()
    {
        for (int c = 0; c < nums.length; c++)
        {
            nums[c] = rd.nextInt(maxNum) + 1;
        }
    }

    void GetValue()
    {
        GetValue(1);
    }

    void GetValue(int sleepMult)
    {
        value = 0;

        int[] occurrences = new int[maxNum];
        for (int c = 0; c < nums.length; c++)
        {
            occurrences[nums[c] - 1]++;
        }

        double[] multipliedNums = new double[nums.length];
        for (int c = 0; c < nums.length; c++) {
            multipliedNums[c] = nums[c];
        }

        for (int c = 0; c < nums.length; c++)
        {
            switch (occurrences[nums[c] - 1])
            {
                case 0:
                case 1: break;
                case 2: multipliedNums[c] *= 1.1f; value += 1; break;
                case 3: multipliedNums[c] *= 1.4f; value += 2; break;
                case 4: multipliedNums[c] *= 1.8f; value += 3;  break;
                case 5: multipliedNums[c] *= 3f; value += 5; break;
                case 6: multipliedNums[c] *= 10f; value += 10; break;

                default:
                    multipliedNums[c] *= occurrences[nums[c] - 1] * 2;
                    value += occurrences[nums[c] - 1] * 2;
                break;
            }
            value += multipliedNums[c];
        }

        boolean allUnique = true;
        int pairs = 0;
        for (int c = 0; c < occurrences.length; c++)
        {
            if (occurrences[c] <= 1)
                continue;
            allUnique = false;
            pairs++;
            System.out.println(occurrences[c] + "x " + (c + 1));
            Sleep(150 + c * 20 * sleepMult);
        }
        if (pairs >= 2)
        {
            Sleep(250);
            System.out.println(pairs + "x Paare (×" + pairs + ")");
            value *= pairs;
        }
        if (allUnique)
        {
            Sleep(400);
            double mult = nums.length / 2f;
            System.out.println("Alle unterschiedlich! (×" + mult + ")");
            value *= mult;
        }
        Sleep(300);
        System.out.println("VALUE: " + value);
    }

    public Slot Combine(Slot with)
    {
        Slot combined = new Slot();
        combined.size = size + with.size;
        int[] combinedNums = new int[size * 2 + with.size * 2];
        for (int c = 0; c < combinedNums.length; c++) {
            if (c < size * 2)
                combinedNums[c] = nums[c];
            else
                combinedNums[c] = with.nums[c - size * 2];
        }
        combined.Overwrite(combinedNums);
        return combined;
    }

    public String ToString()
    {
        String str = "[";
        for (int c = 0; c < nums.length; c++)
        {
            str += nums[c];
            if ((c + 1) % size == 0)
                str += "]\n[";
        }
        return str.substring(0, str.length() - 2);
    }

    static void Sleep(int ms)
    {
        // Keine Ahnung warum ich das machen muss
        try {
            Thread.sleep(ms);
        } catch(InterruptedException e) {
            // ka
        }
    }
}

public class LetsGoGambling {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        double money = 50;
        int slots = 3;

        while (true)
        {
            System.out.println("Dein Kontostand: " + money);
            System.out.println("Wie viel Geld willst du setzen?");
            double bet = scan.nextDouble();
            if (bet > money)
                bet = money;
            System.out.println("Auf welchen Wert willst du setzen?");
            double betValue = scan.nextDouble();

            double mult = Slots(betValue, slots);

            Sleep(300);
            double gain = bet * mult;
            double difference = gain - bet;
            money -= bet;
            money += gain;
            if (difference > 0)
            {
                System.out.println("Du gewinnst " + difference + "€!");
            }
            else
            {
                System.out.println("Du verlierst " + difference + "€. Scheiße digga");
                if (money <= 5) {
                    System.out.println("Bro du bist broke as fuck du kannst nicht weiter machen \uD83D\uDC80");
                    break;
                }
            }
        }
    }

    static double Slots(double betValue, int slots)
    {
        Slot[] yourSlots = new Slot[slots];

        Slot[] currentSlots = new Slot[slots];
        for (int c = 0; c < currentSlots.length; c++)
        {
            currentSlots[c] = new Slot();
        }

        for (int slotNum = 0; slotNum < slots; slotNum++)
        {
            LocalTime startTime = LocalTime.now();
            double timeElapsed = 0;
            while (timeElapsed < slots)
            {
                timeElapsed = startTime.until(LocalTime.now(), ChronoUnit.SECONDS);
                System.out.println("\n\n\n\n");
                for (int c = 0; c < currentSlots.length; c++)
                {
                    System.out.println((c + 1) + ".");
                    if (timeElapsed < c + 1)
                        currentSlots[c].Reroll();
                    System.out.println(currentSlots[c].ToString());
                }
                Sleep(1);
            }

            System.out.println("----------------------------");

            for (int c = 0; c < currentSlots.length; c++)
            {
                Sleep(500);
                System.out.println("\n" + (c + 1) + ".");
                System.out.println(currentSlots[c].ToString());

                currentSlots[c].GetValue();
            }

            System.out.println("Deine Slots:");
            for (int c = 0; c < yourSlots.length; c++)
            {
                if (yourSlots[c] == null)
                    break;
                System.out.println((c + 1) + ".");
                System.out.println(yourSlots[c].ToString());
            }

            System.out.print("\nWähle einen Slot mit dem du weitergehen willst: ");
            int input = scan.nextInt();
            // Muss einen neuen Slot machen damit es keine Referenz ist
            yourSlots[slotNum] = new Slot(currentSlots[input - 1]);
        }

        System.out.println("Alle Slots kombiniert:");
        Slot finalSlot = yourSlots[0];
        for (int c = 1; c < yourSlots.length; c++)
        {
            finalSlot = finalSlot.Combine(yourSlots[c]);
        }
        System.out.println(finalSlot.ToString());
        finalSlot.GetValue(5);
        
        double moneyMult = Math.pow(finalSlot.value / betValue, Math.pow(Math.log10(betValue) - 1, 2)) + betValue / 1000;
        System.out.println("×" + moneyMult + " GELD");
        return moneyMult;
    }

    static void Sleep(int ms)
    {
        // Keine Ahnung warum ich das machen muss
        try {
            Thread.sleep(ms);
        } catch(InterruptedException e) {
            // ka
        }
    }
}
