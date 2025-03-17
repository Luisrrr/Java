package Laden;

public class Laden
{
    public static void main(String[] args)
    {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("John");

        Regal regal1 = new Regal("In der Ecke");

        Ware schokolade = new Ware("Schokolade", 1);
        mitarbeiter1.RegalEinraeumen(regal1, 0, schokolade);

        System.out.println(regal1.ToString());
    }
}
