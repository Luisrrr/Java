package Ware;

public class Kleidungsstueck extends Ware
{
    int groesse;
    String art;
    String farbe;
    String material;

    public Kleidungsstueck(double _preis, int _anzahl)
    {
        super(_preis, _anzahl);
    }

    public void ausgeben()
    {
        super.ausgeben();
        System.out.println("Größe: " + groesse);
        System.out.println("Art: " + art);
        System.out.println("Farbe: " + farbe);
        System.out.println("Material: " + material);
    }
}
