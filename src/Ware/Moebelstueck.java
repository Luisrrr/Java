package Ware;

public class Moebelstueck extends Ware
{
    int breite;
    int hoehe;
    int tiefe;
    String typ;

    public Moebelstueck(double _preis, int _anzahl)
    {
        super(_preis, _anzahl);
    }

    public void ausgeben()
    {
        super.ausgeben();
        System.out.println("Größe: x" + breite + " y" + hoehe + " z" + tiefe);
        System.out.println("Typ: " + typ);
    }
}
