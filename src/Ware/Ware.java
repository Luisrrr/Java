package Ware;

public class Ware
{
    double preis;
    int anzahl;

    public Ware(double _preis, int _anzahl)
    {
        preis = _preis;
        anzahl = _anzahl;
    }

    public void ausgeben()
    {
        System.out.println("Preis: " + preis);
        System.out.println("Anzahl: " + anzahl);
    }
}
