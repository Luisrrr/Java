package Interfaces2;

public class Main
{
    public static void main(String[] args)
    {
        Kuh kuh = new Kuh();
        kuh.GeraeuschMachen();
        kuh.Fressen(Essen.Karotte);
        kuh.Fressen(Essen.Weizen);
        kuh.GeraeuschMachen();

        Schwein schwein = new Schwein();
        schwein.GeraeuschMachen();
        schwein.Fressen(Essen.Karotte);
        schwein.Fressen(Essen.Kartoffel);
        schwein.Fressen(Essen.Weizen);
    }
}
