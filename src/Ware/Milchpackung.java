package Ware;

public class Milchpackung extends Lebensmittel
{
    boolean hocherhitzt;
    String typ;

    public Milchpackung(double _preis, int _anzahl, int _maxLagerTemperatur, String _verfallDatum, boolean _hocherhitzt, String _typ)
    {
        super(_preis, _anzahl, _maxLagerTemperatur, _verfallDatum);
        hocherhitzt = _hocherhitzt;
        typ = _typ;
    }

    public void ausgeben()
    {
        super.ausgeben();
        System.out.println("Hocherhitzt: " + (hocherhitzt ? "Ja" : "Nein"));
        System.out.println("Typ: " + typ);
    }
}
