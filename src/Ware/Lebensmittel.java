package Ware;

public class Lebensmittel extends Ware
{
    int maxLagerTemperatur;
    String verfallDatum;

    public Lebensmittel(double _preis, int _anzahl, int _maxLagerTemperatur, String _verfallDatum)
    {
        super(_preis, _anzahl);
        maxLagerTemperatur = _maxLagerTemperatur;
        verfallDatum = _verfallDatum;
    }

    public void ausgeben()
    {
        super.ausgeben();
        System.out.println("Max. Lagertemperatur: " + maxLagerTemperatur + "°");
        System.out.println("Verfalldatum: " + verfallDatum);
    }
}
