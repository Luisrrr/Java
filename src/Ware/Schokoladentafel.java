package Ware;

public class Schokoladentafel extends Lebensmittel
{
    double kakaogehalt;
    String sorte;

    public Schokoladentafel(double _preis, int _anzahl, int _maxLagerTemperatur, String _verfallDatum, double _kakaogehalt, String _sorte)
    {
        super(_preis, _anzahl, _maxLagerTemperatur, _verfallDatum);
        kakaogehalt = _kakaogehalt;
        sorte = _sorte;
    }

    public void ausgeben()
    {
        super.ausgeben();
        System.out.println("Kakaogehalt: " + kakaogehalt);
        System.out.println("Sorte: " + sorte);
    }
}
