package Interfaces2;

public class Kuh implements Tier
{
    Essen futter = Essen.Weizen;

    public void GeraeuschMachen()
    {
        System.out.println("Muh");
    }

    public void Fressen(Essen essen)
    {
        if (essen != futter)
        {
            System.out.println("Bro ich kann das nicht essen.");
            return;
        }

        System.out.println("Kuh frisst " + essen.toString());
    }
}
