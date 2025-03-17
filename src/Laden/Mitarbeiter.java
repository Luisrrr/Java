package Laden;

public class Mitarbeiter
{
    public String name;

    public Mitarbeiter(String _name)
    {
        name = _name;
    }

    public void RegalEinraeumen(Regal regal, int fach, Ware ware)
    {
        regal.WareAufnehmen(fach, ware);
    }
}
