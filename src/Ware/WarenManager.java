package Ware;

public class WarenManager
{
    public static void main(String[] args)
    {
        Ware milchbube = new Milchpackung(4.5, 30, 0, "2.4.2025", false, "Kuh");
        milchbube.ausgeben();
    }
}
