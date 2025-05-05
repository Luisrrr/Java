package Interfaces2;

public class Schwein implements Tier
{
    Essen[] futter = new Essen[] { Essen.Kartoffel, Essen.Karotte };

    public void GeraeuschMachen()
    {
        System.out.println("Oink");
    }

    public void Fressen(Essen essen)
    {
        if (!KannFressen(essen))
        {
            System.out.println("Kann ich nicht essen bruder");
            return;
        }

        System.out.println("Schwein frisst " + essen.toString());
    }

    boolean KannFressen(Essen essen)
    {
        for (int c = 0; c < futter.length; c++)
        {
            if (futter[c] == essen)
                return true;
        }
        return false;
    }
}
