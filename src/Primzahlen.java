public class Primzahlen
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 101; i++)
        {
            boolean istPrimzahl = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    istPrimzahl = false;
                    break;
                }
            }

            if (istPrimzahl)
                System.out.println(i);
        }
    }
}
